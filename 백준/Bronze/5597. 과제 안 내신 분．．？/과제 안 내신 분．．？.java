import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] students = new int[31];

        for (int i = 1; i <= 28; i++) {
            int n = sc.nextInt();
            students[n] = 1;
        }

        for (int s = 1; s <= 30; s++) {
            if (students[s] == 0) System.out.println(s);
        }
    }
}