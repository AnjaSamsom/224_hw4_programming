public class edge {
    private node source;
    private node destination;
    private int weight;

    public edge(node source, node destination, int weight)
    {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public int get_weight()
    {
        return weight;
    }

    public node get_source()
    {
        return source;
    }

    public node get_destination()
    {
        return destination;
    }
    
}
