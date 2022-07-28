class Main{
    public static void main(String[] args) {
        BinarySearchTree newBST = new BinarySearchTree();
        newBST.insert(70);
        newBST.insert(50);
        newBST.insert(90);
        newBST.insert(30);
        newBST.insert(60);
        newBST.insert(80);
        newBST.insert(100);
        newBST.insert(20);
        newBST.insert(40);
        System.out.println("PreOrder Traversal: ");
        newBST.preOrder(newBST.root);
        System.out.println("\nInOrder Traversal: ");
        newBST.inOrder(newBST.root);
        System.out.println("\nPostOrder Traversal: ");
        newBST.postOrder(newBST.root);
        System.out.println("\nLevelOrder Traversal: ");
        newBST.levelOrder();
        System.out.println();
        newBST.search(newBST.root, 60);
        newBST.deleteNode(newBST.root,90);
        newBST.levelOrder();
        System.out.println();
        newBST.deleteBST();
    }
}