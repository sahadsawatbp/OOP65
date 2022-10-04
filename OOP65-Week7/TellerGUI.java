import java.awt.*;
import javax.swing.*;
public class TellerGUI {
    private JFrame fr;
    private JPanel pn1;
    private JPanel pn2;
    private JPanel pn3;
    private JLabel lb1;
    private JLabel lb2;
    private JTextField tf1;
    private JTextField tf2;
    private JButton bt1;
    private JButton bt2;
    private JButton bt3;
    public TellerGUI(){
        fr = new JFrame("Teller GUI");
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel();
        lb1 = new JLabel("Balance");
        lb2 = new JLabel("Amount");
        tf1 = new JTextField("6000");
        tf2 = new JTextField();
        bt1 = new JButton("Deposit");
        bt2 = new JButton("Withdraw");
        bt3 = new JButton("Exit");
        tf1.setEditable(false);
        pn1.setLayout(new GridLayout(1, 2));
        pn2.setLayout(new GridLayout(1, 2));
        pn1.add(lb1);
        pn1.add(tf1);
        pn2.add(lb2);
        pn2.add(tf2);
        pn3.add(bt1);
        pn3.add(bt2);
        pn3.add(bt3);
        fr.setLayout(new GridLayout(4, 1));
        fr.add(pn1);
        fr.add(pn2);
        fr.add(pn3);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        fr.pack();
        fr.setVisible(true);
        
        
    }
}
