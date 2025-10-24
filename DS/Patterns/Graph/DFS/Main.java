package DS.Patterns.Graph.DFS;

// nodes at the boundary
class Main {
    private int rows, cols;

    private void dfs(int[][] A, int i, int j) {
        if (i < 0 || j < 0 || i >= rows || j >= cols) {
            return;
        }

        if (A[i][j] != 1) {
            return;
        }

        A[i][j] = -1; // Mark as visited
        dfs(A, i + 1, j);
        dfs(A, i - 1, j);
        dfs(A, i, j + 1);
        dfs(A, i, j - 1);
    }

    public int numEnclaves(int[][] A) {
        if (A == null || A.length == 0 || A[0].length == 0) {
            return 0;
        }

        rows = A.length;
        cols = A[0].length;

        // Traverse the borders and start DFS from land cells ('1')
        // connected to the boundary.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || j == 0 || i == rows - 1 || j == cols - 1) {
                    if (A[i][j] == 1) {
                        dfs(A, i, j);
                    }
                }
            }
        }

        int ans = 0;
        // Count the remaining land cells that are not connected to the boundary.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (A[i][j] == 1) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
