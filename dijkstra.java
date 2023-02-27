import java.util.*;

/**
 * Anja Samsom HW 2 Programming
 * CS 224
 */
public class dijkstra
{
   // got information about making an adjacency list with an arraylist and a linkedlist from
   // https://stackoverflow.com/questions/14783831/java-implementation-of-adjacency-list
   private static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
   private static int inf = 9999;
   private static int num_of_nodes = 8;

   public static void main(String[]args)
   {
      System.out.println("Graph is represented using an edge list with an edge being an ArrayList (x,y,z) meaning there is a directed edge from x to y with a weight of z.");
      graph = make_graph();
   }

   public static int extract_min()
   {
      return 0;
      
   }


   public static int change_key()
   {
      return 0;
      
   }

   public static int run_dijkstra(ArrayList<ArrayList<Integer>>graph, int s)
   {
      ArrayList<Integer> Q = new ArrayList<Integer>();
      for( int i=0; i<num_of_nodes; i++)
      {
         Q.add(inf);
      }

      // update distance to s to be zero

      Q.set(s-1, 0);

      // S = minimum orinted binary heap


      int v;
      while(Q.size()!=0)
      {
         v = extract_min();
         S.add(v);

         //for each edge v,w where 

      }
      return s;
   }

   public static boolean w_in_S(int v, int w, int S)
   {
      return true;
   }

   /**
   * makes the tree, does not take input, returns the tree 
   */
    public static ArrayList<ArrayList<Integer>> make_graph()
    {

      ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();


      // edge 1
      ArrayList<Integer> edge1 = new ArrayList<Integer>();
      edge1.add(0);
      edge1.add(2);
      edge1.add(9);

      // edge 2
      ArrayList<Integer> edge2 = new ArrayList<Integer>();
      edge2.add(0);
      edge2.add(4);
      edge2.add(14);

      // edge 3
      ArrayList<Integer> edge3 = new ArrayList<Integer>();
      edge3.add(0);
      edge3.add(3);
      edge3.add(15);
      
      // edge 4
      ArrayList<Integer> edge4 = new ArrayList<Integer>();
      edge4.add(2);
      edge4.add(7);
      edge4.add(23);

      // edge 5
      ArrayList<Integer> edge5 = new ArrayList<Integer>();
      edge5.add(4);
      edge5.add(7);
      edge5.add(18);

      // edge 6
      ArrayList<Integer> edge6 = new ArrayList<Integer>();
      edge6.add(4);
      edge6.add(5);
      edge6.add(30);

      // edge 7
      ArrayList<Integer> edge7 = new ArrayList<Integer>();
      edge7.add(4);
      edge7.add(3);
      edge7.add(5);

      // edge 8
      ArrayList<Integer> edge8 = new ArrayList<Integer>();
      edge8.add(3);
      edge8.add(5);
      edge8.add(20);

      // edge 9
      ArrayList<Integer> edge9 = new ArrayList<Integer>();
      edge9.add(3);
      edge9.add(8);
      edge9.add(44);

      // edge 10
      ArrayList<Integer> edge10 = new ArrayList<Integer>();
      edge10.add(5);
      edge10.add(6);
      edge10.add(11);

      // edge 11
      ArrayList<Integer> edge11 = new ArrayList<Integer>();
      edge11.add(5);
      edge11.add(8);
      edge11.add(16);

      // edge 12
      ArrayList<Integer> edge12 = new ArrayList<Integer>();
      edge12.add(5);
      edge12.add(7);
      edge12.add(2);

      // edge 13
      ArrayList<Integer> edge13 = new ArrayList<Integer>();
      edge13.add(6);
      edge13.add(7);
      edge13.add(6);

       // edge 14
      ArrayList<Integer> edge14 = new ArrayList<Integer>();
      edge14.add(6);
      edge14.add(8);
      edge14.add(6);

      // edge 15
      ArrayList<Integer> edge15 = new ArrayList<Integer>();
      edge15.add(7);
      edge15.add(8);
      edge15.add(19);

      graph.add(edge1);
      graph.add(edge2);
      graph.add(edge3);
      graph.add(edge4);
      graph.add(edge5);
      graph.add(edge6);
      graph.add(edge7);
      graph.add(edge8);
      graph.add(edge9);
      graph.add(edge10);
      graph.add(edge11);
      graph.add(edge12);
      graph.add(edge13);
      graph.add(edge14);
      graph.add(edge15);

      return graph;
   }
   
   
   
   
   
   
}