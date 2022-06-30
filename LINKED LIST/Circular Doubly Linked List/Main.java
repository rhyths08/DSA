public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createDLL(5);
        cdll.insertInLinkedList(6, 1);
        cdll.insertInLinkedList(7, 4);
        cdll.insertInLinkedList(8, 2);
        cdll.insertInLinkedList(9, 0);
        cdll.traverseDLL();
        cdll.retraverseDLL();
        cdll.deleteInLinkedList(2);
        cdll.traverseDLL();
        cdll.retraverseDLL();
        cdll.deleteDLL();
    }
}
