import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class App01 implements ActionListener{
    private JFrame fr;
    private JPanel p1,p2;
    private JTextField txt1,txt2,txt3;
    private JButton btn1,btn2,btn3,btn4;
    static double num1=0,num2=0,result=0;
    public App01(){
        fr = new JFrame("เครื่องคิดเลข");
        p1 = new JPanel();
        p2 = new JPanel();
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        btn1 = new JButton("+");
        btn2 = new JButton("-");
        btn3 = new JButton("x");
        btn4 = new JButton("%");

       // Add Listener
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        // Set Layout
        p1.setLayout(new GridLayout(4,1));
        p1.add(txt1);
        p1.add(txt2);
        p1.add(p2);
        p1.add(txt3);
        p2.setLayout(new FlowLayout());
        p2.add(btn1);
        p2.add(btn2);
        p2.add(btn3);
        p2.add(btn4);
        fr. getContentPane().add(p1);
        // Set JFrame Property
        fr.setFont(new Font("TimesRoman",Font.BOLD,60));
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new App01();
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        double num1 = Double.parseDouble(txt1.getText());
        double num2 = Double.parseDouble(txt2.getText());
        double result = 0;
        if(ae.getSource().equals(btn1)){
            result = num1 + num2;
            txt3.setText("" + result);
        }else if(ae.getSource().equals(btn2)){
            result = num1 - num2;
            txt3.setText("" + result);
        }else if(ae.getSource().equals(btn3)){
            result = num1 * num2;
            txt3.setText("" + result);
        }else if(ae.getSource().equals(btn4)){
            result = num1 / num2;
            txt3.setText("" + result);
        }
    }
}

