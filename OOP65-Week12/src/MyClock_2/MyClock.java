
package MyClock_2;

import java.awt.*;
import java.util.Calendar;
import javax.swing.JLabel;
public class MyClock extends JLabel implements Runnable{
    private Calendar d;
    @Override
    public void run() {
        while(true){
            try{
                Calendar d = Calendar.getInstance();
                int sec = d.get(Calendar.SECOND);
                int min = d.get(Calendar.MINUTE);
                int hour = d.get(Calendar.HOUR_OF_DAY);
                this.setFont(new Font("Verdana", Font.PLAIN, 72));
                this.setText(String.format("%02d:%02d:%02d", hour,min,sec));
                Thread.sleep(1);
            }catch(Exception e){
                System.out.println(e);
            }
            
        }
    }
    
}
