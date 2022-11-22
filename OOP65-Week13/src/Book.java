
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sahad
 */
public class Book implements Serializable{
    private String name;
    private double price;
    private String type;
    public Book(){
        name = "";
        price = 0;
        type = "";
    }
    public Book(String name,double price,String type){
        this.name = name;
        this.price = price;
        this.type = type;
    }
}
