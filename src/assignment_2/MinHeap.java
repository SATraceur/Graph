package assignment_2;

public class MinHeap {

    private Vertex[] mH;
    private double[] distance;
    private int position;
    
    public MinHeap(int size){
        mH = new Vertex[size];
        distance = new double[size];
        position = 0;
    }
    
    public boolean isEmpty() { return this.position == 0; }
        
    public void insert(Vertex v, double distance){
        this.mH[position] = v;
        this.distance[position] = distance; 
        siftUp(position);
        position++;
    }
    
    public Vertex remove() {
        Vertex top = this.mH[0];
        this.mH[0] = this.mH[position-1];
        this.distance[0] = this.distance[position-1];
        siftDown(0);
        position--;
        return top;
    }
                
    private void siftDown(int index) {
        if(distance[index] > distance[getRightChild(index)] && !isNull(getRightChild(index)) && checkBoundary(getRightChild(index))) {
            siftDown(swap(index, getRightChild(index)));
        } else if (distance[index] < distance[getRightChild(index)] && distance[index] > distance[getLeftChild(index)] && !isNull(getLeftChild(index)) && checkBoundary(getLeftChild(index))) {
            siftDown(swap(index, getLeftChild(index)));
        }      
    }

    private void siftUp(int index){
        if(distance[index] < distance[getParent(index)] && !isNull(getParent(index))) {
            siftUp(swap(index, getParent(index)));
        }
    }
    
    private int getParent(int index) { return (index-1)/2; }
    
    private int getLeftChild(int index) { return (2*index)+1; }
    
    private int getRightChild(int index) { return (2*index)+2; }
    
    private boolean checkBoundary(int index) { return ((2*index)+2) < position; }
    
    private boolean isNull(int index) { return mH[index] == null; }
 
    public int swap(int a, int b){
            Vertex tempV = this.mH[a];
            this.mH[a] = this.mH[b];
            mH[b] = tempV;
            
            double tempD = this.distance[a];
            this.distance[a] = this.distance[b];
            this.distance[b] = tempD;
            
            return b;
    }
}
