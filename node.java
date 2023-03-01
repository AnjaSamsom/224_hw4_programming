import java.util.*;

public class node {
    private String name;
    private int distance;
    private ArrayList<node> pred;

    public node(String name, int distance)
    {
        this.name = name;
        this.distance = distance;
        pred = new ArrayList<node>();
    }

    public int get_distance()
    {
        return distance;
    }

    public void set_distance(int distance)
    {
        this.distance = distance;
    }

    public String get_name()
    {
        return name;
    }

    public ArrayList<node> get_pred()
    {
        return pred;
    }

    public void set_pred(node n)
    {
        pred.add(n);
    }




    
}
