package algorithm.recursive;

/**
 * 지수 함수를 재귀적으로 구현
 */
public class ExponentialExample {

    public static void main(String[] args) {
        System.out.println(exponential(2, 5));  // 2^5
        System.out.println(exponential(3, 2));  // 3^2
    }
    public static int exponential(int n, int u) {
        if (u == 0) return 1;   // 지수가 0이면 1
        return n * exponential(n, u - 1);
    }
}
