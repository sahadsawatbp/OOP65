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
public class tower {
    public static void main(String[] args) {
        int height;
        Scanner sc = new Scanner(System.in);
        System.out.print("กรุณาระยุความสูงตึก : ");
        height = sc.nextInt();
        for(int x=0;x<height;x++){
            System.out.println("#-#-#-#-#");
        }
    }
}
