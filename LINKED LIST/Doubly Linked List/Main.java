public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(5);
        dll.insertInLinkedList(6, 1);
        dll.insertInLinkedList(7, 4);
        dll.insertInLinkedList(8, 2);
        dll.insertInLinkedList(9, 0);
        dll.traverseDLL();
        dll.retraverseDLL();
        dll.deleteInLinkedList(2);
        dll.traverseDLL();
        dll.retraverseDLL();
        dll.deleteDLL();
    }
}
