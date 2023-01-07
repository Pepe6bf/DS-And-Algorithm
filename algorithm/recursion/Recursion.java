package algorithm.recursive;

/**
 * 재귀함수를 구현
 */
public class Recursion {
    public static void main(String[] args) {
        myFunction(1);
    }

    public static int myFunction(int number) {
        if (number >  10000) return -1;
        System.out.println(number);
        return myFunction(number + 1);
    }
}
