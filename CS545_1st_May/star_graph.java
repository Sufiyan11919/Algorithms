class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length + 1;
        int[] deg = new int[n + 1]; 
        for (int[] edge : edges) {
            deg[edge[0]]++; 
            deg[edge[1]]++; 
        }
        int center = -1;
        int maxDeg = Integer.MIN_VALUE;
        int i = 1;
        while (i <= n) {
            if (deg[i] > maxDeg) {
                maxDeg = deg[i];
                center = i;
            }
            i++;
        }
        
        return center;
    }
}
