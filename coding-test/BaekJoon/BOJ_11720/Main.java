/**
https://succulent-bottle-ad0.notion.site/11720-9a9504755d374a1fbf451508bc00583b
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String input = sc.next();
        
        int result = 0;
        
        for (int i = 0; i < input.length(); i++)
            result += Character.getNumericValue(input.charAt(i));
        
        System.out.println(result);
    }
}