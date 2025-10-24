package DS.Graph.Edge;

// Java implementation of the above approach
import java.util.*;

class list
{

    // A utility function to add an edge in an
// undirected graph.
    static void addEdge(Vector<Integer> adj[],
                        int u, int v)
    {
        adj[u].add(v);
        adj[v].add(u);
    }

    // A utility function to delete an edge in an
// undirected graph.
    static void delEdge(Vector<Integer> adj[],
                        int u, int v)
    {
        // Traversing through the first vector list
        // and removing the second element from it
        for (int i = 0; i < adj[u].size(); i++)
        {
            if (adj[u].get(i) == v)
            {
                adj[u].remove(i);
                break;
            }
        }

        // Traversing through the second vector list
        // and removing the first element from it
        for (int i = 0; i < adj[v].size(); i++)
        {
            if (adj[v].get(i) == u)
            {
                adj[v].remove(i);
                break;
            }
        }
    }

    // A utility function to print the adjacency list
// representation of graph
    static void printGraph(Vector<Integer> adj[], int V)
    {
        for (int v = 0; v < V; ++v)
        {
            System.out.print("vertex " + v + " ");
            for (Integer x : adj[v])
                System.out.print("-> " + x);
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }

    // Driver code
    public static void main(String[] args)
    {
        int V = 5;
        Vector<Integer> []adj = new Vector[V];
        for (int i = 0; i < V; i++)
            adj[i] = new Vector<Integer>();

        // Adding edge as shown in the example figure
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);

        // Printing adjacency matrix
        printGraph(adj, V);

        // Deleting edge (1, 4)
        // as shown in the example figure
        delEdge(adj, 1, 4);

        // Printing adjacency matrix
        printGraph(adj, V);
    }
}

// This code is contributed by 29AjayKumar
