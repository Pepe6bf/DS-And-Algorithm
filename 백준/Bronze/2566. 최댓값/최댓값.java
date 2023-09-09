import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];
        int max = Integer.MIN_VALUE;
        int x= 0;
        int y = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int n = sc.nextInt();

                if (max < n) {
                    max = n;
                    y = i + 1;
                    x = j + 1;
                }
            }
        }

        System.out.println(max + "\n" + y + " " + x);
    }
}