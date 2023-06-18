/**
https://succulent-bottle-ad0.notion.site/N-M-4-15652-93a503062b7f4589a61c10a8f4a99146
 */

import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder result = new StringBuilder();
    static int N, M;
    static int[] selected;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        selected = new int[M + 1];
    }

    static void recFunc(int k) {

        // base case
        if (k == M + 1) {
            for (int i = 1; i <= M; i++)
                result.append(selected[i]).append(" ");
            result.append("\n");

            return;
        }

        // main logic
        for (int cand = 1; cand <= N; cand++) {
            if (k != 1 && selected[k - 1] > cand)
                continue;
            
            selected[k] = cand;

            recFunc(k + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        input();

        recFunc(1);

        System.out.println(result);
    }
}