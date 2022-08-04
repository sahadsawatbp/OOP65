import java.util.Scanner;
class OilBill {
    public static void main(String[] args) {
        double payment;
        Scanner input = new Scanner(System.in);
        double liter = input.nextDouble();
        payment = liter * 30;
        System.out.println(payment);
    }
}
