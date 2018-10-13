package assignment_2;

import java.util.Scanner;

public class Tester { // JUST A TESTER CLASS, RUN GUI!

    public static void main(String[] args) {
        Graph g = new AdjacencyListDirectedGraph();

        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] input = line.split(" ");
        
        g.readInFile(input[0]);
    //    g.printGraph();
        
        g.dijkstra(new Vertex(input[1]));
        g.printDistances();

    }
    
}
