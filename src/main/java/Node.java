public class Node<E> {
    private Node<E> next;
    private E data;

    public Node(E e) {
        this.data = e;
    }
    public E getData() {
        return this.data;
    }
    public Node<E> getNext() {
        return next;
    }
    public void setNext(Node<E> next) {
        this.next = next;
    }
}
