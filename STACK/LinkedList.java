public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    //Insert Method SinglyLinkedList
    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if(head == null)
        {
            createSinglyLinkedList(nodeValue);
            return;
        }
        else if(location == 0){
            node.next = head;
            head = node;
        }
        else if(location >= size)
        {
            node.next = null;
            tail.next = node;
            tail = node;
        }
        else
        {
            Node tempNode = head;
            int index = 0;
            while(index < location-1)
            {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    //Delete Method SinglyLinkedList

    public void deleteInLinkedList(int location){
        if(head == null)
        {
            System.out.println("SLL does not exist");
        }
        else if(location == 0){
            head = head.next;
            size--;
            if(size == 0)
            {
                tail = null;
            }            
        }
        else if(location >= size)
        {
            Node tempNode = head;
            int index = 0;
            while(index < size-1)
            {
                tempNode = tempNode.next;
                index++;
            }
            if(tempNode == null){
                head = null;
                tail = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        }
        else
        {
            Node tempNode = head;
            int index = 0;
            while(index < location-1)
            {
                tempNode = tempNode.next;
                index++;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }
}
