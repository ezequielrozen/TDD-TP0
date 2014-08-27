package tp0.cola;

import tp0.listaEnlazada.LinkedList;

public class LinkedQueue implements Queue{
    
    LinkedList innerList;

    public LinkedQueue() {
        this.innerList = new LinkedList();
    }    
    
    @Override
    public boolean isEmpty() {
        return this.innerList.isEmpty();
    }

    @Override
    public int size() {
        return this.innerList.size();
    }

    @Override
    public void add(Object item) {
        this.innerList.addToEnd(item);
    }

    @Override
    public Object top() {
        return this.innerList.first();
    }

    @Override
    public void remove() {
        this.innerList.removeFirst();
    }
    
}
