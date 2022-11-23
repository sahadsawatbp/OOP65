/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyClock_2;

import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author sahad
 */
public class MyFrame {
    public MyFrame(){
        JFrame jr = new JFrame("MyClock");
        MyClock clock = new MyClock();
        Thread t = new Thread(clock);
        t.start();
        jr.setLayout(new FlowLayout());
        jr.add(clock);
        jr.setLocationRelativeTo(null);
        jr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jr.setSize(400,200);
        jr.setVisible(true);
    }
    public static void main(String[] args) {
        new MyFrame();
    }
   
    
}
