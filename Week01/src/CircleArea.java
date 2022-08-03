import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args) {
        double area;
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        area = Math.PI * radius * radius;
        System.out.println(area);
    }
}
