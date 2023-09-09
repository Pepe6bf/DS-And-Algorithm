import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int x = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();

            if (n < x) System.out.print(n + " ");
        }
    }
}