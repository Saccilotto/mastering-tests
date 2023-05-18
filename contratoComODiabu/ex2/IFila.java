public interface IFila { 
    public void enqueue(int v); 
    public int dequeue(); 
    public int first(); 
    public int last(); 
    public int size(); 
    boolean isEmpty(); 
    boolean isFull(); 
}