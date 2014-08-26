package tp0.cola;

import tp0.listaEnlazada.LinkedList;

public class LinkedQueue implements Queue{
    
    LinkedList listaInterna;

    public LinkedQueue() {
        this.listaInterna = new LinkedList();
    }    
    
    @Override
    public boolean isEmpty() {
        return this.listaInterna.isEmpty();
    }

    @Override
    public int size() {
        return this.listaInterna.size();
    }

    @Override
    public void add(Object item) {
        this.listaInterna.agregarFinal(item);
    }

    @Override
    public Object top() {
        return this.listaInterna.verPrimero();
    }

    @Override
    public void remove() {
        this.listaInterna.eliminarPrimero();
    }
    
}
