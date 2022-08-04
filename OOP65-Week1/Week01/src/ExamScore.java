import java.util.Scanner;
public class ExamScore {
    public static void main(String[] args) {
        double avgScore;
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();
        avgScore = (x + y + z)/3;
        System.out.println(avgScore);
    }
}
