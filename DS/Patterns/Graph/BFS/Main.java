package DS.Patterns.Graph.BFS;

import java.util.LinkedList;
import java.util.Queue;


class Main {
    public int[][] updateMatrix(int[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return matrix;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        Queue<int[]> queue = new LinkedList<>();

        // Add all '0's and their neighbors to the queue to start a multi-source BFS
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    // We add the neighbors of the 0's to the queue
                    queue.offer(new int[]{i - 1, j});
                    queue.offer(new int[]{i + 1, j});
                    queue.offer(new int[]{i, j - 1});
                    queue.offer(new int[]{i, j + 1});
                }
            }
        }

        boolean[][] visited = new boolean[rows][cols];
        int steps = 0;

        while (!queue.isEmpty()) {
            steps++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int l = current[0];
                int r = current[1];

                // Check for valid coordinates, if not visited, and if it's a '1'
                if (l >= 0 && l < rows && r >= 0 && r < cols && !visited[l][r] && matrix[l][r] == 1) {
                    visited[l][r] = true;
                    matrix[l][r] = steps;

                    // Add its neighbors to the queue for the next level
                    queue.offer(new int[]{l - 1, r});
                    queue.offer(new int[]{l + 1, r});
                    queue.offer(new int[]{l, r - 1});
                    queue.offer(new int[]{l, r + 1});
                }
            }
        }
        return matrix;
    }
}
//for test case
//        [0,0,0]
//        [0,1,0]
//        [1,1,1]
//In the second iteration of the BFS algorithm for the test case [[0,0,0],[0,1,0],[1,1,1]], the queue will contain 12 cells, not 8.
//After the first iteration, the cells (1,1), (2,0), and (2,2) are updated to 1 and marked as visited. Each of these cells adds its 4 neighbors to the queue:
//From (1,1): (0,1), (2,1), (1,0), (1,2)
//From (2,0): (1,0), (3,0), (2,-1), (2,1)
//From (2,2): (1,2), (3,2), (2,1), (2,3)
//That's 12 total entries in the queue, though many will be filtered out during processing:
//Cell (2,1) appears 3 times (duplicate entries)
//Cells (1,0) and (1,2) appear twice each
//Coordinates (3,0), (2,-1), (3,2), (2,3) are out of bounds
//Cells (0,1), (1,0), (1,2) are zeros that are already visited
//During the second iteration, only the cell at (2,1) will actually be processed (updated to value 2) since it's the only unvisited cell with value 1.