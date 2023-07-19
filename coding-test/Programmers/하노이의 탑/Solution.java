import java.util.*;

class Solution {
    public int[][] solution(int n) {
        List<int[]> record = new ArrayList<>();
        
        hanoi(n, 1, 3, 2, record);
        
        int[][] answer = record.toArray(new int[0][]);
        return answer;
    }
    
    private void hanoi(int discCount, int from, int to, int temp, List<int[]> record) {
        // 종료 조건
        if (discCount == 1) {
            record.add(new int[] {from, to});
            return;
        }
        
        // 점화식 구현
        hanoi(discCount - 1, from, temp, to, record);
        hanoi(1, from, to, temp, record);
        hanoi(discCount - 1, temp, to, from, record);
    }
}