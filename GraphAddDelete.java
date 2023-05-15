import java.util.*;

public class GraphAddDelete {
    private Map<String, List<String>> adjacencyList;

    public GraphAddDelete() {
        adjacencyList = new HashMap<>();
    }

    public void addNode(String node) {
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdge(String node1, String node2) {
        adjacencyList.get(node1).add(node2);
    }

    public void deleteNode(String node) {
        adjacencyList.values().forEach(e -> e.remove(node));
        adjacencyList.remove(node);
    }

    public void deleteEdge(String node1, String node2) {
        adjacencyList.get(node1).remove(node2);
    }

    public static void main(String[] args) {
        // Create a new instance of GraphAddDelete
        GraphAddDelete graph = new GraphAddDelete();

        // Add nodes
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");

        // Add edges
        graph.addEdge("A", "B");
        graph.addEdge("B", "C");
        graph.addEdge("C", "D");

        // Delete a node and an edge
        graph.deleteNode("B");
        graph.deleteEdge("C", "D");

        // Print the adjacency list
        for (Map.Entry<String, List<String>> entry : graph.adjacencyList.entrySet()) {
            String node = entry.getKey();
            List<String> neighbors = entry.getValue();
            System.out.println(node + ": " + neighbors);
        }
    }
}
