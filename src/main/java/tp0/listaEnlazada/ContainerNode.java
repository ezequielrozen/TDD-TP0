package tp0.listaEnlazada;

public class ContainerNode implements Node{
    
    private Object dato;
    private Node siguiente;
    
    ContainerNode(Object item) {
        this.dato = item;
    }

    @Override
    public Object getValue() {
        return this.dato;
    }

    @Override
    public Node getNext() {
        return this.siguiente;
    }

    @Override
    public Node setLink(Node siguiente) {
        return this.siguiente = siguiente;
    }

    @Override
    public void addToEnd(Node previous, Node newNode) {
        this.siguiente.addToEnd(this,newNode);
    }

    @Override
    public int getSize() {
        return 1 + this.siguiente.getSize();
    }
    
    
}
