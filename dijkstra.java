import java.util.*;


/**
 * Anja Samsom HW 2 Programming
 * CS 224
 */
public class dijkstra
{
   // got information about making an adjacency list with an arraylist and a linkedlist from
   // https://stackoverflow.com/questions/14783831/java-implementation-of-adjacency-list
   private static ArrayList<edge> graph = new ArrayList<edge>();
   private static int inf = 9999;
   public static node ns = new node("s", 0);
   public static node n2 = new node("2", 0);
   public static node n3 = new node("3", 0);
   public static node n4 = new node("4", 0);
   public static node n5 = new node("5", 0);
   public static node n6 = new node("6", 0);
   public static node n7 = new node("7", 0);
   public static node nt = new node("t", 0);

   public static void main(String[]args)
   {
      System.out.println("Graph is represented using an edge list with an edge being an ArrayList (x,y,z) meaning there is a directed edge from x to y with a weight of z.");
      graph = make_graph();
      ArrayList<node> S = run_dijkstra(graph, ns);
      
      for(node n : S )
      {
         System.out.println(n + " - ");
      }

   }


   public static node extract_min(PriorityQueue<node> Q)
   {
      return Q.poll();
      
   }

   public static void change_key(PriorityQueue<node> Q, node w, int distance)
   {
      Q.remove(w);
      w.set_distance(distance);
      Q.offer(w);

      
   }

   public static ArrayList<node> run_dijkstra(ArrayList<edge> graph, node s)
   {
      // minimum oriented binary heap is Q
      // https://stackoverflow.com/questions/58714930/priority-queue-min-heap-ordering-in-java
      // https://docs.oracle.com/javase/7/docs/api/java/util/PriorityQueue.html

      Comparator<node> result = new Comparator<node>() {
         @Override
         public int compare(node n1, node n2){
            int d1 = n1.get_distance();
            int d2 = n2.get_distance();

            if(d1 > d2)
            {
               return 1;
            }
            else if(d1 < d2)
            {
               return -1;
            }
            else
            {
               return 0;
            }
         }
     };
     PriorityQueue<node> Q = new PriorityQueue(8, result);     
     
     // set distance to infinity
      ns.set_distance(inf);
      n2.set_distance(inf);
      n3.set_distance(inf);
      n4.set_distance(inf);
      n5.set_distance(inf);
      n6.set_distance(inf);
      n7.set_distance(inf);
      nt.set_distance(inf);

      // set the distance of node s to zero
      s.set_distance(0);

      // S is an empty list
      ArrayList<node> S = new ArrayList<node>();

      // predecessor list
      ArrayList<node> T = new ArrayList<node>();


      while(Q.size() != 0)
      {
         // v is equal to the min of Q
         node v = extract_min(Q);

         // add v to S
         S.add(v);

         // keep track of predecessors
         if(v != s)
         {
            T.add(v);
         }

         // for each edge e = (v,w), such that w is not in S
         for(edge e : graph)
         {
            node source = e.get_source();
            node dest = e.get_destination();
            boolean w_in_Q = in_Q(Q, dest);
            if(source == v && w_in_Q)
            {
               // if distance to v + weight of edge e < distance to w
               if(v.get_distance() + e.get_weight() < dest.get_distance() )
               {
                  // distance of w = distance to v + weight of edge e
                  dest.set_distance(v.get_distance() + e.get_weight());

                  // change_key(Q, w, distance of w)
                  // this updates the distance of w in Q



               }

            }
         }


      }



      return S;
   }

   public static boolean in_Q(PriorityQueue<node> Q, node w)
   {

      return Q.contains(w);
   }


   /**
   * makes the graph, does not take input, returns the tree 
   */
    public static ArrayList<edge> make_graph()
    {

      ArrayList<edge> graph = new ArrayList<edge>();



      graph.add(new edge(ns,n2,9));
      graph.add(new edge(ns, n4, 14));
      graph.add(new edge(ns, n3, 15));
      graph.add(new edge(n2, n7, 23));
      graph.add(new edge(n4, n7, 18));
      graph.add(new edge(n4, n5, 30));
      graph.add(new edge(n4, n3, 5));
      graph.add(new edge(n3, n5, 20));
      graph.add(new edge(n5, n6, 11));
      graph.add(new edge(n7, n5, 2));
      graph.add(new edge(n3, nt, 44));
      graph.add(new edge(n5, nt, 16));
      graph.add(new edge(n6, n7, 6));
      graph.add(new edge(n6, nt, 6));
      graph.add(new edge(n7, nt, 19));

      return graph;
   }
   
   
   
   
   
   
}