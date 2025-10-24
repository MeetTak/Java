package DS.Patterns.Graph.DFS;

import java.util.ArrayList;
import java.util.List;

class Main4 {
    private boolean dfs(List<List<Integer>> graph, int v, int[] dp) {
        if (dp[v] != 0) {
            return dp[v] == 1;
        }

        dp[v] = -1; // Mark as visiting

        for (int neighbor : graph.get(v)) {
            if (!dfs(graph, neighbor, dp)) {
                return false;
            }
        }
//        For node 3 checking neighbor 0:
//        Node 0 checks neighbor 1
//        Node 1 checks neighbor 3 (which is already marked as "visiting" with -1)
//        Cycle detected! (3→0→1→3)
//        Returns false all the way up the call stack
//        Node 3 is marked unsafe

        dp[v] = 1; // Mark as safe
        return true;
    }

    public List<Integer> eventualSafeNodes(int[][] graph) {
        int V = graph.length;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>()); // creates an empty list for each vertex
            for (int neighbor : graph[i]) {
                adj.get(i).add(neighbor); // add each neighbor to that vertex list
            }
        }
//        Initialize adj = [] (empty)
//                For i = 0:
//        Add empty list: adj = [[]]
//        Neighbors of vertex 0 are [1,2,3]
//        Add them: adj = [[1,2,3]]

        List<Integer> result = new ArrayList<>();
        int[] dp = new int[V]; // 0: unvisited, 1: safe, -1: visiting

        for (int i = 0; i < V; i++) {
            if (dfs(adj, i, dp)) {
                result.add(i);
            }
        }
        return result;
    }
}

// for node 3
//1. Check memoization: dp[3] = 0 (unvisited), so continue
//2. Mark as visiting: dp[3] = -1
//3. Process neighbors: Node 3 has only one neighbor: node 0
//Call dfs(graph, 0, dp):
//dp[0] = 0 (unvisited), so continue
//Mark dp[0] = -1 (visiting)
//Process node 0's neighbors:
//First neighbor: node 1
//Call dfs(graph, 1, dp)
//dp[1] = 0 (unvisited), so continue
//Mark dp[1] = -1 (visiting)
//Process node 1's neighbors:
//First neighbor: node 2
//Call dfs(graph, 2, dp)
//dp[2] = 0 (unvisited), so continue
//Mark dp[2] = -1 (visiting)
//Process node 2's neighbor (node 5):
//Call dfs(graph, 5, dp)
//No outgoing edges from node 5
//Mark dp[5] = 1 (safe)
//Return true
//Mark dp[2] = 1 (safe)
//Return true
//Second neighbor: node 3
//Call dfs(graph, 3, dp)
//dp[3] = -1 (already visiting!)
//Return dp[3] == 1 which is false (cycle detected!)
//One neighbor returned false, so return false for node 1
//We don't process node 0's second neighbor (node 2) since we already know node 0 isn't safe
//Return false for node 0
//4. One neighbor returned false, so return false for node 3
//The key insight: We detected a cycle 3→0→1→3, which makes node 3 unsafe.
