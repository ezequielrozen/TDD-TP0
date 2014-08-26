package tp0.listaEnlazada;

public class BeginNode implements Node{
    
    private Node siguiente;

    public BeginNode() {
        this.siguiente = new EndNode();
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
    public Object getValue() {
        return this.siguiente.getValue();
    }

    @Override
    public void addToEnd(Node previous, Node newNode) {
        this.siguiente.addToEnd(this,newNode);
    }

    @Override
    public int getSize() {
        return this.siguiente.getSize();
    }
    
}
