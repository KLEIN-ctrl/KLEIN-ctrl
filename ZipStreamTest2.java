import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

//TODO；解压缩文件。（用的是输入流）进行解压
public class ZipSteamTest2 {
    static void decompression(){
        File dir=new File("");
        File source=new File("");
        byte buf[]=new byte[1024];

        ZipEntry entry=null;

        try(FileInputStream fis=new FileInputStream(source);
            ZipInputStream zis=new ZipInputStream(fis)) {
            while (true){
                entry = zis.getNextEntry();//获取一个条目
                if (entry==null){
                    break;
                }
                if (entry.isDirectory()){
                    continue;
                }
                File f=new File(dir,entry.getName());
                if (!f.getParentFile().exists()){//如果解压文件夹不存在
                    f.getParentFile().mkdirs();//那么创建文件夹
                }
                int count=-1;
                FileOutputStream fos=new FileOutputStream(f);
                while ((count= zis.read(buf))!=-1){
                    fos.write(buf,0,count);
                    fos.flush();
                }
                fos.close();
                zis.closeEntry();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        decompression();
    }
}
//getParentFile():父目录
