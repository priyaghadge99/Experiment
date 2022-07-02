public class Graph {
    public static int vertices;
    public static int edges;
    Edge edge[]; // /collection of all edges
    class Edge{
        int src ,des;

    };
    // Creates a graph with V vertices and E edges
    public Graph(int v, int e) {
        this.vertices = v;
        this.edges = e;

        edge = new Edge[edges];
        for (int i=0;i<e;i++){
            edge[i] = new Edge();
        }

    }
// A utility function to find the subset of an element i
    int find(int parent[], int i ){
        if (parent[i]==-1)
            return i;
        return find(parent,parent[i]);

    }
    // A utility function to do union of two subsets
    void union(int parent[] ,int x, int y){

        parent[x] =y;
    }


    public static void main(String[] args) {

        Graph graph = new Graph(3,3);

        /* Let us create the following graph
        0
        | \
        |  \
        1---2 */

        // // add edge 0-1
        graph.edge[0].src=0;
        graph.edge[0].des=1;

        //add edge 0-2

        graph.edge[1].src=0;
        graph.edge[1].des=2;

        //add edge 1-2

        graph.edge[2].src= 1;
        graph.edge[2].des =2;


        if (graph.isCycle(graph)==1){
            System.out.println("Cycle is present ");

        }
        else {
            System.out.println("Cycle is not Present");
        }


    }

    //main function which decide cycle formed or not
    private int isCycle(Graph graph) {
        //simple logic src cha n des cha parent ek ...means cycle form hott ahe

        //allocated memeory to parent array
        int parent[] = new int[vertices];
        // Initialize all subsets as single element sets
        for (int i=0;i<graph.edges;i++){
            parent[i]=-1;
        }
        /* iterate throgh all edges and check  where subset of  both vertices is same or not
        * if yes --- cycle is formed*/

        for (int i=0;i<edges;i++){
            int x= find(parent , graph.edge[i].src);
            int y = find(parent ,graph.edge[i].des);

            if (x==y)
                return 1;
            graph.union(parent,x,y);
        }

return  0;
    }


}
