package DS.Graph.Edge;

// Java program to add and remove edge
// in the adjacency matrix of a graph

class matrix {

    // Number of vertices
    private int n;

    // Adjacency matrix
    private int[][] g = new int[10][10];

    // Constructor
    matrix(int x)
    {
        this.n = x;

        // Initializing each element of the
        // adjacency matrix to zero
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                g[i][j] = 0;
            }
        }
    }

    // Function to display adjacency matrix
    public void displayAdjacencyMatrix()
    {
        // Displaying the 2D matrix
        for (int i = 0; i < n; ++i) {
            System.out.println();
            for (int j = 0; j < n; ++j) {
                System.out.print(" " + g[i][j]);
            }
        }

        System.out.println();
    }

    // Function to update adjacency
    // matrix for edge insertion
    public void addEdge(int x, int y)
    {
        // Checks if the vertices exists
        if ((x < 0) || (x >= n)) {
            System.out.printf("Vertex " + x
                    + " does not exist!");
        }
        if ((y < 0) || (y >= n)) {
            System.out.printf("Vertex " + y
                    + " does not exist!");
        }

        // Checks if it is a self edge
        if (x == y) {
            System.out.println("Same Vertex!");
        }

        else {
            // Insert edge
            g[y][x] = 1;
            g[x][y] = 1;
        }
    }

    // Function to update adjacency
    // matrix for edge removal
    public void removeEdge(int x, int y)
    {
        // Checks if the vertices exists
        if ((x < 0) || (x >= n)) {
            System.out.printf("Vertex " + x
                    + " does not exist!");
        }
        if ((y < 0) || (y >= n)) {
            System.out.printf("Vertex " + y
                    + " does not exist!");
        }

        // Checks if it is a self edge
        if (x == y) {
            System.out.println("Same Vertex!");
        }

        else {
            // Remove edge
            g[y][x] = 0;
            g[x][y] = 0;
        }
    }
}

// Driver Code
class Main {
    public static void main(String[] args)
    {

        int N = 6, X = 2, Y = 3;
        matrix obj = new matrix(N);

        // Inserting edges
        obj.addEdge(0, 1);
        obj.addEdge(0, 2);
        obj.addEdge(0, 3);
        obj.addEdge(0, 4);
        obj.addEdge(1, 3);
        obj.addEdge(2, 3);
        obj.addEdge(2, 4);
        obj.addEdge(2, 5);
        obj.addEdge(3, 5);

        System.out.println("Adjacency matrix after"
                + " edge insertions:");
        obj.displayAdjacencyMatrix();

        obj.removeEdge(2, 3);

        System.out.println("\nAdjacency matrix after"
                + " edge removal:");
        obj.displayAdjacencyMatrix();
    }
}
