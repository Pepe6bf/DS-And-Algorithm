package free_study.doit_java.ch01;

/**
 * 시간 복잡도 예제 코드
 */
public class TimeComplexityExample1 {

    public static void main(String[] args) {
        // 1 ~ 100 사이 값 랜덤 선택
        int findNumber = (int)(Math.random() * 100);
        for (int i = 0; i < 100; i++) {
            if (i == findNumber) {
                System.out.println(i);
                break;
            }
        }
    }
}
