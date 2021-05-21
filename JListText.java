//TODO:列表框

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION;
import static javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION;


public class JlistText extends JFrame {
    public JlistText (){
        setBounds(100,100,217,167);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(null);

        String item[]={"元素1","元素2","元素3","元素4","元素5","元素6","元素7","元素8"};
      //  JList <String>jl=new JList<>( item);


        DefaultListModel<String>model=new DefaultListModel<>();//列表框数据模型
        for (String tmp:item){
            model.addElement(tmp);//向数据模型添加元素
        }
        JList<String>jl=new JList<>();
        model.addElement("添加元素");//向数据模型中添加新的元素
        jl.setModel(model);//列表载入数据模型
        jl.setBounds(10,10,100,100);

         /*

        SINGLE_SELECTION:单选
        MULTIPLE_INTERVAL_SELECTION：随便选
        SINGLE_INTERVAL_SELECTION:只能连续选择相邻的元素

         */


        jl.setSelectionMode(MULTIPLE_INTERVAL_SELECTION);
        JScrollPane js=new JScrollPane(jl);//为列表框添加滚动条
        js.setBounds(10,10,100,100);
        c.add(js);

        JButton btn=new JButton("确认");
        btn.setBounds(120,90,70,25);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取的列表框中选择所有元素
                java.util.List<String> values= jl.getSelectedValuesList();
                for(String tmp:values){
                    System.out.println(tmp);
                }
                System.out.println("----end----");
            }
        });
        c.add(btn);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JlistText();
    }
}
