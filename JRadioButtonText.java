//TODO:创建按钮组，才能保证是单选的效果。
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButtonText  extends JFrame {
    public JRadioButtonText(){
       setTitle("本窗口单选按钮");
       setBounds(100,100,110,200);
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container c=getContentPane();
        c.setLayout(new FlowLayout());

        JRadioButton left=new JRadioButton("向左走");
        JRadioButton right=new JRadioButton("向右走");

        c.add(left);
        c.add(right);

        ButtonGroup group=new ButtonGroup();//按钮组
        group.add(left);//把单选按钮放到按钮组中
        group.add(right);//自动取消，在同一个按钮组里只能选择其中的一个按钮

        left.setSelected(true);//默认选中（状态）

        JButton button=new JButton("打印");
        button.addActionListener(new ActionListener() {//添加监听事件
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(left.getText()+"按钮选中的状态"+left.isSelected());//
                System.out.println(right.getText()+"按钮选中的状态"+right.isSelected());
                group.clearSelection();//按钮清空选项
            }
        });

        c.add(button);


        setVisible(true);

    }

    public static void main(String[] args) {
        new JRadioButtonText();
    }
}
