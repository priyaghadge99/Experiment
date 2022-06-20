package Algorithm;

import java.util.Iterator;
import java.util.LinkedList;

import java.util.Queue;

public class BFSTraversal {
    private int vertex;
    private LinkedList<Integer> adj[];
    private Queue<Integer> queue;
    public BFSTraversal(int v) {    //constructor
        vertex = v;
        adj = new LinkedList[v];
        for (int i=0;i<v;++i){
            adj[i] = new LinkedList();

        }
        queue = new LinkedList<Integer>();
    }

    private void insertEdge(int v, int w) {
        adj[v].add(w);
        /* adding an edge to the adjacency list (edges are bidirectional in this example) */
    }

    private void BFS(int n) {
        boolean node[] = new boolean[vertex];
        int a = 0;
        node[n] = true;
        queue.add(n); /* root node is added to the top of the queue */

        while (queue.size() != 0) {
            n = queue.poll();  /* remove the top element of the queue */
            System.out.print(n + " ");    /* print the top element of the queue */
           /* for (int i = 0; i < adj[n].size(); i++)  *//* iterate through the linked list and push all neighbors into queue *//* {
                a = adj[n].get(i);
            }
            if (!node[a]){  //only insert which is not visited earlier.


                node[a]= true;
                queue.add(a);
            }*/

            // Get all adjacent vertices of the dequeued vertex n
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it (insert)

            Iterator<Integer> i = adj[n].listIterator();
            while (i.hasNext())
            {
               int  p = i.next();
                if (!node[p])
                {
                    node[p] = true;
                    queue.add(p);
                }
            }

        }
    }
    public static void main(String[] args) {

        BFSTraversal graph = new BFSTraversal(4);
        graph.insertEdge(0, 1);
        graph.insertEdge(0, 2);
        graph.insertEdge(1, 2);
        graph.insertEdge(2, 0);
        graph.insertEdge(2, 3);
        graph.insertEdge(3,3);

        System.out.println("Breadth First traversal for graph is ---: ");
        graph.BFS(2);  //it will start from vertex 2
    }




}


// Breadth-First Search algorithm in Java makes it much easier to deal with the adjacency list
// since we only have to travel through the list of nodes
// attached to each node once the node is dequeued from the head (or start) of the queue.

/*
* 24758
*
* */