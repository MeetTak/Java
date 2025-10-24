package DS.Graph.Vertex;

class adjNode {
    int vertex;
    adjNode next;

    public adjNode(int data) {
        vertex = data;
        next = null;
    }
}

class adjList {
    public int v;
    public adjNode[] graph;

    public adjList(int vertices) {
        v = vertices;
        graph = new adjNode[v];
        for (int i = 0; i < v; i++) {
            graph[i] = null;
        }
    }

    // this adds a directed edge from source vertex to destination vertex
    public void addEdge(int source, int destination) {
        adjNode node = new adjNode(destination);
        node.next = graph[source]; // setting the next pointer for node to point at the current head
        // of the source vertex; here current head is the destination vertex
        graph[source] = node; // it updates the head pointer to point to this new node
    }

    public void addVertex(int vk, int source,
                          int destination) {
        addEdge(source, vk); // from source to the new vertex vk
        addEdge(vk, destination); // from vk to destination vertex
    }

    public void printGraph() {
        for (int i = 0; i < v; i++) {
            System.out.print(i + " ");
            adjNode temp = graph[i];
            while (temp != null) {
                System.out.print("-> " + temp.vertex + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public void delVertex(int k) {
        for (int i = 0; i < v; i++) {
            adjNode curr = graph[i], prev = null;

            if (i == k) {
                graph[i] = null; // removing all outgoing edges from vertex k
            } else { // removing any edge pointing to vertex k
                while (curr != null) {
                    if (curr.vertex == k) { // found an edge pointing to vertex k
                        if (prev == null) {
                            graph[i] = curr.next; // the edge is at the beginning of the list
                        } else {
                            prev.next = curr.next; // the edge is at the middle/end of the list
                        }
                        break;
                    }
                    // move to the next node in the adjacency list
                    prev = curr;
                    curr = curr.next;
                }
            }
        }
    }
}

public class list {
    public static void main(String[] args) {
        int V = 6;
        adjList graph = new adjList(V);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(3, 2);
        graph.addEdge(4, 3);

        System.out.println("Initial adjacency list");
        graph.printGraph();

        // Add vertex
        graph.addVertex(5, 3, 2);
        System.out.println("Adjacency list after adding vertex");
        graph.printGraph();

        // Delete vertex
        graph.delVertex(4);
        System.out.println("Adjacency list after deleting vertex");
        graph.printGraph();
    }
}


