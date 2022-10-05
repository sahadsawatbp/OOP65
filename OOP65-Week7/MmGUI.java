import java.awt.*;
import javax.swing.*;
public class MmGUI {
    private JFrame fr;
    private JMenuBar mb;
    private JMenu m1, m2, m3, ms1 ;
    private JMenuItem mi2, mi3, mi4, msi1, msi2;
    private JDesktopPane desktopPane;
    private JInternalFrame frame1, frame2, frame3;
    public MmGUI(){
        fr = new JFrame("SubMenuItem Demo");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        desktopPane = new JDesktopPane();
        frame1 = new JInternalFrame("Application01",true,true,true,true);
        frame2 = new JInternalFrame("Application02",true,true,true,true);
        frame3 = new JInternalFrame("Application03",true,true,true,true);
        frame1.setSize(400,200);
        frame1.setVisible(true);
        frame2.setSize(200,400);
        frame2.setVisible(true);
        frame3.setSize(200,200);
        frame3.setVisible(true);
        frame1.setLocation(0, 200);
        frame2.setLocation(300, 200);
        frame3.setLocation(600, 200);
        desktopPane.add(frame1);
        desktopPane.add(frame2);
        desktopPane.add(frame3);
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        fr.setJMenuBar(mb);
        mb.add(m1); 
        mb.add(m2); 
        mb.add(m3);
        ms1 = new JMenu("New");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Exit");
        m1.add(ms1);
        m1.add(mi2);
        m1.addSeparator();
        m1.add(mi3);
        m1.addSeparator();
        m1.add(mi4);
        msi1 = new JMenuItem("Window");
        msi2 = new JMenuItem("Message");
        ms1.add(msi1);
        ms1.addSeparator();
        ms1.add(msi2);
        fr.add(desktopPane, BorderLayout.CENTER);
        fr.setMinimumSize(new Dimension(300,300));
        fr.setSize(1080,800);
        fr.setVisible(true);
        
    }
    public static void main(String[] args) {
       try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
            e.printStackTrace();
            }
            SwingUtilities.invokeLater(() -> { MmGUI frame = new MmGUI(); });
    }
}
