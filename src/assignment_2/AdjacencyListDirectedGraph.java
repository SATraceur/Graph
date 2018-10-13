package assignment_2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class AdjacencyListDirectedGraph implements Graph {

    private List<Vertex> verticies = new ArrayList<>();                         // List of verticies within the graph.
    private Map<Vertex, Set<DirectedEdge>> edges = new TreeMap<>();             // Allows mapping a source vertex to a set of outgoing edges.
    private Map<Vertex, Double> distance = new HashMap<>();                     // Allows mapping a vertex to a distance value.
    private Map<Vertex, Vertex> previous = new HashMap<>();                     // Allows mapping a vertex to a previous vertex.
    
    @Override
    public List<Vertex> adjacentTo(String v) {                                
        return adjacentTo(new Vertex(v));
    }

    @Override
    // RETURNS A LIST OF ADJACENT VERTICES.
    public List<Vertex> adjacentTo(Vertex v) {                                  
        List<Vertex> adj = new ArrayList<>();                                   // Creates new adjacent vertex list.
        for(DirectedEdge e : edges.get(v)) {                                    // For each edge in hashset mapped to vertex v.
            adj.add(e.getTarget());                                             // Add adjacent vertex (target vertex) to list. 
        }
        return adj;                                                             // Return the list.
    }

    @Override
    // RETURNS A LIST OF VERTICES WITHIN THE GRAPH.
    public List<Vertex> getVerticies() {
        Collections.sort(this.verticies);
        return this.verticies;
    }
    
    @Override
    // ADDS VERTICES TO THE GRAPH.
    public void addVertex(String v) {          
        Vertex V = new Vertex(v);
        if(!this.verticies.contains(V)) {                                       // If the vertex is not already added.
            this.verticies.add(V);                                              // Add it to the graph.
            this.edges.put(V, new HashSet<>());                                 // Map vertex to new hashset of edges. 
        }      
    }

    @Override
    // ADDS THE TARGET AND SOURCE VERTICES TO THE GRAPH.
    // ADDS A DIRECTED EDGE BETWEEN 2 VERTICES.
    public void addEdge(String source, String target, int weight) {
        addVertex(source);
        addVertex(target);
        addEdge(new Vertex(source), new Vertex(target), weight);                // Add directed edge between the 2 verticies. 
    }

    @Override
    // CREATES AND MAPS THE NEW DIRECTED EDGE TO THE SOURCE VERTEX.
    public void addEdge(Vertex source, Vertex target, int weight) {
        this.edges.get(source).add(new DirectedEdge(source, target, weight));   // Add edge to mapped hashset. 
    }

    @Override
    public boolean hasEdge(String source, String target) {
        return hasEdge(new Vertex(source), new Vertex(target));
    }

    @Override
    // DETERMINES IF GRAPH CONTAINS A SPECIFIC DIRECTED EDGE.
    public boolean hasEdge(Vertex source, Vertex target) {
        for (DirectedEdge e : this.edges.get(source)) {                         // For each edge mapped to a source vertex.
            if(e.directedEdgeExists(source, target)) { return true; }           // See if the edge exists by comparing vertex labels.
        }    
        return false;                                                           // If edge was not found, return false.
    }
    
    @Override
    // RETURN A SET OF OUTGOING EDGES FROM A SOURCE VERTEX.
    public Set<DirectedEdge> getAdjacentEdges(Vertex source) { return this.edges.get(source); }

    @Override
    public boolean hasVertex(String v) { return hasVertex(new Vertex(v)); }

    @Override
    // DETERMINES IF THE GRAPH CONTAINS A SPECIFIC VERTEX.
    public boolean hasVertex(Vertex v) { return this.verticies.contains(v); }

    @Override
    // READS .GRAPHML AND .XML FILES INTO THE GRAPH
    public void readInFile(String fileName) {
        SAXBuilder builder = new SAXBuilder();

        try {
            Document xml = builder.build(new File(fileName));
            Element root = xml.getRootElement();
            Element graph = root.getChild("graph", root.getNamespace());
            List<Element> edgeList = graph.getChildren("edge", root.getNamespace()); // Create a list of edge elements.
            List<Element> nodeList = graph.getChildren("node", root.getNamespace()); // Create a list of node elements.
            
            for (Element e : edgeList) {                                             // Add edge objects to graph.
                this.addEdge(e.getAttributeValue("source"),
                        e.getAttributeValue("target"),
                        Integer.parseInt(e.getChildText("data", root.getNamespace())));
            }
            for (Element n : nodeList) {                                             // Add disconnected vertices.
                this.addVertex(n.getAttributeValue("id"));
            }
        } catch (JDOMException e) {
            System.out.println("JDOMException");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }

    @Override
    // EXECUTES DIJKSTRA'S ALGORITHM WITH A LINKED LIST.
    public void dijkstra(Vertex source) {   
        Queue<Vertex> q = new LinkedList<>();
        
        for(Vertex v : this.verticies) {                                        // For all verticies in graph
            if(v.equals(source)) { distance.put(source, 0.0);}                  // Set source distance to 0.
            else { distance.put(v, Double.MAX_VALUE); }                         // Set distance for all others in infinite.
            previous.put(v, null);                                              // Set all prev verticies to null.
            q.offer(v);                                                         // Add all verticies to queue.
        }

        while(!q.isEmpty()) {                                                                // While queue is not empty.
            for(Entry<Vertex, Double> entry : distance.entrySet()) {                         // Iterate though all verticies.    
                if(!q.contains(source))  { source = q.peek(); }                              // If q does not contain current, retrieve head of queue.
                if(entry.getValue() < distance.get(source) && q.contains(entry.getKey())) {  // If q contains vertex to be tested and current distance is < tested value.
                    source = entry.getKey();                                                 // Current vertex = vertex with smallest distance.
                }     
            }
            q.remove(source);                                                                // Remove current vertex from queue.
            
            for(DirectedEdge e : getAdjacentEdges(source)) {                                 // For each outgoing edge of current vertex.
                Vertex v = e.getTarget();                                                    // Get adjacent vertex.
                if(q.contains(v) && (distance.get(source) + e.getWeight() < distance.get(v))) {   // If adjacent vertex is in the queue and if its new distance is < current distance.
                    distance.replace(v, distance.get(source) + e.getWeight());           // Save new distance.
                    previous.replace(v, source);                                         // Store previous vertex in path.
                }
            }
        }   
    }
    
    @Override
    // EXECUTES DIJKSTRA'S ALGORITHM WITH A PRIORITY QUEUE.
    public void dijkstraPriorityQueue(Vertex source) {
        PriorityQueue<Vertex> queue = new PriorityQueue<>();
        
        for(Vertex v : this.verticies) {                                        // For all verticies in graph
            if(v.equals(source)) { distance.put(source, 0.0);}                  // Set source distance to 0.
            else { distance.put(v, Double.MAX_VALUE); }                         // Set distance for all others in infinite.
            previous.put(v, null);                                              // Set all prev verticies to null.                                                       
        }     
        queue.add(source);

        while(!queue.isEmpty()){                                                // While the queue is not empty.
            Vertex u = queue.poll();                                            // Get first vertex.
            for(DirectedEdge e : this.getAdjacentEdges(u)){                     // For all outgoing edges.
                double newDist = distance.get(u) + e.getWeight();               // Calculate new distance.
                if(newDist < distance.get(e.getTarget())) {                     // If new distance is less than the targets distance.
                    queue.remove(e.getTarget());                                // Remove target vertex from the queue
                    distance.replace(e.getTarget(), newDist);                   // Replace target vertex's distance with new distance.
                    previous.replace(e.getTarget(), u);                         // Set current vertex to target vertex's previous.    
                    queue.add(e.getTarget());					// Add target to the queue.      
                }
            }
        }
    }
      
    @Override
    // EXECUTES DIJKSTRA'S ALGORITHM WITH A CUSTOM MIN HEAP                     
    public void customDijkstraMinHeap(Vertex source) {
        for(Vertex v : this.verticies) {                                        // For all verticies in graph
            if(v.equals(source)) { distance.put(source, 0.0);}                  // Set source distance to 0.
            else { distance.put(v, Double.MAX_VALUE); }                         // Set distance for all others in infinite.
            previous.put(v, null);                                              // Set all prev verticies to null.                                                       
        }     
        
        MinHeap heap = new MinHeap(this.verticies.size());                      // Create new MinHeap
        heap.insert(source, distance.get(source));                              // Insert source vertex.
        
        while(!heap.isEmpty()) {                                                // While the heap is not empty.
            Vertex current = heap.remove();                                     // Remove vertex at top of heap.
            
            for(DirectedEdge e : this.getAdjacentEdges(current)) {              // For each outgoing edge.
                Vertex v = e.getTarget();                                       // Get the target vertex.
                double newDist = distance.get(current) + e.getWeight();             // Calculate the new distance.
                if(newDist < distance.get(v)) {                                     // If the new distance is less than the current distance.
                    distance.put(v, newDist);                                       // Store new distance.
                    previous.put(v, current);                                   // Store previous vertex in path.
                    heap.insert(v, distance.get(v));                            // Insert updated vertex into heap.
                }
            }
        }      
    }
    
    @Override
    // RETURNS THE SHORTEST PATH TO A GIVEN VERTEX.
    public List<Vertex> pathTo(Vertex to) {
         Stack<Vertex> path = new Stack<>();
         while (distance.containsKey(to)) {                                     // While the vertex exists within the HashMap.
             path.push(to);                                                     // Add the vertex to the stack.
             to = previous.get(to);                                             // Set current vertex to mapped previous vertex.
         }
         Collections.reverse(path);                                             // Reverse the list.
         return path; 
    } 
    
    @Override
    // PRINTS THE MINIMUM DISTANCES TO ALL VERTICES.
    public void printDistances() {  
        for(Vertex v : this.getVerticies()) {                                   // For each vertex
            GUI.jTextArea2.append("shortest path to " + v + ":");               
            if(pathTo(v) != null && distance.get(v) != Double.MAX_VALUE) {      // If no path exists and the distance is not infinite.
                for(Vertex w : pathTo(v)) { GUI.jTextArea2.append(" " + w); }   // Print the shortes path to the current vertex.
                GUI.jTextArea2.append(": cost = " + distance.get(v) + "\n");    // Print the distance to that vertex.
            } else {
                GUI.jTextArea2.append(" NO PATH\n");                            // Else, print NO PATH.
            }           
        }       
    }
    
//    @Override
//    // USED FOR TESTING PURPOSES TO PRINT TO SYSTEM.OUT
//    public void printDistances() {  
//        for(Vertex v : this.getVerticies()) {
//            System.out.print("shortest path to " + v + ":"); 
//            if(pathTo(v) != null && distance.get(v) != Integer.MAX_VALUE) {
//                for(Vertex w : pathTo(v)) { System.out.print(" " + w); }
//                System.out.print(": cost = " + distance.get(v) + "\n");
//            } else {
//                System.out.print(" NO PATH\n");
//            }           
//        }       
//    }
    
    @Override
    // PRINT ALL OUTGOING EDGES FROM A GIVEN VERTEX.
    public void printOutgoingEdges(String vertex) {
        Vertex v = new Vertex(vertex);
        GUI.jTextArea2.append("Vertex " + v + " has the following outgoing edges\n");
        for(DirectedEdge e : getAdjacentEdges(v)) {                             // For each outgoing edge of a given vertex.
            GUI.jTextArea2.append(e + "\n");                                    // Print the edge.
        }     
    }

    @Override
    // PRINT THE GRAPH.
    public void printGraph() {
        Collections.sort(this.verticies);
        GUI.jTextArea1.append("This graph contains the vertices: " + this.verticies + "\n");
        for (Vertex v : this.verticies) {
            GUI.jTextArea1.append("Vertex " + v + " connects to: ");
            List<Vertex> adjVList = adjacentTo(v);
            for (Vertex av : adjVList) {
                GUI.jTextArea1.append(av + " ");
            }
            GUI.jTextArea1.append("\n");
        }    
    }
}