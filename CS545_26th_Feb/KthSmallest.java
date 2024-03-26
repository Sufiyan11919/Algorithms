public class KthSmallest {
    public int kthSmallest(int[][] matrix, int k) {
        int l = matrix[0][0];
        int r = matrix[matrix.length - 1][matrix.length - 1];
        while(l < r) {
            int mid = (l + r) / 2;
            int count = 0;
            int j = matrix.length - 1;

            for(int i = 0; i < matrix.length; i++) {
                while (j >= 0 && matrix[i][j] > mid) {
                    j--;
                }
                count = count (j + 1);
            }
            if(count < k) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}
