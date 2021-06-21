import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

//TODO:压缩文件：本节将压缩管理文件内读取某个文件，要先找到对应该文件内容写入Zip文件内，必须写入对应该文件的目录进入点，（从他可知该文件在ZIP位置啊）才能读取这个文件的内容。
//ZipEntry类产生的对象，是用来代表一个ZIP的压缩文件的进入点、、、ZipInputStream类是用来读取ZIP压缩格式的文件（所支持的包括已经压缩及未压缩的进入点、、、、、ZipOutputStream类是用来写出。。。。而且。。。。。
public class  ZipStreamTest {
    static void compress(){

   File source=new File("");//创建源      文件
    File target=new File("");//创建压缩包


        try(FileOutputStream fos=new FileOutputStream(target);
            ZipOutputStream zos=new ZipOutputStream(fos)
        ){
            if (source.isDirectory()){//是否为文件夹
                for (File file:source.listFiles())//listFile :遍历文件夹中的所有文件
                {
                    addEntry(zos,"",file);
                }
            }
            else{//否则是文件
                addEntry(zos,"",source);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //zos:压缩流 。base:文件在压缩包里的路径，source：被压缩的文件
    //创建条目
    static  void addEntry(ZipOutputStream zos,String base,File source){
        if (source.isDirectory()){
            //是否为文件夹
            for (File f:source.listFiles())//遍历文件夹中所有的文件
            {
                addEntry(zos,base+source.getName()+File.separator,f);//设置条目，压缩流，路径+文件夹的名字+文件的分离符号（当前系统的）
            }
        }
        else {
            //否则是文件
            byte but[]=new byte[1024];
            try(FileInputStream fis=new FileInputStream(source)) {
                int count=-1;
                //在压缩包中添加新的条目
                zos.putNextEntry(new ZipEntry(base+source.getName()));
                while ((count = fis.read(but))!=-1){
                    zos.write(but,0,count);
                    zos.flush();

                }
                zos.closeEntry();//关闭条目
            }catch (Exception e){
               e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        compress();
    }
}
