import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            max = Math.max(max, n);
            min = Math.min(min, n);
        }

        System.out.println(min + " " + max);
    }
}