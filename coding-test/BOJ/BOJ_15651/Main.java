/**
문제 풀이 : https://succulent-bottle-ad0.notion.site/N-M-3-15651-9a6abcbccac44cc4b03f751c1c93d9f5
 */

import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int N;
    static int M;
    static int[] selected;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        selected = new int[M + 1];
    }

    static void recFunc(int k) {
        // 기저 조건
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) 
                sb.append(selected[i]).append(" ");
            sb.append("\n");

            return;
        }

        // 메인 로직
        for (int cand = 1; cand <= N; cand++) {
            selected[k] = cand;

            recFunc(k + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        input();

        recFunc(1);

        System.out.println(sb);
    }
}