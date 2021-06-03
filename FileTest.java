import java.io.File;

public class FileTest {

    public static void main(String[] args) {
        File file=new File("Word.txt");
        if (file.exists()){//如果该文件存在
            file.delete();
            System.out.println("文件已删除");
        }
        else
        {
            try{
                file.createNewFile();
                System.out.println("文件已创建");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
