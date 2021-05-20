import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCheckBoxTest extends JFrame {
    public JCheckBoxTest(){
        setTitle("本窗口使用的复选框组件");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100,100,190,120);

        Container c=getContentPane();
        c.setLayout(new FlowLayout());

        JCheckBox c1=new JCheckBox("1");
        JCheckBox c2=new JCheckBox("1");
        JCheckBox c3=new JCheckBox("1");

        c.add(c1);
        c.add(c2);
        c.add(c3);

        c1.setSelected(true);//默认选中

        JButton button=new JButton("打印");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(c1.getText()+"复选框中的状态"+c1.isSelected());
                System.out.println(c2.getText()+"复选框中的状态"+c2.isSelected());
                System.out.println(c3.getText()+"复选框中的状态"+c3.isSelected());
            }
        });
        c.add(button);









        setVisible(true);
    }

    public static void main(String[] args) {
        new JCheckBoxTest();
    }
}
