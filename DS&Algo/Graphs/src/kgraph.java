import java.util.Arrays;

public class Kgraph{
    public static int vertices;
    public static  int edges;

    Edge edge[]; //collection of edges


    class Edge{
        int src, des , wt;
    }
     class Subset{
         int parent ,rank;
    }

     //constructor
     Kgraph(int v ,int e) {
         this.vertices= v;
         this.edges= e;
         edge = new Edge[this.edge.length];
         for (int i=0;i<v;i++){
            edge[i] = new Edge();
         }
    }
    //find parent
    int find(Subset subset[] ,int i){
        if(subset[i].parent != -1){
            subset[i].parent = find(subset , subset[i].parent);
        }
        return  subset[i].parent;
    }

    //union method
    void union(Subset subset[] ,int x ,int y){
       int  xroot = find(subset ,x);
       int yroot = find(subset ,y);

       if(subset[xroot].rank < subset[yroot].rank){
           subset[xroot].parent = yroot;
       }
       else if (subset[xroot].rank >subset[yroot].rank){
           subset[yroot].parent = xroot;
       }
       else {
           subset[xroot].parent = yroot;
           subset[yroot].rank++;
       }


    }

    //detect cycle is present or not
    public  int kruskalMst(Kgraph kgraph) {
        //
        int vertice = kgraph.vertices;
        int edge = kgraph.edges;

        // This will store the resultant MST
        Edge result[] = new Edge[edge];

        for (int j = 0 ;j<edges;j++){
            result[j] = new Edge(); 
        }

     //sort the edges
          Arrays.sort(kgraph.edge);

         int e=0 ; //index for
        Subset[] subset = new Subset[vertice];

        // Allocate memory for creating V subsets
        for (int i = 0; i < vertices; ++i)
            subset[i] = new Subset();
       //make all rank as 0 and parent as i
        for (int i=0;i<vertice;i++){
            subset[i].parent = i;
            subset[i].rank =0;
        }
        int i=0; //for increamenting edge
        while (e)




    }



    public static void main(String[] arg){

         Kgraph kgraph = new Kgraph(3,3);

           kgraph.edge[0].src = 0;
           kgraph.edge[0].des = 1;

           kgraph.edge[1].src = 1;
           kgraph.edge[1].des= 2;

           kgraph.edge[2].src= 0;
           kgraph.edge[2].des =2;


    }

}
