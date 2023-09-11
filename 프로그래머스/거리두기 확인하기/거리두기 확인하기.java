class Solution {

    private static final int[] dx = {0, -1, 1, 0};
    private static final int[] dy = {-1, 0, 0, 1};

    public int[] solution(String[][] places) {
        int[] answer = new int[5];

        // 하나의 공간 당 탐색
        for (int i = 0; i < places.length; i++) {
            char[][] room = new char[places[i].length][];

            for (int j = 0; j < places[i].length; j++) {
                room[j] = places[i][j].toCharArray();
            }

            if (isDistanced(room)) answer[i] = 1;
        }

        return answer;
    }

    private boolean isDistanced(char[][] room) {
        for (int y = 0; y < room.length; y++) {
            for (int x = 0; x < room[y].length; x++) {
                if (room[y][x] != 'P') continue;

                if (!isDistanced(room, x, y)) return false;
            }
        }
        return true;
    }

    private boolean isDistanced(char[][] room, int x, int y) {
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (!isSafe(room, nx, ny)) continue;

            switch (room[ny][nx]) {
                case 'P':
                    return false;
                case 'O':
                    if (isNextToVolunteer(room, nx, ny, 3 - d)) return false;
                    break;
            }
        }
        return true;
    }

    private boolean isNextToVolunteer(char[][] room, int x, int y, int exclude) {
        for (int d = 0; d < 4; d++) {
            if (d == exclude) continue;

            int nx = x + dx[d];
            int ny = y + dy[d];

            if (!isSafe(room, nx, ny)) continue;

            if (room[ny][nx] == 'P') return true;
        }

        return false;
    }

    private boolean isSafe(char[][] room, int x, int y) {
        if (y < 0 || y >= room.length || x < 0 || x >= room[y].length) return false;
        return true;
    }
}