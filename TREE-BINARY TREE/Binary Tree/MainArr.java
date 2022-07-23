class MainArr {
    public static void main(String[] args) {
        BinaryTreeArr newBinaryTree = new BinaryTreeArr(9);
        newBinaryTree.insert("N1");
        newBinaryTree.insert("N2");
        newBinaryTree.insert("N3");
        newBinaryTree.insert("N4");
        newBinaryTree.insert("N5");
        newBinaryTree.insert("N6");
        newBinaryTree.insert("N7");
        newBinaryTree.insert("N8");
        newBinaryTree.insert("N9");
        System.out.println("PREORDER TRAVERSAL: ");
        newBinaryTree.preOrder(1);
        System.out.println("\nINORDER TRAVERSAL: ");
        newBinaryTree.inOrder(1);
        System.out.println("\nPOSTORDER TRAVERSAL: ");
        newBinaryTree.postOrder(1);
        System.out.println("\nLEVEL ORDER: ");
        newBinaryTree.levelOrder();
        System.out.println();
        newBinaryTree.Search("N7");
        newBinaryTree.Delete("N5");
        newBinaryTree.levelOrder();
        System.out.println();
        newBinaryTree.deleteBT();
    }
}
