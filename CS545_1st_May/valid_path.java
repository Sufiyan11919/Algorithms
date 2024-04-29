import java.util.Stack;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[][] adj = new boolean[n][n];
        for (int[] edge : edges) {
            int i = edge[0];
            int j = edge[1];
            adj[i][j] = true;
            adj[j][i] = true;
        }
        if (source == destination) {
            return true; 
        }
        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        while (!stack.isEmpty()) {
            int curr = stack.pop();
            visited[curr] = true;
            
            if (curr == destination) {
                return true; 
            }
            
            for (int i = 0; i < n; i++) {
                if (adj[curr][i] && !visited[i]) {
                    stack.push(i);
                }
            }
        }
        return false;
    }
}
