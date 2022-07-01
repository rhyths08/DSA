public class Stackarr{
    int[] arr;
    int topOfStack;

    public Stackarr(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created of size: "+size);
    }

    //isEmpty
    public boolean isEmpty(){
        if(topOfStack == -1)
            return true;
        return false;
    }

    //isFull
    public boolean isFull(){
        if(topOfStack == arr.length-1)
            return true;
        return false;
    }

    //Push
    public void push(int value)
    {
        if(isFull()==true){
            System.out.println("Stack is full");
            return;
        }
        topOfStack++;
        arr[topOfStack] = value;
        System.out.println("Element inserted successfully");
    }

    //Pop
    public void pop()
    {
        if(isEmpty()==true){
            System.out.println("Stack is empty");
            return;
        }
        int value = arr[topOfStack];
        topOfStack--;
        System.out.println("Element poped: "+value);
    }

    //Peek
    public void peek()
    {
        if(isEmpty()==true){
            System.out.println("Stack is empty\n");
        }
        System.out.println("Element at the top: "+arr[topOfStack]);
    }

    //Delete 
    public void delete()
    {
        arr = null;
        System.out.println("Stack deleted successfully\n");
    }
}