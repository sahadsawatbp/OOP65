
import java.awt.event.*;
import java.io.*;
import javax.swing.*;


public class TextEditorController implements ActionListener{
    private TextEditorModel model;
    private TextEditorView view;
    private JFileChooser fc;
    public TextEditorController(){
        model = new TextEditorModel("");
        view = new TextEditorView();
        fc = new JFileChooser();
        init();
    }

    private void init() {
        view.getMi1().addActionListener(this);
        view.getMi2().addActionListener(this);
        view.getMi3().addActionListener(this);
        view.getMi4().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(view.getMi1())){
            view.getTa().setText("");
        }
        if(e.getSource().equals(view.getMi2())){
            fc.showOpenDialog(view.getFr());
            File f = fc.getSelectedFile();
            model.loadData(f, view);
        }
        if(e.getSource().equals(view.getMi3())){
            fc.showSaveDialog(view.getFr());
            File f = fc.getSelectedFile();
            model.saveData(f, view);
        }
        if(e.getSource().equals(view.getMi4())){
            System.exit(0);
        }
    }
    
    
}
