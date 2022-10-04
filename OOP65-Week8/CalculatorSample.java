import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CalculatorSample implements ActionListener{
    private JFrame fr;
    private JPanel pn1,pn2;
    private JButton bn1;
    private JButton bn2;
    private JButton bn3;
    private JButton bn4;
    private JButton bn5;
    private JButton bn6;
    private JButton bn7;
    private JButton bn8;
    private JButton bn9;
    private JButton bn10;
    private JButton bn11;
    private JButton bn12;
    private JButton bn13;
    private JButton bn14;
    private JButton bn15;
    private JButton bn16;
    private JTextField tf;
    static double num1 = 0, num2 = 0, result = 0;
    static int op = 0;
    public CalculatorSample(){
        fr = new JFrame("My Calculator");
        pn1 = new JPanel();
        pn2 = new JPanel();
        bn1 = new JButton("7");
        bn2 = new JButton("8");
        bn3 = new JButton("9");
        bn4 = new JButton("+");
        bn5 = new JButton("4");
        bn6 = new JButton("5");
        bn7 = new JButton("6");
        bn8 = new JButton("-");
        bn9 = new JButton("1");
        bn10 = new JButton("2");
        bn11 = new JButton("3");
        bn12 = new JButton("x");
        bn13 = new JButton("0");
        bn14 = new JButton("c");
        bn15 = new JButton("=");
        bn16 = new JButton("/");
        tf = new JTextField();
        bn1.addActionListener(this);
        bn2.addActionListener(this);
        bn3.addActionListener(this);
        bn4.addActionListener(this);
        bn5.addActionListener(this);
        bn6.addActionListener(this);
        bn7.addActionListener(this);
        bn8.addActionListener(this);
        bn9.addActionListener(this);
        bn10.addActionListener(this);
        bn11.addActionListener(this);
        bn12.addActionListener(this);
        bn13.addActionListener(this);
        bn14.addActionListener(this);
        bn15.addActionListener(this);
        bn16.addActionListener(this);
        pn1.setLayout(new GridLayout(1, 1));
        pn1.add(tf);
        pn2.setLayout(new GridLayout(4, 4));
        pn2.add(bn1);
        pn2.add(bn2);
        pn2.add(bn3);
        pn2.add(bn4);
        pn2.add(bn5);
        pn2.add(bn6);
        pn2.add(bn7);
        pn2.add(bn8);
        pn2.add(bn9);
        pn2.add(bn10);
        pn2.add(bn11);
        pn2.add(bn12);
        pn2.add(bn13);
        pn2.add(bn14);
        pn2.add(bn15);
        pn2.add(bn16);
        fr.setLayout(new BorderLayout());
        fr.add(pn1, BorderLayout.NORTH);
        fr.add(pn2);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(bn1)){
            tf.setText(tf.getText().concat("7"));
        }
        if(ae.getSource().equals(bn2)){
            tf.setText(tf.getText().concat("8"));
        }
        if(ae.getSource().equals(bn3)){
            tf.setText(tf.getText().concat("9"));
        }
        if(ae.getSource().equals(bn5)){
            tf.setText(tf.getText().concat("4"));
        }
        if(ae.getSource().equals(bn6)){
            tf.setText(tf.getText().concat("5"));
        }
        if(ae.getSource().equals(bn7)){
            tf.setText(tf.getText().concat("6"));
        }
        if(ae.getSource().equals(bn9)){
            tf.setText(tf.getText().concat("1"));
        }
        if(ae.getSource().equals(bn10)){
            tf.setText(tf.getText().concat("2"));
        }
        if(ae.getSource().equals(bn11)){
            tf.setText(tf.getText().concat("3"));
        }
        if(ae.getSource().equals(bn13)){
            tf.setText(tf.getText().concat("0"));
        }
        if(ae.getSource().equals(bn4)){
            op = 1;
            num1 = Double.parseDouble(tf.getText());
            tf.setText("");
        }
        if(ae.getSource().equals(bn8)){
            op = 2;
            num1 = Double.parseDouble(tf.getText());
            tf.setText("");
        }
        if(ae.getSource().equals(bn12)){
            op = 3;
            num1 = Double.parseDouble(tf.getText());
            tf.setText("");
        }
        if(ae.getSource().equals(bn16)){
            op = 4;
            num1 = Double.parseDouble(tf.getText());
            tf.setText("");
        }
        if(ae.getSource().equals(bn15)){
            num2 = Double.parseDouble(tf.getText());
            switch(op){
                case 1: result = num1 + num2;
                        break;
                case 2: result = num1 - num2;
                        break;
                case 3: result = num1 * num2;
                        break;
                case 4: result = num1 / num2;
                        break;
            }
            tf.setText("" + result);
        }
        if(ae.getSource().equals(bn14)){
            tf.setText("");
        }
        
    }
    public static void main(String[] args) {
        new CalculatorSample();
    }
}