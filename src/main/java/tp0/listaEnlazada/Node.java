package tp0.listaEnlazada;

public interface Node {
    public Object getValue();
    public Node getNext();
    public Node setLink(Node next);
    public void addToEnd(Node previous, Node newNode);
    public int getSize();
}
