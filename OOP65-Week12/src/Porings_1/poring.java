package Porings_1;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.*;
public class poring implements MouseListener,Runnable{
    Random rand = new Random();
    Point currLocation;
    private JFrame fr;
    private JLabel jl1,jl2;
    private int x,y;
    private ImageIcon poring = new ImageIcon(new ImageIcon("ro_poring.png").getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
    public poring(int count){
        fr = new JFrame();
        jl1 = new JLabel();
        jl2 = new JLabel("" + count);
        jl1.setIcon(poring);
        fr.setLayout(new FlowLayout());
        fr.add(jl1);
        fr.add(jl2);
        jl1.addMouseListener(this);
        fr.setLocation(rand.nextInt(1800),rand.nextInt(800));
        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    public void run() {
        while(true){
            try{
                if(rand.nextInt(10)>5){
                    fr.setLocation(fr.getX()-rand.nextInt(3),fr.getY()+rand.nextInt(2));
                }else{
                    fr.setLocation(fr.getX()+rand.nextInt(3),fr.getY()-rand.nextInt(2));
                }
                
            Thread.sleep(30);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) {fr.dispose();}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
}
