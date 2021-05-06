//TODO:此类，是运用了throw的用法，但是自定义异常（NoHumansException)
import javax.swing.*;
import java.io.PrintWriter;

public class Demo {
    public static void main(String[] args) {
        String playerType="monkey";
        //使用try~catch语句捕获异常
        try{

            if (! playerType.equals("humans")){
                throw new NonHumansException("有非人类选手："+playerType);
            }//为什么是飘红的？因为还是要对异常处理错误
            System.out.println("开始比赛");
        }catch (NonHumansException e){
            e.printStackTrace();
        }
    }


}


public class NonHumansException  extends  Exception{//自己创建一个API文库没有的异常
    /*
     * @Date:2021/5/4 23:48
     *语法：
     * class 自定义异常类 extends  已有的异常类{..}
     */
    String message;
    public NonHumansException (String messacge){
        super(messacge);
        this.message=messacge;

    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
        JOptionPane.showMessageDialog(null ,message,"发生异常",JOptionPane.ERROR_MESSAGE);
        //弹出一个对话框
    }

}

