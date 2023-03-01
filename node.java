import java.util.*;

public class node {
    private String name;
    private int distance;
    private node pred;

    public node(String name, int distance)
    {
        this.name = name;
        this.distance = distance;
        pred = null;
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

    public node get_pred()
    {
        return pred;
    }

    public void set_pred(node n)
    {
        pred = n;
    }




    
}
