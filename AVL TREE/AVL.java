import java.util.LinkedList;
import java.util.Queue;

public class AVL {
    BinaryNode root;

    AVL(){
        root = null;
    }

    // PreOrder Traversal
  public void preOrder(BinaryNode node) {
    if (node == null) {
      return;
    }
    System.out.print(node.value + " ");
    preOrder(node.left);
    preOrder(node.right);
  }
 
  // Inorder Traversal
  public void inOrder(BinaryNode node) {
    if (node == null) {
      return;
    }
    inOrder(node.left);
    System.out.print(node.value + " ");
    inOrder(node.right);
  }
 
  // PostOrder Traversal
  public void postOrder(BinaryNode node) {
    if (node == null) {
      return;
    }
    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.value + " ");
  }
 
  // Level Order
  void levelOrder() {
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    while (!queue.isEmpty()) {
      BinaryNode presentNode = queue.remove();
      System.out.print(presentNode.value + " ");
      if (presentNode.left != null) {
        queue.add(presentNode.left);
      }
      if (presentNode.right != null) {
        queue.add(presentNode.right);
      }
    }
  }
 
  // Search Method
  BinaryNode search(BinaryNode node, int value) {
    if (node == null ) {
      System.out.println("Value: "+ value+ " not found in AVL");
      return null;
    } else if (node.value == value) {
      System.out.println("Value: "+ value+ " found in AVL");
      return node;
    } else if (value < node.value) {
      return search(node.left, value);
    } else {
      return search(node.right, value);
    }
  }
 
    //getHeight
   public int getHeight(BinaryNode node) {
     if (node == null) {
       return 0;
     }
     return node.height;
   }

   
}
