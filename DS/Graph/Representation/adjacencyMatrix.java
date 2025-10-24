package DS.Graph.Representation;

public class adjacencyMatrix {
    public static void addEdge(int[][] mat, int i, int j) {
        mat[i][j] = 1;
        mat[j][i] = 1; // since the graph is unidirected
        // here 1 represents that their exist an edge between the two vertices
    }

    public static void displayMatrix(int[][] mat) {
        for(int[] row : mat) {
            for(int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int v = 4;
        int mat[][] = new int[v][v];

        addEdge(mat, 0, 1);
        addEdge(mat, 0, 2);
        addEdge(mat, 1, 2);
        addEdge(mat, 2, 3);

        System.out.println("Adjacency Matrix Representation");
        displayMatrix(mat);
    }
}
