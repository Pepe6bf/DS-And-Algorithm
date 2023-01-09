import java.util.*;

[ 직접 생각한 코드 ]

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int[] grades = new int[N];
        double result = 0;

        for (int i = 0; i < N; i++) {
            int input = sc.nextInt();
            if (input > max) {
                max = input;
            }
            grades[i] = input;
        }

        // 모든 원본 성적을 합산
        for (int i = 0; i < N; i++) {
            result += grades[i];
        }
        result = (result / max * 100.0) / N;

        System.out.println(result);
    }
}

===============================================================

[ 서적 예제 코드 ]

public class Main {
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