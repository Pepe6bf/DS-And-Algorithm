class Solution {
    public boolean solution(int[][] key, int[][] lock) {
        int point = key.length - 1; // 키와 자물쇠가 제일 처음 겹치는 부분으로 초기화
        for (int x = 0; x < point + lock.length; x++) { // 이동 거리는 열쇠와 자물쇠가 처음으로 겹치는 부분 + 자물쇠의 크기 
            for (int y = 0; y < point + lock.length; y++) {
                // key 회전
                for (int r = 0; r < 4; r++) {
                    int[][] newLock = new int[lock.length + key.length * 2][lock.length + key.length * 2];  // 확장한 lock배열
                    initNewLock(newLock, lock, point);
                    match(newLock, key, x, y, r);   // newLock배열에 key배열을 더해준다
                    if (check(newLock, point, lock.length)) return true;    // 자물쇠 영역이 모두 유효한 값인지 확인
                }
            }
        } 
        
        return false;
    }

    private void initNewLock(int[][] newLock, int[][] lock, int point) {
        for (int i = 0; i < lock.length; i++) {
            for (int j = 0; j < lock.length; j++) {
                newLock[i + point][j + point] = lock[i][j];
            }
        }
    }

    private void match(int[][] newLock, int[][] key, int x, int y, int r) {
        int keyLen = key.length;
        for (int i = 0; i < keyLen; i++) {
            for (int j = 0; j < keyLen; j++) {
                if (r == 0) {   // 한 번도 회전하지 않았다면
                    newLock[x + i][y + j] += key[i][j];
                } else if (r == 1) {    // 시계방향으로 90도 회전한 경우
                    newLock[x + i][y + j] += key[j][keyLen - i - 1];
                } else if(r == 2) { //180도 >회전<한 경우 (뒤집은 거랑은 다름)
                    newLock[x + i][y + j] += key[keyLen - i - 1][keyLen- j - 1];
                } else { //270도 회전한 경우 == 반시계 방향으로 90도 회전한 경우
                    newLock[x + i][y + j] += key[keyLen - j - 1][i];
                }
            }
        }
    }

    public boolean check(int[][] newLock, int point, int len) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (newLock[point + i][point + j] != 1) return false;
            }
        }

        return true;
    }
}
