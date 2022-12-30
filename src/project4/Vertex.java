package project4;
import java.util.ArrayList;
import java.util.List;

public class Vertex {
    //vertex label
    char name;
    //edges connected to this vertex
    List<Edge> edges;
    //visited flag
    boolean visited;

    Vertex(char name){
        this.name = name;
        this.visited = false;
        this.edges = new ArrayList<>();
    }

    //method to connect vertices
    void connect(Vertex ad_vertex, int edge_cost){
        edges.add(new Edge(this, ad_vertex, edge_cost));
        edges.add(new Edge(ad_vertex, this, edge_cost));
        Edge.totalEdges += 2;
    }

}
