package Porings_1;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class PoringConstructor implements ActionListener{
    private JFrame fr;
    private JButton jb;
    private int count;
    public PoringConstructor(){
        fr = new JFrame();
        jb = new JButton("Add");
        fr.setLayout(new FlowLayout());
        fr.add(jb);
        jb.addActionListener(this);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLocationRelativeTo(null);
        fr.pack();
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(jb)){
            count++;
            poring p = new poring(count);
            Thread t = new Thread(p);
            t.start();
        }
    }
}
