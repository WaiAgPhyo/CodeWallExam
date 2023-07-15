import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter The Array Length : ");
        int ary = scn.nextInt();
        int Newary[] = new int[ary];
        for (int i : Newary) {
            Scanner scnner = new Scanner(System.in);
            System.out.print("Enter The Number = ");
            Newary[i] = scnner.nextInt();
            if (Newary[i] % 3 == 0){
                System.out.println(Newary[i]);
            }
        }
    }
}
