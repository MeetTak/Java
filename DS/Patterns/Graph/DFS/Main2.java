package DS.Patterns.Graph.DFS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// time taken to reach all nodes from root
class Main2 {
    private int maxTime = 0;

    private void dfs(Map<Integer, List<Integer>> adj, int currentEmployee, int[] informTime, int currentTime) {
        currentTime += informTime[currentEmployee];
        maxTime = Math.max(maxTime, currentTime);

        if (adj.containsKey(currentEmployee)) {
            for (int subordinate : adj.get(currentEmployee)) {
                dfs(adj, subordinate, informTime, currentTime);
            }
        }
    }

//    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
//        Mp<Integer, List<Integer>> adj = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            if (manager[i] != -1) {
//                adj.computeIfAbsent(manager[i], k -> new ArrayList<>()).add(i);
//            }
//        }
//
//        dfs(adj, headID, informTime, 0);
//        return maxTime;
//    }
}