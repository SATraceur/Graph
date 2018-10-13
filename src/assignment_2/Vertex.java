package assignment_2;

import java.util.Objects;

public class Vertex implements Comparable<Vertex> {

    private String label;

    public Vertex(String label) { this.label = label; }
    
    public String getLabel() { return this.label; }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.label);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj == null) { return false; }
        if(getClass() != obj.getClass()) { return false; }
        final Vertex other = (Vertex) obj;
        if(!Objects.equals(this.label, other.label)) { return false ;}
        return true;
    }

    @Override
    public int compareTo(Vertex v) {
        return Integer.valueOf(this.label).compareTo(Integer.valueOf(v.label));
    }
    
    @Override
    public String toString() { return this.label; }
         
}
