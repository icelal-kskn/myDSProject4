package project4;
public class Edge implements Comparable<Edge> {
    //from vertex
    Vertex _from;
    //to vertex
    Vertex _to;
    //edge weight or cost
    int _cost;
    //total number of edges in the graph
    static int totalEdges = 0;

    //constructor
    Edge(Vertex _from, Vertex _to, int _cost){
        this._from = _from;
        this._to = _to;
        this._cost = _cost;
    }

    /*
     *function compares two edges based on their cost
     *Will be used by the priority queue
     * İkram Celal KESKİN
     */
    @Override
    public int compareTo(Edge e) {
        return this._cost - e._cost;
    }

    @Override
    public String toString(){
        return this._from.name+"----"+this._to.name;
    }
}
