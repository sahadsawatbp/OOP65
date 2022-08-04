import java.util.Scanner;
public class SquareArea {
    public static void main(String[] args) {
        double area;
        Scanner input = new Scanner(System.in);
        double lengthSquare = input.nextDouble();
        area = lengthSquare * lengthSquare;
        System.out.println(area);
    }
}
