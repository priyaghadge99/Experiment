package Algorithm;

import java.util.Iterator;
import java.util.LinkedList;

 class DFSTraversal2 {
    private int vertex; //
    private LinkedList<Integer> lists[]; //// Array  of lists for Adjacency List Representation
    private boolean visited[]; /**
    // /* Creation of the graph */
     DFSTraversal2(int V) {  //constructor
        vertex =V;
        lists = new LinkedList[V];  ///imp ...I could not null due to this
        visited = new boolean[V];  //**
        for (int i=0;i<V;++i) {
            lists[i] = new LinkedList<Integer>();

        }
    }


     void insertEdge(int src, int des) {

        lists[src].add(des);    //insert edges  // Add w to v's list.
    }


     void DSFr(int vertex1) {
        visited[vertex1]= true;
        //for all the vertices adjacent to this vertex
        System.out.print(vertex1 + " ");
        Iterator<Integer> iterator = lists[vertex1].listIterator();
        //Returns true if the iteration has more element
        while(iterator.hasNext())
        {
            int p = iterator.next();
            if (!visited[p])
                DSFr(p);  //recursive call bcz ...need backtracking in dfs.

        }
    }


   /* public void DFS(int v) {   //
        Boolean visited[] = new Boolean[vertex];
        // Call the recursive helper function to print DFS
        // traversal starting from all vertices one by one

        DSFrec(v,visited);

        for (int i=0;i<vertex;++i){
            if (visited[i]==false)
                DSFrec(i,visited);

        }


    }*/

    public static void main(String[] args) {

        DFSTraversal2 dfsTraversal2 = new DFSTraversal2(8);
      /*  dfsTraversal2.insertEdge(0,1);
        dfsTraversal2.insertEdge(0,2);
        dfsTraversal2.insertEdge(1,2);
        dfsTraversal2.insertEdge(2,3);
        dfsTraversal2.insertEdge(3,3);*/

        dfsTraversal2.insertEdge(0, 1);
        dfsTraversal2.insertEdge(0, 2);
        dfsTraversal2.insertEdge(0, 3);
        dfsTraversal2.insertEdge(1, 3);
        dfsTraversal2.insertEdge(2, 4);
        dfsTraversal2.insertEdge(3, 5);
        dfsTraversal2.insertEdge(3, 6);
        dfsTraversal2.insertEdge(4, 7);
        dfsTraversal2.insertEdge(4, 5);
        dfsTraversal2.insertEdge(5, 2);

        System.out.println(
                "Following is Depth First Traversal "
                        + "(starting from vertex 2)");
        dfsTraversal2.DSFr(0);

    }

}


//In Java, a boolean is a literal true or false, while Boolean is an object wrapper for a boolean.
//There is seldom a reason to use a Boolean over a boolean except in cases when an object reference is required,
// such as in a List.