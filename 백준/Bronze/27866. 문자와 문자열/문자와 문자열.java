import java.util.*;

public class Main {
    public static void main(String[] arts) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int index = sc.nextInt();
        
        System.out.println(s.charAt(index - 1));
    }
}