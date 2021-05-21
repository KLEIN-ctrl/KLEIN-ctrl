//TODO：下拉框
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBoxModelText extends JFrame {
    public JComboBoxModelText(){
        setTitle("本窗口使用的是下拉列表");
        setBounds(100,100,190,120);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container c=getContentPane();
        c.setLayout(null);

       // 方式一：
        // JComboBox<String> comboBox=new JComboBox<>();
       // comboBox.addItem("身份证");//向下拉列表添加数据
       // comboBox.addItem("学生证");
       // comboBox.addItem("工作证");

      // 方式二：
        // String items[]={"数组元素1","数组元素2","数组元素3"};
       // JComboBox<String> comboBox=new JComboBox<>(items);//使用String添加下拉列表元素

        JComboBox<String> comboBox=new JComboBox<>();
        String items[]={"身份证","学生证","军人证"};
        ComboBoxModel cm=new DefaultComboBoxModel<>(items);//创建下拉列表模型
        comboBox.setModel(cm);//向列表中添加的数据模型
        comboBox.setBounds(10,10,80,21);//设置坐标和大小

        JButton btn=new JButton("打印");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("选中的索引："+comboBox.getSelectedIndex());//获取选中的索引
                System.out.println("选中的值:"+comboBox.getSelectedItem());//获取选中的值
            }
        });

         btn.setBounds(100,10,60,20);
        c.add(btn);

        comboBox.setEditable(false);//是否可以编辑下拉列表
        c.add(comboBox);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JComboBoxModelText();
    }
}
