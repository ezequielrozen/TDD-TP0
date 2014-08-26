package tp0.listaEnlazada;

public class LinkedList {

    BeginNode inicio;
    public LinkedList() {
        this.inicio = new BeginNode();        
    }

    public boolean isEmpty() {
        return this.inicio.getSize() == 0;
    }

    public int size() {
        return this.inicio.getSize();
    }

    public void agregarFinal(Object item) {
        this.inicio.addToEnd(null, new ContainerNode(item));
    }

    public Object verPrimero() {
        return this.inicio.getValue();
    }

    public void eliminarPrimero() {
        this.inicio.setLink(this.inicio.getNext().getNext());
    }
    
}
