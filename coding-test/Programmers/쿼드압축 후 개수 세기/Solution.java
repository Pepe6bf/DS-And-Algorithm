public class Solution {

    // 0 & 1의 개수를 나타내는 Class
    private static class Count {
        public final int zero;
        public final int one;

        public Count(int zero, int one) {
            this.zero = zero;
            this.one = one;
        }

        // 다른 결과와 합산
        public Count add(Count other) {
            return new Count(zero + other.zero, one + other.one);
        }
    }

    private Count count(int offsetX, int offsetY, int size, int[][] arr) {
        int downSize = size / 2;
        for (int x = offsetX; x < offsetX + size; x++) {
            for (int y = offsetY; y < offsetY + size; y++) {
                // 정사각형 내부 모든 숫자가 일치하지 않다면
                if (arr[x][y] != arr[offsetX][offsetY]) {
                    // 현재 상태를 나타내는 점화식 적용
                    return count(offsetX, offsetY, downSize, arr)
                                .add(count(offsetX + downSize, offsetY, downSize, arr))
                                .add(count(offsetX, offsetY + downSize, downSize, arr)) 
                                .add(count(offsetX + downSize, offsetY + downSize, downSize, arr));
                }
            }
        }

        // 정사각형 내부 모든 숫자가 일치 할 경우
        // 종료 조건
        if (arr[offsetX][offsetY] == 1) {
            return new Count(0, 1);
        } else {
            return new Count(1, 0);
        }
    }

    public int[] solution(int[][] arr) {
        Count count = count(0, 0, arr.length, arr);
        return new int[] {count.zero, count.one};
    }
}