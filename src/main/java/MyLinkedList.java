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
        if (index == 0) {
            addFirst(e);
        } else if (index == numNodes) {
            addLast(e);
        } else {
            Node<E> temp = head;
            Node<E> holder;
            for (int i = 0; i < index-1 && temp.getNext() != null; i++) {
                temp = temp.getNext();
            }
            holder = temp.getNext();
            temp.setNext(new Node<>(e));
            temp.getNext().setNext(holder);
            numNodes++;
        }

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
            System.out.print(temp.getData()+" ");
            temp = temp.getNext();
        }
    }
    public E removeFirst() {
        if (numNodes == 0) {
            return null;
        } else {
            Node<E> temp = head;
            head = head.getNext();
            numNodes--;
            if(head == null) tail = null;
            return temp.getData();
        }
    }
    public E removeLast() {
        if(numNodes == 0) return null;
        else if (numNodes == 1) {
            Node<E> temp = head;
            head = tail = null;
            numNodes = 0;
            return temp.getData();
        } else {
            Node<E> current = head;
            for (int i = 0; i < numNodes - 2; i++) {
                current = current.getNext();
            }
            Node<E> temp = tail;
            tail = current;
            tail.setNext(null);
            numNodes--;
            return temp.getData();
        }
    }
    public E remove(int index) {
        if(index<0||index>numNodes)return null;
        else if(index ==0)return removeFirst();
        else if (index == numNodes) {
            return removeLast();
        } else {
            Node<E> previous = head;
            for (int i = 1; i < index; i++) {
                previous = previous.getNext();
            }
            Node<E> current = previous.getNext();
            previous.setNext(current.getNext());
            numNodes--;
            return current.getData();
        }
    }
}
