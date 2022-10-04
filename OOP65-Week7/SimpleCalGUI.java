import java.awt.*;
import javax.swing.*;
public class SimpleCalGUI {
    private JFrame fr;
    private JPanel pn1;
    private JPanel pn2;
    private JPanel pn3;
    private JPanel pn4;
    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    private JButton bt1;
    private JButton bt2;
    private JButton bt3;
    private JButton bt4;
    public SimpleCalGUI(){
        fr = new JFrame("Calculator");
        fr.setLayout(new GridLayout(4, 1));
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel();
        pn4 = new JPanel();
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        bt1 = new JButton("Plus");
        bt2 = new JButton("Minus");
        bt3 = new JButton("Multiple");
        bt4 = new JButton("Divide");
        pn1.setLayout(new GridLayout(1,1));
        pn1.add(tf1);
        pn2.setLayout(new GridLayout(1,1));
        pn2.add(tf2);
        pn3.setLayout(new FlowLayout());
        pn3.add(bt1);
        pn3.add(bt2);
        pn3.add(bt3);
        pn3.add(bt4);
        pn4.setLayout(new GridLayout(1,1));
        pn4.add(tf3);
        fr.add(pn1);
        fr.add(pn2);
        fr.add(pn3);
        fr.add(pn4);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
}
