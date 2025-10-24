package DS.Patterns.Graph;

class unionFind {
    private int[] parent;

    private int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        // Path compression
        return parent[x] = find(parent[x]);
    }

    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        parent = new int[n + 1]; // bcoz edges in the question starts from 1
        for (int i = 0; i <= n; i++) {
            parent[i] = i;
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int rootU = find(u);
            int rootV = find(v);

            if (rootU != rootV) {
                // Union operation
                parent[rootV] = rootU;
            } else {
                // Cycle detected, this is the redundant edge
                return edge;
            }
        }
        return new int[0]; // Should not be reached based on problem constraints
    }
}
