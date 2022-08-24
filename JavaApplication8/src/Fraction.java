/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB203_41
 */
public class Fraction {
    public int topN;
    public int btmN;
    public boolean myEquals(Fraction x){
        double num1 = topN, num2 = btmN, num3 = x.topN, num4 = x.btmN;
        return Math.abs(num1/num2-num3/num4) < 0.00001;
    }
    public int GCD(int a, int b){
        if (b==0) return a;
        return GCD(b,a%b);
    }
    public void LowestTermFrac(){
        int d;
        d = GCD(topN,btmN);
        topN = topN / d;
        btmN = btmN / d;
    }
    public String toFloat(){
        double topN2 = topN, btmN2 = btmN;
        return Double.toString(topN2/btmN2);
    }
    public String toFraction(){
        return topN+"/"+btmN;
    }
    public void addFraction(Fraction f){
        if (btmN == f.btmN){
            topN = topN+f.topN;
        } else{
            topN = topN*f.btmN+f.topN*btmN;
            btmN = btmN*f.btmN;
        }
    }
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        f1.topN = 2;
        f1.btmN = 5;
        Fraction f2 = new Fraction();
        f2.topN = 3;
        f2.btmN = 7;
        System.out.println("before " + f1.toFraction());
        System.out.println("before " + f1.toFloat());
        f1.addFraction(f2);
        System.out.println("after " + f1.toFraction());
        System.out.println("after " + f1.toFloat());
//        Fraction f1 = new Fraction();
//        f1.topN = 1;
//        f1.btmN = 3;
//        Fraction f2 = new Fraction();
//        f2.topN = 4;
//        f2.btmN = 16;
//        Fraction f3 = new Fraction();
//        f3.topN = 5;
//        f3.btmN = 15;
//
//        System.out.println(f1.toFloat());
//        System.out.println(f2.toFloat());
//        System.out.println(f3.toFloat());
//        System.out.println("f1 is equal to f2 >> " + f1.myEquals(f2));
//        System.out.println("f1 is equal to f3 >> " + f1.myEquals(f3));
//        System.out.println("Before : " + f2.toFraction());
//        f2.LowestTermFrac();
//        System.out.println("After : " + f2.toFraction());
    }
}
