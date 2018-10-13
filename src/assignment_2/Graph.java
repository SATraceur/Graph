package assignment_2;

import java.util.List;
import java.util.Set;

public interface Graph {
        
    public List<Vertex> getVerticies();
    
    public List<Vertex> adjacentTo(String v);

    public List<Vertex> adjacentTo(Vertex v);
        
    public void addEdge(String source, String target, int weight);
    
    public void addEdge(Vertex source, Vertex target, int weight);
    
    public void addVertex(String v);
    
    public boolean hasEdge(String source, String target);
    
    public boolean hasEdge(Vertex source, Vertex target);
    
    public Set<DirectedEdge> getAdjacentEdges(Vertex source);
    
    public boolean hasVertex(String v);
    
    public boolean hasVertex(Vertex v);
        
    public void readInFile(String fileName);
    
    public void printGraph();
    
    public void dijkstra(Vertex source);
    
    public void dijkstraPriorityQueue(Vertex source);
    
    public void customDijkstraMinHeap(Vertex source);
    
    public void printDistances();
    
    public void printOutgoingEdges(String vertex);
    
    public List<Vertex> pathTo(Vertex to);
        
}
