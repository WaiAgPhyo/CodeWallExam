import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter The Array Length : ");
        int ary = scn.nextInt();
        int Newary[] = new int[ary];
        for (int i = 0; i < Newary.length; i++) {
            Scanner scnner = new Scanner(System.in);
            System.out.print("Enter The Number = ");
            Newary[i] = scnner.nextInt();
        }
    }
}
