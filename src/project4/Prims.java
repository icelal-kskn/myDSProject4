package project4;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Prims {
    PriorityQueue<Edge> pqueue = new PriorityQueue<>();
    List<Edge> mst;
    int totalCost= 0;

    public Prims() {
        this.mst = new ArrayList<>();
    }

    //function implementing Prim's algorithm
    boolean findMST(Vertex s){
        //add all edges of the starting vertex
        this.addEdges(s);
        int edgeCount = 0;

    /*
      search  for low cost's edges using PriorityQueue
      until all the edges are discovered
    */
        while(!this.pqueue.isEmpty() && edgeCount != Edge.totalEdges){
            //pop the low cost edge from PriorityQueue
            Edge minEdge = this.pqueue.peek();
            this.pqueue.poll();

      /*
        do not add edges if its
        already visited
      */
            if(!minEdge._to.visited) {
                //increment count and add edge to MST
                edgeCount += 1;
                this.totalCost += minEdge._cost;
                this.mst.add(minEdge);
                this.addEdges(minEdge._to);
            } else{
            }
        }

    /*
      if not all edges are dicovered, then probalbly the
      given graph is dicsconnected, hence MST not possible.
    */
        return edgeCount != Edge.totalEdges;
    }

    //function add edges connected with a vertex to the priority queue
    void addEdges(Vertex s){
        s.visited = true;
        s.edges.stream().filter((edge) -> (!edge._to.visited)).forEachOrdered((edge) -> {
            this.pqueue.add(edge);
        });
    }
}
