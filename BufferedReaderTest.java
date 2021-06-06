import java.io.*;

//谁先创建的，谁后关闭
public class BufferedReaderTest {
    public static void main(String[] args) {
        File f=new File("world.txt");
        FileWriter fw=null;
        BufferedWriter bw=null;

        try {
            fw=new FileWriter(f);
            bw=new BufferedWriter(fw);
            String str="世界很大";
            String str1="我想去看看";
            bw.write(str);//第一行的数据
            bw.newLine();//创建一新行
            bw.write(str1);//第二行的数据
            bw.flush();//刷新
        } catch (IOException e) {
            e.printStackTrace();
        }finally{//要注意流的关闭顺序，先创建后关闭
            if (bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        FileReader fr=null;
        BufferedReader br=null;

        try {
            fr=new FileReader(f);
            br=new BufferedReader(fr);
           String tmp=null;
           int i=1;
           while((tmp=br.readLine())!=null){
               System.out.println("第"+i+"行:"+tmp);
               i++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if (br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
