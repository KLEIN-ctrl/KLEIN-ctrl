import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonTest extends JFrame {
    public JButtonTest(){
        setTitle("本窗口使用不同按钮");
        setBounds(100,100,500,500);
        setLayout(new GridLayout(3,2,5,5));
        Container c=getContentPane();

        JButton btn[]=new JButton[6];
        for (int i=0;i<btn.length;i++){
            btn[i]=new JButton();
            c.add(btn[i]);
        }
        btn[0].setText("不可用");
        btn[0].setEnabled(false);//设置按钮不可用，无法使用。

        btn[1].setText("背景有颜色");
        btn[1].setBackground(Color.YELLOW);//设置背景颜色，或者再这里说，给按钮添加背景

        btn[2].setText("无边框");
        btn[2].setBorderPainted(false);//不显示边框

        btn[3].setText("有边框");
        btn[3].setBorder(BorderFactory.createLineBorder(Color.red));//显示线边框为红色

        Icon icon=new ImageIcon("src/54.png");
        btn[4].setIcon(icon);//给按钮设置图片
        btn[4].setMaximumSize(new Dimension(50,90));
        btn[4].setToolTipText("图片按钮");//鼠标悬停提示

        btn[5].setText("可以点击");
        btn[5].addActionListener(new ActionListener() {//添加监控事件

            public void actionPerformed(ActionEvent e) {//监听触发的方法
                JOptionPane.showMessageDialog(JButtonTest.this,"点击按钮");
            }
        });


        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JButtonTest();


    }
}

