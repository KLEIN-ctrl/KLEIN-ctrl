import java.io.File;

public class FileTest_1 {
    public static void main(String[] args) {
        File file =new File("Word.txt");
        if (file.exists()){
            String name= file.getName();//获取文件的名字
            long  length= file.length();//获取文件里的长度
            boolean hidden= file.isHidden();//文件是否有隐藏文件
            System.out.println("获取文件的名字："+name);
            System.out.println("获取文件里的长度："+length);
            System.out.println("文件是否有隐藏文件："+hidden);
        }
        else{
            System.out.println("文件不存在");
        }
    }
}
