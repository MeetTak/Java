package DS.Patterns.Graph;

import java.util.LinkedList;
import java.util.Queue;

class bipartition {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        for (int i = 0; i < n; i++) {
            color[i] = -1; // -1: uncolored, 0: color A, 1: color B
        }

        for (int i = 0; i < n; i++) {
            if (color[i] != -1) {
                continue;
            }

            Queue<Integer> q = new LinkedList<>();
            q.add(i);
            color[i] = 0; // Start coloring with 0

            while (!q.isEmpty()) {
                int u = q.poll();

                for (int v : graph[u]) {
                    if (color[v] == -1) {
                        color[v] = 1 - color[u];
                        q.add(v);
                    } else if (color[v] == color[u]) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
