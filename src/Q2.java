import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for (int i = 3; i > 0; i--) {
            System.out.print("Enter The Number = ");
            int Input = scn.nextInt();
            if (Input % 2 == 0) {
                System.out.println(Input + " is Even Number");
            } else {
                System.out.println(Input + " is Odd Number");
            }
        }
    }
}
