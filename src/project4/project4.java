package project4;


public class project4 {

    public static void main(String[] args) {
        //vertices of the graph
        Vertex vertices[] = {new Vertex('A'), new Vertex('B'), new  Vertex('C'),
            new Vertex('D'), new Vertex('E'),new Vertex('F'),new Vertex('G'),new Vertex('H')};

        //connecting vertices
        vertices[0].connect(vertices[3], 20);
        vertices[0].connect(vertices[2], 17);
        vertices[0].connect(vertices[1], 12);
        vertices[1].connect(vertices[2], 21);
        vertices[1].connect(vertices[7], 19);
        vertices[2].connect(vertices[3], 4);
        vertices[2].connect(vertices[6], 6);
        vertices[2].connect(vertices[4], 88);
        vertices[3].connect(vertices[5], 15);
        vertices[3].connect(vertices[6], 13);
        vertices[4].connect(vertices[5], 30);
        vertices[4].connect(vertices[6], 37);
        vertices[4].connect(vertices[7], 19);
        vertices[5].connect(vertices[6], 44);



        //driver code
        Prims prims= new Prims();
        if(prims.findMST(vertices[0])){
            System.out.println(prims.mst);
            System.out.println("Total minimum weight is: "+ prims.totalCost);
        }
        else{
            System.out.println("MST not possible for given graph");
        }
    }

}
