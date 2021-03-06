public class CircularDoublyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createDLL(int nodeValue)
    {
        head = new Node();
        Node node = new Node();
        node.next = node;
        node.value = nodeValue;
        node.prev = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    //Insert Method DoublyLinkedList

    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if(head == null)
        {
            createDLL(nodeValue);
            return;
        }
        else if(location == 0){
            node.next = head;
            node.prev = tail;
            head.prev = node;
            tail.next = node;
            head = node;
        }
        else if(location >= size)
        {
            node.next = head;
            node.prev = tail;
            tail.next = node;
            head.prev = node;
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
            node.prev = tempNode;
            nextNode.prev = node;
        }
        size++;
    }

    //DoublyLinkedList Traversal
    public void traverseDLL()
    {
        if(head == null)
        {
            System.out.println("CDLL does not exist");
        }
        else
        {
            System.out.println("Traversal of CDLL");
            Node tempNode = head;
            for(int i = 0; i<=size; i++){
                System.out.print(tempNode.value);
                if(i<= size-1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
            System.out.println("\n");
        }
    }

    //DoublyLinkedList Reverse Traversal
    public void retraverseDLL()
    {
        if(head == null)
        {
            System.out.println("CDLL does not exist");
        }
        else
        {
            System.out.println("Reverse Traversal of CDLL");
            Node tempNode = tail;
            for(int i = 0; i<=size; i++){
                System.out.print(tempNode.value);
                if(i<= size-1){
                    System.out.print(" <- ");
                }
                tempNode = tempNode.prev;
            }
            System.out.println("\n");
        }
    }

    //Search for a node
    boolean searchNode(int nodeValue)
    {
        if(head != null){
            Node tempNode = head;
            for(int i=0; i<size; i++){
                if(tempNode.value == nodeValue)
                {
                    System.out.println("Found at location: "+i+"\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found! ");
        return false;
    }

    //Delete Method DoublyLinkedList

    public void deleteInLinkedList(int location){
        if(head == null)
        {
            System.out.println("CDLL does not exist");
        }
        else if(location == 0){
            head = head.next;
            head.prev = tail;
            tail.next = head;
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
            tempNode.next = head;
            head.prev = tempNode;
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
            tempNode.next.prev = tempNode;
            size--;
        }
    }

    //Delete Entire DoublyLinkedList
    public void deleteDLL()
    {
        Node tempNode = head;
        for (int i=0; i<size; i++) {
        tempNode.prev = null;
        tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("The CDLL has been deleted!");
    }

}
