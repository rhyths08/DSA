public class BinaryTreeArr {
    String[] arr;
    int lastUsedIndex;

    public BinaryTreeArr(int size){
        arr = new String[size+1];
        this.lastUsedIndex = 0;
        System.out.println("Blank Tree of size: "+size+" has been created");
    }

    //isFull
    boolean isFull(){
        if(arr.length-1==lastUsedIndex){
            return true;
        }
        return false;
    }

    //insert method
    void insert(String value){
        if(!isFull()){
            arr[lastUsedIndex+1] = value;
            lastUsedIndex++;
            System.out.println("The value of "+value+" has been inserted");

        }
        else{
            System.out.println("This BT is full");
        }
    }

    //Preorder Traversal
    public void preOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
        System.out.print(arr[index]+" ");
        preOrder(index * 2);
        preOrder(index * 2 + 1);
    }

    //Inorder Traversal
    public void inOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
        inOrder(index * 2);
        System.out.print(arr[index]+" ");
        inOrder(index * 2 + 1);
    }

    //Postorder Traversal
    public void postOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
        postOrder(index * 2);
        postOrder(index * 2 + 1);
        System.out.print(arr[index]+" ");
    }

    //Levelorder Traversal
    public void levelOrder(){
        for(int i = 1; i<=lastUsedIndex; i++){
            System.out.print(arr[i]+" ");
        }
    }
}