
import java.awt.event.*;

import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sahad
 */
public class BookController implements ActionListener,WindowListener{
    private BookView view;
    private BookAdd add;
    private BookModel model;
    private Book book;
    private int index;
    public BookController(){
        view = new BookView();
        model = new BookModel();
        index = Integer.parseInt(view.getTf3().getText());
        init();
    }
    public void init(){
        view.getBt1().addActionListener(this);
        view.getBt2().addActionListener(this);
        view.getBt3().addActionListener(this);
        view.getBt4().addActionListener(this);
        view.getBt5().addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(view.getBt1())){
            
        }
        if(e.getSource().equals(view.getBt2())){
            
        }
        if(e.getSource().equals(view.getBt3())){
            add = new BookAdd();
            add.getFr().setLocation(view.getFr().getX() - view.getFr().getWidth()/2, view.getFr().getY() - (view.getFr().getHeight()/2));
            add.getBt1().addActionListener(this);
        }
        if(e.getSource().equals(add.getBt1())){
            book = new Book(add.getTf1().getText(), Double.parseDouble(add.getTf2().getText()), (String)add.getCb().getSelectedItem());
            model.addBook(book);
            JOptionPane.showMessageDialog(null, "Done it.", "",JOptionPane.PLAIN_MESSAGE);
            add.getFr().dispose();
            }
        if(e.getSource().equals(view.getBt4())){
            model.getBookData().set(index, new Book(view.getTf1().getText(),Double.parseDouble(view.getTf2().getText()),(String)view.getCb().getSelectedItem()));
            JOptionPane.showMessageDialog(null, "Done it.", "",JOptionPane.PLAIN_MESSAGE);
        }
        if(e.getSource().equals(view.getBt5())){
            
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        model.loadData();
    }

    @Override
    public void windowClosing(WindowEvent e) {model.saveData();}
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}
    
}
