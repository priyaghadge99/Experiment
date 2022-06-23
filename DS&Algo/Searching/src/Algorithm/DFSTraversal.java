package Algorithm;

import java.util.Iterator;
import java.util.LinkedList;

public class DFSTraversal {
    public int vertex; //
    public LinkedList<Integer> adj[]; //// Array  of lists for Adjacency List Representation

    // /* Creation of the graph */
    public DFSTraversal(int v) {  //constructor
        vertex =v;
        adj = new LinkedList[v];  ///imp ... could not null due to this
        for (int i=0;i<v;++i) {
            adj[i] = new LinkedList();

        }
    }


    public void insertEdge(int v, int w) {
        adj[v].add(w);    //insert edges  //// Add w to v's list.
    }

    public void DSFrec(int n, Boolean visited[]) {
        visited[n]= true;
        //for all the vertices adjacent to this vertex
        System.out.println(n+ " ");
        Iterator<Integer> i = adj[n].listIterator();
        //Returns true if the iteration has more element
        while (i.hasNext()){
            int p = i.next();
            if (!visited[p])
                DSFrec(p,visited);  //recursive call bcz ...need backtracking in dfs.

        }
    }
    public void DFS(int v) {   //
        Boolean visited[] = new Boolean[vertex];
        // Call the recursive helper function to print DFS
        // traversal starting from all vertices one by one

        DSFrec(v,visited);

        for (int i=0;i<vertex;++i){
            if (visited[i]==false)
                DSFrec(i,visited);

        }


    }

    public static void main(String[] args) {

        DFSTraversal graph = new DFSTraversal(4);
        graph.insertEdge(0,1);
        graph.insertEdge(0,2);
        graph.insertEdge(1,2);
        graph.insertEdge(2,3);
        graph.insertEdge(3,3);

        System.out.println(
                "Following is Depth First Traversal "
                        + "(starting from vertex 2)");
        graph.DFS(2);


    }

}
