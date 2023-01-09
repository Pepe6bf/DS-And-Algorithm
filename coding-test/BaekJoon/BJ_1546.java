import java.util.*;

public class BJ_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] nums = new int[N];
        double result;

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        long sum = 0;
        long max = 0;

        for (int i = 0; i < N; i++) {
            if (nums[i] > max) max = nums[i];
            sum += nums[i];
        }

        // 한 과목과 관련된 수식을 총합한 후 관련된 수식으로 변환해 로직이 간단해짐
        result = sum * 100.0 / max / N;
        System.out.println(result);
    }
}