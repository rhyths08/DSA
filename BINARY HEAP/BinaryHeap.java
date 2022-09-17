public class BinaryHeap {
    int arr[];
    int sizeOfTree;

    public BinaryHeap(int size)
    {
        arr = new int[size+1];
        this.sizeOfTree = 0;
        System.out.println("Binary Heap has been created"); 
    }

    //IsEmpty Method
    public boolean isEmpty()
    {
        if(sizeOfTree == 0)
            return true;
        else
            return false;
    }

    public Integer peek()
    {
        if(isEmpty())
        {
            System.out.println("Binary Heap is empty");
            return null;
        }
        else
        {
            return arr[1];
        }
    }
    
    //return sizeOfTree
    public int sizeOfBP()
    {
        return sizeOfTree;
    }

    //level order traversal
    public void levelOrder()
    {
        for(int i=1;i<=sizeOfTree; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }

    //heapify for insert
    public void heapifyBottomToTop(int index, String heapType)
    {
        int parent = index/2;
        if(index <=1){
            return;
        }
        if(heapType == "Min")
        {
            if(arr[index] < arr[parent])
            {
                int tmp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = tmp;
            }
        }
        else if(heapType == "Max")
        {
            if(arr[index] > arr[parent])
            {
                int tmp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = tmp;
            }
        }
        heapifyBottomToTop(parent, heapType);
    }

    //insert node in heap
    public void insert(int value, String typeHeap)
    {
        arr[sizeOfTree+1] = value;
        sizeOfTree++;
        heapifyBottomToTop(sizeOfTree, typeHeap);
        System.out.println("Value: "+value+" is inserted");
    }

    //heapify top to bottom
    public void heapifyTopToBottom(int index, String heapType)
    {
        int left = index*2;
        int right = index*2 +1;
        int swapChild = 0;
        if(sizeOfTree < left)
            return;
        if(heapType == "Max")
        {
            if(sizeOfTree == left)
            {
                if(arr[index] < arr[left])
                {
                    int tmp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = tmp;
                }
                return;
            }
            else
            {
                if(arr[left]>arr[right])
                    swapChild = left;
                else
                    swapChild = right;
                if(arr[index] < arr[swapChild])
                {
                    int tmp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = tmp;
                }
            }
        }
        else if(heapType == "Min")
        {
            if(sizeOfTree == left)
            {
                if(arr[index] > arr[left])
                {
                    int tmp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = tmp;
                }
                return;
            }
            else
            {
                if(arr[left]<arr[right])
                    swapChild = left;
                else
                    swapChild = right;
                if(arr[index] > arr[swapChild])
                {
                    int tmp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = tmp;
                }
            }
        }
        heapifyTopToBottom(swapChild, heapType);
    }

    //extract a node(head)
    public int extractHeadOfBP(String heapType)
    {
        if(isEmpty())
            return -1;
        else
        {
            int extractValue = arr[1];
            arr[1] = arr[sizeOfTree];
            sizeOfTree--;
            heapifyTopToBottom(1, heapType);
            return extractValue;
        }
    }

    //delete entire heap
    public void deleteBH()
    {
        arr = null;
        System.out.println("BH has been successfully deleted");
    }
}
