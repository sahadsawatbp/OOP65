/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB203_23
 */
import java.util.Scanner;
public class bankSalary {
    public static void main(String[] args) {
        double money = 0.0;
        String typeSelect;
        Scanner nc = new Scanner(System.in);
        Scanner nc1 = new Scanner(System.in);
        System.out.print("Input your money : ");
        money = nc.nextDouble();
        System.out.print("Input your accout type(Please type A B C or X in uppercase) : ");
        typeSelect = nc1.nextLine();   
        switch(typeSelect){
            case "A":
                money *= 1.015;
                break;
            case "B":
                money *= 1.02;
                break;
            case "C":
                money *= 1.015;
                break;
            case "X":
                money *= 1.05;
                break;
        }
        System.out.println("Your total money in one year = "+money);
    }
}