import java.util.LinkedList;

public class StackLinkedList<T> {
    private LinkedList<T> s = new LinkedList<T>();

    public boolean isEmpty(){ return s.isEmpty(); }
    public int size()       { return s.size();};
    public void push(T item)
    {
        s.add(item);
    }

    public T pop()
    { return s.removeLast(); }

}
