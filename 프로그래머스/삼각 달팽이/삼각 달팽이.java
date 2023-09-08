class Solution {
    private static final int[] dx = {0, 1, -1};
    private static final int[] dy = {1, 0, -1};
    private int[][] triangle;

    private boolean isSafe(int x, int y, int n) {
        if (x == -1 || x == n || y == -1 || y == n || triangle[y][x] != 0)
            return false;
        return true;
    }

    public int[] solution(int n) {
        triangle = new int[n][n];
        int v = 1;
        int x = 0;
        int y = 0;
        int d = 0;

        while (true) {
            triangle[y][x] = v++;

            int nx = x + dx[d];
            int ny = y + dy[d];
            if (!isSafe(nx, ny, n)) {
                d = (d + 1) % 3;
                nx = x + dx[d];
                ny = y + dy[d];

                if (!isSafe(nx, ny, n)) break;
            }
            x = nx;
            y = ny;
        }

        int[] result = new int[v - 1];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                result[index++] = triangle[i][j];
            }
        }

        return result;
    }
}