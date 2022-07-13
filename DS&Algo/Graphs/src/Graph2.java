//// A union by rank and path compression
//// based program to detect cycle
//
// in a graph
public class Graph2 {
    int vertices , edges;
    Edge edge[];
    class Edge {
        int src ;
        int desc;
    }

    class Subset
    {
        int rank ;
        int parent;
    }

    Graph2 ( int v ,int e){
     this.edges = e;
     this.vertices = v;
     edge   = new Edge[this.edges];
     for (int i=0;i<this.edges; i++)
     {
         edge[i] = new Edge();
        }
    }
    // A utility function to find
    // set of an element i (uses
    // path compression technique)
    int find(Subset[] subset , int i){
        if(subset[i].parent!=i)
            subset[i].parent = find(subset , subset[i].parent);
            return subset[i].parent;
    }
    // A utility function to find
    // set of an element i (uses
    // path compression technique)

    void union(Subset[] subset ,int x, int y){
        int xroot = find(subset ,x);
        int yroot = find(subset , y);

        if (subset[xroot].rank < subset[yroot].rank){
            subset[xroot].parent = yroot;

        }else if (subset[xroot].rank > subset[yroot].rank){
            subset[yroot].parent =xroot;
        }
        else {
            subset[xroot].parent = yroot;
            subset[yroot].rank++;
        }

    }

    //check whether graph contain cycle
     public boolean isCycle( Graph2 graph2){
        int E= graph2.edges;
        int V=  graph2.vertices;

         Subset[] subset = new Subset[V];
         for (int v = 0; v < V; v++) {

             subset[v] = new Subset();
             subset[v].parent = v;
             subset[v].rank = 0;
         }


        for (int i=0;i<this.edges;i++){
            int x = find(subset, graph2.edge[i].src);
            int y = find(subset, graph2.edge[i].desc);

            if (x==y){
                return true;
            }
            union(subset,x,y);

        }
   return  false;
    }
    public static void main(String[] args) {

        Graph2 graph2 = new Graph2(3,3);

        graph2.edge[0].src= 0;
        graph2.edge[0].desc= 1;

        graph2.edge[1].src= 1;
        graph2.edge[1].desc = 2;

        graph2.edge[2].src= 0;
        graph2.edge[2].desc=2;
      /* 0
        | \
        |   \
        1-----2 */

        if(graph2.isCycle(graph2)== true){
            System.out.println("Contain Cycle");
        }
        else {
            System.out.println("Not Contain Cycle");
        }
    }
}


/*


 Path Compression. The idea is to flatten the tree when find() is called.
 When find() is called for an element x, root of the tree is returned.
 The find() operation traverses up from x to find root.
 The idea of path compression is to make the found root as parent of x so that we don’t have to traverse all intermediate nodes again.
 If x is root of a subtree,
 then path (to root) from all nodes under x also compresses.




 and union by rank :
 The idea is to always attach smaller depth tree under the root of the deeper tree.
 This technique is called union by rank. The term rank is preferred instead of height because if path compression technique (we have discussed it below) is used,
  then rank is not always equal to heigh
* */