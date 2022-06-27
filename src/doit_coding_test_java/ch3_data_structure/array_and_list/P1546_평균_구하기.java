package doit_coding_test_java.ch3_data_structure.array_and_list;

import java.util.*;

public class P1546_평균_구하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        long sum = 0;
        long max = 0;

        for (int i = 0; i < N; i++) {
            if (A[i] > max) max = A[i];
            sum += A[i];
        }

        System.out.println(sum * 100 / (double) max / N);
    }
}
