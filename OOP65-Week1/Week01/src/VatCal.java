import java.util.Scanner;
public class VatCal {
    public static void main(String[] args) {
        double price;
        Scanner input = new Scanner(System.in);
        double initial = input.nextDouble();
        price = initial * 1.07;
        System.out.println(price);
    }
}
