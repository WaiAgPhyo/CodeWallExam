import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter The Array Length : ");
        int ary = scn.nextInt();
        int Newary[] = new int[ary];
        for (int i = Newary.length - 1; i >= 0; i--) {
            Scanner scnner = new Scanner(System.in);
            System.out.print("Enter The Number = ");
            Newary[i] = scnner.nextInt();
            int  a= Newary[0];
            int b = Newary[1];
            int c = Newary[2];
            System.out.println(a+b+c);
        }
    }
}
