
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sahad
 */
public class BookAdd {
    private JFrame fr;
    private JPanel pn1,pn2;
    private JLabel lb1,lb2,lb3;
    private JTextField tf1,tf2;
    private JComboBox cb;
    private JButton bt1;
    private String allType[] = {"General", "Computer","MathSci", "Photo"};
    public BookAdd(){
        fr = new JFrame();
        pn1 = new JPanel();
        pn2 = new JPanel();
        lb1 = new JLabel("Name");
        lb2 = new JLabel("Price");
        lb3 = new JLabel("Type");
        tf1 = new JTextField("");
        tf2 = new JTextField("");
        cb = new JComboBox(allType);
        bt1 = new JButton("Insert");
        fr.setLayout(new BorderLayout());
        pn1.setLayout(new GridLayout(3,2));
        pn1.add(lb1);pn1.add(tf1);pn1.add(lb2);pn1.add(tf2);pn1.add(lb3);pn1.add(cb);
        pn2.add(bt1);
        fr.add(pn1, BorderLayout.NORTH);
        fr.add(pn2, BorderLayout.SOUTH);
        fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        fr.setLocationRelativeTo(null);
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public void setPn1(JPanel pn1) {
        this.pn1 = pn1;
    }

    public void setPn2(JPanel pn2) {
        this.pn2 = pn2;
    }

    public void setLb1(JLabel lb1) {
        this.lb1 = lb1;
    }

    public void setLb2(JLabel lb2) {
        this.lb2 = lb2;
    }

    public void setLb3(JLabel lb3) {
        this.lb3 = lb3;
    }

    public void setTf1(JTextField tf1) {
        this.tf1 = tf1;
    }

    public void setTf2(JTextField tf2) {
        this.tf2 = tf2;
    }

    public void setCb(JComboBox cb) {
        this.cb = cb;
    }

    public void setBt1(JButton bt1) {
        this.bt1 = bt1;
    }

    

    public void setAllType(String[] allType) {
        this.allType = allType;
    }

    public JFrame getFr() {
        return fr;
    }

    public JPanel getPn1() {
        return pn1;
    }

    public JPanel getPn2() {
        return pn2;
    }

    public JLabel getLb1() {
        return lb1;
    }

    public JLabel getLb2() {
        return lb2;
    }

    public JLabel getLb3() {
        return lb3;
    }

    public JTextField getTf1() {
        return tf1;
    }

    public JTextField getTf2() {
        return tf2;
    }

    public JComboBox getCb() {
        return cb;
    }

    public JButton getBt1() {
        return bt1;
    }

   

    public String[] getAllType() {
        return allType;
    }
    
}
