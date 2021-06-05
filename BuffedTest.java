mport java.io.*;

//TODO：提高输入流的效率
public class BuffedTest {
    public static void main(String[] args) {
        File f=new File("E:\\Users\\98795\\javac\\untitled");
        BufferedInputStream b1=null;//大大的提高了运行效率

        FileInputStream in=null;//创建实例化的对象，文件的输入流
        long star=System.currentTimeMillis();//获取字节流开始时的毫秒数

        try {//抛出异常

            in=new FileInputStream(f);
            byte b[]=new byte[1024];//读取文件的字
            b1=new BufferedInputStream(in);//若要使用缓冲区的话，需要用bi来包装in。
            while (b1.read(b)!=-1){

            }

            long end=System.currentTimeMillis();
            //获取字节流的结束时的毫秒数
            System.out.println("获取字节流的毫秒数："+(end-star));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        finally{
            if (in!=null){//关闭流
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (b1!=null){
                try {
                    b1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            }
        }


    }
