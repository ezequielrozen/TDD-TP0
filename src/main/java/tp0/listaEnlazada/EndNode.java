package tp0.listaEnlazada;

class EndNode implements Node {

    public EndNode() {
    }

    @Override
    public Object getValue() {
        throw new AssertionError();
    }

    @Override
    public Node getNext() {
        throw new AssertionError();
    }

    @Override
    public Node setLink(Node next) {
        throw new AssertionError();
    }

    @Override
    public void addToEnd(Node previous, Node newNode) {
        previous.setLink(newNode).setLink(this);
    }

    @Override
    public int getSize() {
        return 0;
    }
    
}
