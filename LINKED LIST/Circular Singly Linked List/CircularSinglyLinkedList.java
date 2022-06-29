public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createCSLL(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = node;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    //Insert Method CircularSinglyLinkedList

    public void insertInCSLL(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
          createCSLL(nodeValue);
          return;
        } else if (location == 0) {
          node.next = head;
          head = node;
          tail.next = head;
        } else if (location >= size) {
          tail.next = node;
          tail = node;
          tail.next = head;
        } else {
          Node tempNode = head;
          int index = 0;
          while (index < location-1) {
            tempNode = tempNode.next;
            index++;
          }
          node.next = tempNode.next;
          tempNode.next = node;
        }
        size++;
      }

    //CircularSinglyLinkedList Traversal
    public void traverseCSLL()
    {
        if(head == null)
        {
            System.out.println("CSLL does not exist");
        }
        else
        {
            Node tempNode = head;
            for(int i = 0; i<=size; i++){
                System.out.print(tempNode.value);
                if(i!= size){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
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

    //Delete Method CircularSinglyLinkedList

    public void deleteInCSLL(int location){
        if(head == null)
        {
            System.out.println("CSLL does not exist");
        }
        else if(location == 0){
            head = head.next;
            size--;
            tail.next = head; 
            if (size == 0) {
                tail = null;
                head.next = null;
                head = null;
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
                head.next = null;
                head = null;
                tail = null;
                size--;
                return;
            }
            tempNode.next = head;
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

    //Delete Entire CircularSinglyLinkedList
    public void deleteCSLL()
    {
        if (head == null) {
            System.out.println("The CSLL does not exist!");
        }
        head = null;
        tail.next = null;
        tail = null;
        System.out.println("The CSLL deleted successfully;");
    }
}