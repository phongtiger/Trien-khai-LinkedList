public class Test {
    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList("goc");
        linkedList.addFirst("xinchao");
        linkedList.addFirst("thank");
        linkedList.addLast("them cuoi thanh cong");
        linkedList.add(0,"hello");
        linkedList.printList();
    }
}
