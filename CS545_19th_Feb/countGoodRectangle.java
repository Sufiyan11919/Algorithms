public class countGoodRectangle {
    public int countGoodRectangles(int[][] rectangles) {
        return countGoodRectangles(rectangles, 0, 0, 0);
    }
    public int countGoodRectangles(int[][] rectangles, int index, int max, int count) {
        if (index >= rectangles.length) {
            return count;
        }
        int l = rectangles[index][0];
        int w = rectangles[index][1];
        int min;
        if (l < w) {
            min = l;
        } else {
            min = w;
        }
        if (min > max) {
            return countGoodRectangles(rectangles, index + 1, min, 1);
        }else if (min == max) {
            return countGoodRectangles(rectangles, index + 1, max, count + 1);
        }else {
            return countGoodRectangles(rectangles, index + 1, max, count);
        }
    }
}
