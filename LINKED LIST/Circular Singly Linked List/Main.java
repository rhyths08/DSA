class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL(5);
        System.out.println(csll.head.value);
        csll.insertInCSLL(6, 1);
        csll.insertInCSLL(7, 2);
        csll.insertInCSLL(8, 4);
        csll.insertInCSLL(9, 0);
        csll.traverseCSLL();
        csll.deleteInCSLL(0);
        csll.traverseCSLL();
        csll.deleteCSLL();
    }
}