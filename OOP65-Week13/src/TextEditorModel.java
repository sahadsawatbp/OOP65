
import java.io.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sahad
 */
public class TextEditorModel {
    private String text;
    private TextEditorView view;
    public TextEditorModel(String text){
        this.text = text;
    }
    public boolean loadData(File f,TextEditorView view){
        if(f.exists()){
            try(FileInputStream fin = new FileInputStream(f);
                ObjectInputStream in = new ObjectInputStream(fin)){
                text = (String) in.readObject();
                view.getTa().setText(text);
                return true;
            }catch(Exception i){
                return false;
            }
        }
        return false;
    }
    public boolean saveData(File f, TextEditorView view){
        try(FileOutputStream fOut = new FileOutputStream(f);
            ObjectOutputStream oout = new ObjectOutputStream(fOut);){
            oout.writeObject(view.getTa().getText());
            return true;
        }catch(Exception i){
            return false;
        }
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
   
}
