import java.util.*;
import java.io.*;

class Body {
    int h;
    int w;

    Body (int h, int w) {
        this.h = h;
        this.w = w;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        List<Body> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            list.add(new Body(h, w));
        }

        Collections.sort(list, new Comparator<Body>() {
            @Override
            public int compare(Body o1, Body o2) {
                return o2.h - o1.h;
            }
        });

        int result = 0;
        int max = Integer.MIN_VALUE;

        for (Body o : list) {
            if (o.w > max) {
                max = o.w;
                result++;
            }
        }

        System.out.println(result);
    }
}