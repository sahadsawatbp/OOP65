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
public class Salary2 {
    public static void main(String[] args) {
        String name;
        int age, numDay1, numDay2, weight, salary = 0;
        Scanner tube = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        name = tube.nextLine();
        System.out.print("Please insert your age : ");
        age = tube.nextInt();
        System.out.print("Please insert number of working days : ");
        numDay1 = tube.nextInt();
        System.out.print("Please insert number of absent days : ");
        numDay2 = tube.nextInt();
        System.out.print("Please insert your body weight : ");
        weight = tube.nextInt();
        if((age >= 21) && (age<= 30)) {salary = (numDay1 * 300) - (numDay2 * 50);}
        else if ((age <= 31) && (age<= 40)) {salary = (numDay1 * 500) - (numDay2 * 50);}
        else if ((age <= 41) && (age<= 50)) {salary = (numDay1 * 1000) - (numDay2 * 25);}
        else if ((age <= 51) && (age<= 60)) {salary = (numDay1 * 3000);}
        System.out.println("Hi, "+name);
        System.out.println("Your salary is "+salary+" Baht");
        if((weight >= 10) && (weight <= 60)){salary = salary + 5000;}
        else if((weight >= 61) && (weight <= 90)){salary = weight + (5000 - ((weight-60) * 10));}
        System.out.println("Your salary and bonus is "+salary+" Baht");
    }
}
