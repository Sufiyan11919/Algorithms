class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] oE = new int[n+1]; 
        int[] iE = new int[n+1]; 
        int i = 0;
        while (i < trust.length) {
            int source = trust[i][0];
            int target = trust[i][1];
            oE[source]++;
            iE[target]++;
            i++;
        }
        int j = 1;
        while (j <= n) {
            if (oE[j] == 0 && iE[j] == n-1) {
                return j; 
            }
            j++;
        }
        return -1;
    }
}
