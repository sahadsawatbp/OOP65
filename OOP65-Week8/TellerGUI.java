import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class TellerGUI extends Account implements ActionListener {
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
    static double balance = 0,amount = 0;
    String name = "";
    public TellerGUI(){
        super(6000,"");
        
        fr = new JFrame("Teller GUI");
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel();
        lb1 = new JLabel("Balance");
        lb2 = new JLabel("Amount");
        tf1 = new JTextField(""+super.getBalance());
        tf2 = new JTextField();
        bt1 = new JButton("Deposit");
        bt2 = new JButton("Withdraw");
        bt3 = new JButton("Exit");
        //Input
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
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
    public static void main(String[] args) {
        new TellerGUI();
    }
    public void actionPerformed(ActionEvent e) {
        balance = Double.parseDouble(tf1.getText());
        amount = Double.parseDouble(tf2.getText());
        if(e.getSource().equals(bt1)){
            super.balance += amount;
            tf1.setText(""+super.balance);
        }
        if(e.getSource().equals(bt2)){
            if(super.balance - amount < 0){
                tf1.setText(""+super.balance);
            }else{
                super.balance -= amount;
                tf1.setText(""+super.balance);
            }
        }
        if(e.getSource().equals(bt3)){
            System.exit(0);
        }
    }
}

