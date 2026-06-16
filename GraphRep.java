
import java.util.*;

class Edge{
    int src;
    int dest;
    int wgt;

    //constructor
    public Edge(int s, int d, int w){
        this.src=s;
        this.dest=d;
        this.wgt=w;
    }
}


public class GraphRep{

    static void addEdge(ArrayList<Edge>[] graph,int u,int v,int w){
        graph[u].add(new Edge(u,v,w));
        graph[v].add(new Edge(v,u,w)); //remove for directed graph
    }

    public static void main(String args []){

                //    (5)
                //  0-----1
                //    (1)/ \(3)
                //      /   \
                //     2-----3
                // (2) |  (1)
                //     |
                //     4
        Scanner sc = new Scanner(System.in);

        //vertices V
         
        int V=sc.nextInt();
        
        ArrayList<Edge> [] graph = new ArrayList [V]; //null->empty arraylist

        for(int i=0;i<V;i++){

           graph[i]=new ArrayList<>();

        }

        addEdge(graph,0,1,5);
        addEdge(graph,1,2,1);
        addEdge(graph,1,3,1);
        addEdge(graph,2,3,1);
        addEdge(graph,2,4,2);

     
        // //0 vertex
        // graph[0].add(new Edge(0,1,5));

        // //1 vertex
        // graph[1].add(new Edge(1,0,5));
        // graph[1].add(new Edge(1,2,1));
        // graph[1].add(new Edge(1,3,3));

        // //2 vertex
        // graph[2].add(new Edge(2,1,1));
        // graph[2].add(new Edge(2,3,1));
        // graph[2].add(new Edge(2,4,4));

        // //3 vertex
        // graph[3].add(new Edge(3,1,3));
        // graph[3].add(new Edge(3,2,1));

        // //4 vertex
        // graph[4].add(new Edge(4,2,2));

        //printing the graph

        for(int i=0;i<V;i++){
            System.out.println(i+" -> ");
            for(Edge e:graph[i]){
                System.out.println("( "+e.src+" , "+e.dest+" , "+e.wgt+" )");
            }

            System.out.println();
        }

    }

}