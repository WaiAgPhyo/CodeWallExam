import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int numbers[][] = {{1,2,3,4,5},{5,4,3,2,1},{7,8,9,1,5,7,7}};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(Arrays.toString(numbers[i]));
        }
    }
}
