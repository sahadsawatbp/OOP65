
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sahad
 */
public class TextEditorView {
    private JFrame fr;
    private JMenuBar mb;
    private JMenu m1;
    private JMenuItem mi1,mi2,mi3,mi4;
    private JTextArea ta;
//    private JFileChooser fc;
    public TextEditorView(){
        fr = new JFrame("My Text Editor");
        mb = new JMenuBar();
        m1 = new JMenu("File");
        mi1 = new JMenuItem("New");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        ta = new JTextArea();
        mi4 = new JMenuItem("Close");
//        fc = new JFileChooser();
        mb.add(m1);
        fr.setJMenuBar(mb);
        fr.add(ta);
        m1.add(mi1);m1.add(mi2);m1.add(mi3);m1.add(mi3);m1.addSeparator();m1.add(mi4);
//        fc.showOpenDialog(mi2);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(400,400);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }
    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public void setMb(JMenuBar mb) {
        this.mb = mb;
    }

    public void setM1(JMenu m1) {
        this.m1 = m1;
    }

    public void setMi1(JMenuItem mi1) {
        this.mi1 = mi1;
    }

    public void setMi2(JMenuItem mi2) {
        this.mi2 = mi2;
    }

    public void setMi3(JMenuItem mi3) {
        this.mi3 = mi3;
    }

    public void setMi4(JMenuItem mi4) {
        this.mi4 = mi4;
    }

    public void setTa(JTextArea ta) {
        this.ta = ta;
    }

    public JFrame getFr() {
        return fr;
    }

    public JMenuBar getMb() {
        return mb;
    }

    public JMenu getM1() {
        return m1;
    }

    public JMenuItem getMi1() {
        return mi1;
    }

    public JMenuItem getMi2() {
        return mi2;
    }

    public JMenuItem getMi3() {
        return mi3;
    }

    public JMenuItem getMi4() {
        return mi4;
    }

    public JTextArea getTa() {
        return ta;
    }
    
}
