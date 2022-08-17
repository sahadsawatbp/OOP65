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
public class Salary {
    public static void main(String[] args) {
        double salary;
        Scanner tube = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        salary = tube.nextDouble();
        if(salary > 50000) {salary = salary * 0.10;}
        else{ salary = salary * 0.05;}
        System.out.println("Your salary : "+salary);
    }
}
