/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyClock_3;

/**
 *
 * @author sahad
 */
import java.awt.*;
import javax.swing.JLabel;
public class MyClock extends JLabel implements Runnable{
    private int time,sec,min,hour;
    @Override
    public void run() {
        while(true){
            try{
                int sec = time%60;
                int min = (time/60)%60;
                int hour = (time/3600)%24;
                this.setFont(new Font("Verdana", Font.PLAIN, 72));
                this.setText(String.format("%02d:%02d:%02d", hour,min,sec));
                Thread.sleep(1000);
                time++;
            }catch(Exception e){
                System.out.println(e);
            }
            
        }
    }
    
}
