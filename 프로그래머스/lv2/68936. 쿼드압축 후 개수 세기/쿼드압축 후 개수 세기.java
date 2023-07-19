class Solution {
    public int[] solution(int[][] arr) {
        Count count = count(0, 0, arr.length, arr);
        int[] answer = {count.zero, count.one};
        
        return answer;
    }
    
    private Count count(int offsetX, int offsetY, int size, int[][] arr) {
        int subSize = size / 2;
        int matchNumber = arr[offsetX][offsetY];
        
        for (int x = offsetX; x < offsetX + size; x++) {
            for (int y = offsetY; y < offsetY + size; y++) {
                // 정사각형 내부 정수가 모두 일치하지 않으므로 하위 문제로 변환
                // 점화식 적용
                if (arr[x][y] != matchNumber)
                    return count(offsetX, offsetY, subSize, arr)
                            .add(count(offsetX + subSize, offsetY, subSize, arr))
                            .add(count(offsetX, offsetY + subSize, subSize, arr))
                            .add(count(offsetX + subSize, offsetY + subSize, subSize, arr));
            }
        }
        
        // 종료 조건
        if (matchNumber == 1) {
            return new Count(0, 1);
        } else {
            return new Count(1, 0);
        }
    }
}

class Count {
    public final int zero;
    public final int one;
    
    Count(int zero, int one) {
        this.zero = zero;
        this.one = one;
    }
    
    public Count add(Count other) {
        return new Count(this.zero + other.zero, this.one + other.one);
    }
}


// (offsetX, offsetY, size) = (offsetX, offsetY, size/2) + (offsetX + size/2, offsetY, size/2)
// + (offsetX, offsetY + size/2, size/2) + (offsetX + size/2, offsetY + size/2, size/2)