
import java.awt.*;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sahad
 */
public class BookView {
    private JFrame fr;
    private JPanel pn1,pn2,pn3;
    private JLabel lb1,lb2,lb3;
    private JTextField tf1,tf2,tf3;
    private JComboBox cb;
    private JButton bt1,bt2,bt3,bt4,bt5;
    private String allType[] = {"General", "Computer","MathSci", "Photo"};
    public BookView(){
        fr = new JFrame();
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel();
        lb1 = new JLabel("Name");
        lb2 = new JLabel("Price");
        lb3 = new JLabel("Type");
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField("0");
        cb = new JComboBox(allType);
        bt1 = new JButton("<<<");
        bt2 = new JButton(">>>");
        bt3 = new JButton("Add");
        bt4 = new JButton("Update");
        bt5 = new JButton("Delete");
        
        pn1.setLayout(new GridLayout(3,2));
        pn1.add(lb1);pn1.add(tf1);pn1.add(lb2);pn1.add(tf2);pn1.add(lb3);pn1.add(cb);
        
        tf3.setColumns(4);
        pn2.add(bt1);pn2.add(tf3);pn2.add(bt2);
        
        pn3.add(bt3);pn3.add(bt4);pn3.add(bt5);
        
        fr.setLayout(new BorderLayout());
        fr.add(pn1, BorderLayout.NORTH);
        fr.add(pn2, BorderLayout.CENTER);
        fr.add(pn3, BorderLayout.SOUTH);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        fr.setLocationRelativeTo(null);
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

    public JPanel getPn3() {
        return pn3;
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

    public JTextField getTf3() {
        return tf3;
    }

    public JComboBox getCb() {
        return cb;
    }

    public JButton getBt1() {
        return bt1;
    }

    public JButton getBt2() {
        return bt2;
    }

    public JButton getBt3() {
        return bt3;
    }

    public JButton getBt4() {
        return bt4;
    }

    public JButton getBt5() {
        return bt5;
    }

    public String[] getAllType() {
        return allType;
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

    public void setPn3(JPanel pn3) {
        this.pn3 = pn3;
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

    public void setTf3(JTextField tf3) {
        this.tf3 = tf3;
    }

    public void setCb(JComboBox cb) {
        this.cb = cb;
    }

    public void setBt1(JButton bt1) {
        this.bt1 = bt1;
    }

    public void setBt2(JButton bt2) {
        this.bt2 = bt2;
    }

    public void setBt3(JButton bt3) {
        this.bt3 = bt3;
    }

    public void setBt4(JButton bt4) {
        this.bt4 = bt4;
    }

    public void setBt5(JButton bt5) {
        this.bt5 = bt5;
    }

    public void setAllType(String[] allType) {
        this.allType = allType;
    }
    
}
