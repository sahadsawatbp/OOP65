
import java.io.*;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sahad
 */
public class BookModel {
    private Book book;
    private ArrayList bookData = new ArrayList();
    public BookModel(){
        book = new Book("",0,"");
    }
    public boolean loadData(){
        File f = new File("Book.dat");
        if(f.exists()){
            try(FileInputStream fin = new FileInputStream("Book.dat");
                ObjectInputStream in = new ObjectInputStream(fin)){
                bookData = (ArrayList) in.readObject();
                return true;
            }catch(Exception e){
                return false;
            }
        }
        return false;
    }
    public boolean saveData(){
        try(FileOutputStream fOut = new FileOutputStream("Book.dat");
            ObjectOutputStream oout = new ObjectOutputStream(fOut);) {
                oout.writeObject(bookData);
                return true;
        } catch (Exception e) {
            return false;
        }
    }
    public void addBook(Book book){
        if(!bookData.contains(book)){
            bookData.add(book);
        }
    }
   
    public Book getBook() {
        return book;
    }

    public ArrayList getBookData() {
        return bookData;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setBookData(ArrayList bookData) {
        this.bookData = bookData;
    }
    
}
