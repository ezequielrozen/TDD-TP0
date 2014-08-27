package tp0.listaEnlazada;

public class BeginNode implements Node{
    
    private Node next;

    public BeginNode() {
        this.next = new EndNode();
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
    public Object getValue() {
        return this.next.getValue();
    }

    @Override
    public void addToEnd(Node previous, Node newNode) {
        this.next.addToEnd(this,newNode);
    }

    @Override
    public int getSize() {
        return this.next.getSize();
    }
    
}
