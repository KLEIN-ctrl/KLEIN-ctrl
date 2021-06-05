import java.io.*;

public class BuffedOutputSteamTest {
    public static void main(String[] args) {
        File f=new File("world.txt");
        FileOutputStream out=null;
        BufferedOutputStream bo=null;

        try {
            bo=new BufferedOutputStream(out);//包装文件输出流
            out =new FileOutputStream(f);
            String str="天生我才必有用，千金散尽还复来";
            byte b[]=str.getBytes();
            try {
                bo.write(b);
                //使用缓冲字节输出流是，更多进行刷新操作
                bo.flush();//刷新。强制将缓冲区数据写入文件中，即使缓冲区没有写满

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            if (out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bo!=null){
                try {
                    bo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
