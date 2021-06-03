//TODO:FileInputStream与FileOutputStream类
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileTest_2 {
    public static void main(String[] args) {
        File file =new File("Word.txt");
  try {//如果没有给他抛出，有异常，（未报告异常错误）
      FileOutputStream out=new FileOutputStream(file);
      byte buy[]="我有朋友叫老王。".getBytes();
      out.write(buy);
      out.close();
  }catch (Exception e){
      e.printStackTrace();
  }
  try{

      FileInputStream in=new FileInputStream(file);
      byte bte[]=new byte[1024];
      int len=in.read(bte);
      System.out.println("文件中的信息是："+new String(bte,0,len));
      in.close();
  }catch (Exception e){
      e.printStackTrace();
  }
    }
}
