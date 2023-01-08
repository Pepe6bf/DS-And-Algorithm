package algorithm.recursive.hanoi;

public class HanoiExample {
    public static void main(String[] args) {
        hanoi(3, 'A', 'C', 'B');
    }

    public static void hanoi(int count, char from, char to, char temp) {
        if (count == 0) return;
        hanoi(count - 1, from, temp, to);
        System.out.printf("원반 %d를 %c에서 %c로 이동\n", count, from, to);
        hanoi(count - 1, temp, to, from);
    }
}
