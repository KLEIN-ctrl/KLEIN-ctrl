import javax.swing.*;
import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        JFrame jf=new JFrame("窗体标题");
        jf.setVisible(true);
        /*
         * @Date:2021/5/11 10:18
        窗体关闭规则：
         *EXIT_ON_CLOSE隐藏窗口，并停止程序
         * DO_NOTHING_ON_CLOSE:无任何操作
         *HIDE_ON_CLOSE:隐藏窗口，但不停止程序
         * DISPOSE_ON_CLOSE:释放窗口资源
         */
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //jf.setSize(300,200);//设置窗口的大小，单位：像素
        //jf.setLocation(200,200);//设置窗口坐标，单位：像素
        jf.setBounds(200,200,300,200);//设置坐标和大小，单位：像素

      Container c=new JFrame().getContentPane();//创建一个容器对象
      c.setBackground(Color.WHITE);//设置背景--fixme：别的颜色，没有现象，都是白色
      JLabel l=new JLabel("这是一个窗口");//创建标签对象
        c.add(l);//添加组件--fixme：添加组件，不好使
        //c.remove(l)//删除组件
        c.validate();//刷新（验证容器中的组件）
       // jf.setContentPane(c);//重新载入容器

        jf.setResizable(false);//设置窗体是否可以改变大小
        System.out.println("x="+jf.getX()+"y="+jf.getY());
        

