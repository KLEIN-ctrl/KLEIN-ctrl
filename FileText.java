import java.io.*;

//TODO:Writer(输出）与Reader（输入）类
public class FileText {
    public static void main(String[] args) throws IOException {
        File file=new File("world.txt");

        FileWriter fw=null;
        String str="天行建，自强不息，地势坤，厚徳载物.";

        try {//抛出异常
            fw=new FileWriter(file,true);//append:true在源文件中追加字符串。
            fw.write(str);//将fw输入到文本文档（上述的world.txt)里
        }catch (Exception e){
            e.printStackTrace();
        }finally {//解释为什么fw要给他null值
            if (fw!=null){//抛出异常
                try {
                    fw.close();
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        }
        FileReader  fr=null;
        try {
            fr=new FileReader(file);
            char ch[]=new char[1024];//缓冲区
            int count;//已经读出的字符串
            while ((count = fr.read(ch)) == -1){//一直能读出来，输出
                // 循环读取文件中的数据，直到所有字符读完
                System.out.println("文件中的内容："+new String(ch,0,count));//去掉空格
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
