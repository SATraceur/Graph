package assignment_2;

public class DirectedEdge {
    
    private Vertex source, target;
    private double weight;
    
    public DirectedEdge(Vertex source, Vertex target, int weight) {
        this.source = source;
        this.target = target;
        this.weight = weight;
    }
    
    public void setWeight(int weight) { this.weight = weight; }
    
    public double getWeight() { return this.weight; }
    
    // Compares given source and target vertices to source and target vertices of this edge.
    public boolean directedEdgeExists(Vertex Source, Vertex Target) { 
        return Source.toString().equals(this.source.toString()) && Target.toString().equals(this.target.toString()); 
    }
        
    public Vertex getSource() { return this.source; }
    
    public Vertex getTarget() { return this.target; }
    
    @Override
    public String toString() {
        return "Source: " + this.source + " | Target " + this.target + " | Weight " + this.weight;
    }
}
