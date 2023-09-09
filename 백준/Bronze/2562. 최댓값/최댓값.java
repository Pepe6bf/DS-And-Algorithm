import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 1; i <= 9; i++) {
            int n = sc.nextInt();

            if (max < n) {
                max = n;
                index = i;
            }
        }

        System.out.println(max + "\n" + index);
    }
}