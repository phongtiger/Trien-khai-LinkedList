public class Test {
    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList("11");
        for (int i = 10; i > -1; i--) {
            linkedList.addFirst(""+ i);
        }
        linkedList.printList();
        System.out.println("\n");
        System.out.println(linkedList.remove(7));
    }
}
