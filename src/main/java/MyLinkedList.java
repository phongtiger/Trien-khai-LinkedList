public class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int numNodes;
    public MyLinkedList(E e) {
        tail=head = new Node<>(e);
    }

    public MyLinkedList() {

    }

    public void add(int index, E e) {
        Node<E> temp = head;
        Node<E> holder;
        for (int i = 0; i < index - 1 && temp.getNext() != null; i++) {
            temp = temp.getNext();
        }
        holder = temp.getNext();
        temp.setNext(new Node<E>(e));
        temp.getNext().setNext(holder);
        numNodes++;
    }//chen node vao vij tri index
    public void addFirst(E e) {
        Node<E> temp = head;// chen node vao vi tri dau tien
        head = new Node<E>(e);
        head.setNext(temp);
        numNodes++;
    }
    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        if (tail == null) {
            head = tail = new Node<>(e);
        } else {
            tail.setNext(newNode);
            tail = tail.getNext();
        }
        numNodes++;
    }
    public Node<E> get(int index) {
        Node<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }
    public void printList() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
}
