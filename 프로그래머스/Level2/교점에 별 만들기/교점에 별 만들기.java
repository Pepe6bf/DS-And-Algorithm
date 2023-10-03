import java.util.*;

class Point {
    final long x, y;

    Point(long x, long y) {
        this.x = x;
        this.y = y;
    }
}

class Solution {

    private Point intersection(long a1, long b1, long c1, long a2, long b2, long c2) {
        double x = (double)(b1 * c2 - c1 * b2) / (a1 * b2 - b1 * a2);
        double y = (double)(c1 * a2 - a1 * c2) / (a1 * b2 - b1 * a2);

        if (x % 1 != 0 || y % 1 != 0) return null;
        return new Point((long)x, (long)y);
    }

    private Point getMaximum(List<Point> points) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for (Point p : points) {
            if (p.x > x) x = p.x;
            if (p.y > y) y = p.y;
        }

        return new Point(x, y);
    }

    private Point getMinimum(List<Point> points) {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for (Point p : points) {
            if (p.x < x) x = p.x;
            if (p.y < y) y = p.y;
        }

        return new Point(x, y);
    }

    public String[] solution(int[][] line) {
        List<Point> points = new ArrayList<>();

        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                Point p = intersection(line[i][0], line[i][1], line[i][2], line[j][0], line[j][1], line[j][2]);

                if (p != null) points.add(p);
            }
        }

        Point maximum = getMaximum(points);
        Point minimum = getMinimum(points);

        int width = (int)(maximum.x - minimum.x + 1);
        int height = (int)(maximum.y - minimum.y + 1);

        char[][] arr = new char[height][width];
        for (char[] row : arr) {
            Arrays.fill(row, '.');
        }

        for (Point p : points) {
            int x = (int)(p.x - minimum.x);
            int y = (int)(maximum.y - p.y);

            arr[y][x] = '*';
        }

        String[] result = new String[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = new String(arr[i]);
        }

        return result;
    }
}