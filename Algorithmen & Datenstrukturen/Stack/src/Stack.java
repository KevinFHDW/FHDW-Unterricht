/**
 ** 
 * @author Udo
 * Stack with generics
 * Stack with variable size
 * Stack iterable
 */

import java.util.Iterator;

public class Stack<T> implements Iterable<T>{
    private T[] a;
    private int N;

    public Stack(int cap)
    {	a = (T[]) new Object[cap]; }

    public boolean isEmpty(){ return N == 0; }
    public int size()       { return N;};
    public boolean isFull(){
        return a.length == N;
    }

    public void push(T item) 
    { 
    	if (N == a.length)
            resize(2*a.length);
        a[N++] = item;
    }
    
    public T pop() 
    { return a[--N]; }
    
    private void resize(int max)
    {
	T[] temp = (T[])new Object[max];
	for (int i = 0; i < N; ++i)
		temp[i] =a[i];
	a  =  temp;
    }
    
    public Iterator<T> iterator()
    { return new ReverseArrayIterator(); }
     
    private class ReverseArrayIterator implements Iterator<T>
    {
        private int i = N;
        public boolean hasNext()    { return i > 0;  }
        public T next()             { return a[--i]; }
        public void remove()        {                }
    }
}
