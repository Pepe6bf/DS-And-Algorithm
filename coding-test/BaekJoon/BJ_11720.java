import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        char[] nums = s.toCharArray();
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] - '0';
        }

        System.out.println(sum);
    }
}