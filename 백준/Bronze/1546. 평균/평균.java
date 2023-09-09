import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int max = Integer.MIN_VALUE;
        double result = 0;

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            max = Math.max(n, max);
            result += n;
        }

        result = (result / max * 100) / N;
        
        System.out.println(result);
    }
}