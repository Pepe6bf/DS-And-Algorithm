/**
https://succulent-bottle-ad0.notion.site/1546-d420438cddef408ea4bdd98bd066f667
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = Integer.MIN_VALUE;
        double result = 0;

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();

            M = (M < n) ? n : M;
            result += n;
        }
            
        result = (result * 100 / M) / N;

        System.out.println(result);
    }
}