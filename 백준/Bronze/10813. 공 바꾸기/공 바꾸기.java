import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] bucket = new int[N + 1];
        for (int index = 1; index <= N; index++) {
            bucket[index] = index;
        }

        for (int m = 0; m < M; m++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            int temp = bucket[i];
            bucket[i] = bucket[j];
            bucket[j] = temp;
        }

        for (int index = 1; index <= N; index++) {
            System.out.print(bucket[index] + " ");
        }
    }
}