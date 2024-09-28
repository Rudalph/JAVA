package DataStructures;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class Graph {
    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
           this.src=s;
           this.dest=d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
           graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[5].add(new Edge(6, 5));
    }

    public static void bfs(ArrayList<Edge> graph[], int V){
        Queue<Integer> q = new LinkedList<>();
        boolean [] vis = new boolean [V];
        q.add(0);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr]==false){
                System.out.println(curr+" ");
                vis[curr]=true;
                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }

    }
    public static void dfs(ArrayList<Edge> graph [], int curr, boolean vis[]){
         System.out.println(curr+" ");
         vis[curr] = true;
         for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(vis[e.dest]==false){
                dfs(graph, e.dest, vis);
            }
            
         }
    }
    public static void main(String[] args) {
        int V=7;

        ArrayList<Edge> graph [] = new ArrayList[V]; //When I create such array every index have null value and I cannot store values at null so I iterate a forloop and create a empty list at each index
        
        createGraph(graph);
        
        //print 2's neighbour

        // for(int i=0; i<graph[2].size(); i++){
        //     Edge e = graph[2].get(i);
        //     System.out.println(e.src+ " " + e.dest);
        // }

        // bfs(graph, V);
        // System.out.println("");

        boolean vis [] = new boolean[V];
        dfs(graph, 0, vis);
        System.out.println("");
    }
}





/*How to represent graph in code
 1] Adjacency List =============> ArrayList<Edge> graph [v]  an array will be created and at every index a arraylist will be stored  v==total vertices
vertex-wise  List of Lists  
0=>{0,2} list 1
1=>{1,2}, {1,3} list 2
2=>{2,0}, {2,1}, {2,3} list 3
3=>{3,1}, {3,2} list 4

 Adjacency Matrix 
 Edge list
 2d matrix 

 There are two traversal techniques BFS and DFS

 BFS go to all immediate neighbours
 1 visited array boolean type initially false once visited true 
 1 queue initially 1st node after wards jo nikala uske nieghbours
 while(queue is not empty)
 if(vis[curr]==f)
 print(curr)
 vis[curr]=t
 add neighbours of current nodes in q


 graps has disconnected componets garphs with no connections 


 DFS Depth First Search
kepp going toward the first neighbour
*/

