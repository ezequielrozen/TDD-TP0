package tp0.listaEnlazada;

public class ContainerNode implements Node{
    
    private Object data;
    private Node next;
    
    ContainerNode(Object item) {
        this.data = item;
    }

    @Override
    public Object getValue() {
        return this.data;
    }

    @Override
    public Node getNext() {
        return this.next;
    }

    @Override
    public Node setLink(Node siguiente) {
        return this.next = siguiente;
    }

    @Override
    public void addToEnd(Node previous, Node newNode) {
        this.next.addToEnd(this,newNode);
    }

    @Override
    public int getSize() {
        return 1 + this.next.getSize();
    }
    
    
}
