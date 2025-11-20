import java.util.Iterator;
import java.util.LinkedList;

public class StackLinkedList<T> implements Iterable<T>{
    private LinkedList<T> s = new LinkedList<T>();

    public boolean isEmpty(){ return s.isEmpty(); }
    public int size()       { return s.size();};

    public StackLinkedList() {
        this.s = new LinkedList<>();
    }

    public void push(T item)
    {
        s.add(item);
    }

    public StackLinkedList<T> copy() {
        Iterator<T> itKevin = iterator();
        StackLinkedList<T> copyStack = new StackLinkedList<>();
        while (itKevin.hasNext()){
            T item = itKevin.next();
            System.out.println(item + " Wird jetzt gepushed in den Copied");
            copyStack.push(item);
        }
        return copyStack;
    }

    public T pop()
    { return s.removeLast(); }

    @Override
    public Iterator<T> iterator()
    { return new ReverseIteratorKevin(); }

    private class ReverseIteratorKevin implements Iterator<T>
    {
        private int i = 0;
        public boolean hasNext()    { return i > s.size() - 1;  }
        public T next()             { return s.get(++i); }
        public void remove()        {                }
    }
}
