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
public class Sample {
    public static void main(String[] args) {
        Scanner tube = new Scanner(System.in);
        int number = tube.nextInt();
        System.out.print(number);
        for(int sign = 1; sign <= number;sign++) {
            System.out.print("=");
        }
        System.out.println('+'); 
    }
}
