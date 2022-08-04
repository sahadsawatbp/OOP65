import java.util.Scanner;
public class ConvertTime {
    public static void main(String[] args) {
        int sec;
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Hours : ");
        int hour = input1.nextInt();
        System.out.print("Mins : "); 
        int min = input2.nextInt();
        sec = (hour * 60 * 60) + (min * 60);
        System.out.println("Secs : " + sec);
    }
}
