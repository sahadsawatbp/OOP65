/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyClock_4;

/**
 *
 * @author sahad
 */

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 *
 * @author sahad
 */
public class MyFrame implements MouseListener{
    MyClock clock;
    JFrame jr;
    public MyFrame(){
        jr = new JFrame("MyClock");
        clock = new MyClock();
        Thread t = new Thread(clock);
        t.start();
        jr.addMouseListener(this);
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

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(clock.isPause){
            clock.isPause = false;
        }else{
            clock.isPause = true;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        }

    @Override
    public void mouseExited(MouseEvent e) {
        }
   
    
}
