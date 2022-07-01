public class Mainarr{
    public static void main(String[] args) {
        Stackarr newStack = new Stackarr(4);
        boolean result = newStack.isEmpty();
        System.out.println("Is Stack empty? "+result);
        result = newStack.isFull();
        System.out.println("Is Stack full? "+result);
        newStack.push(5);
        newStack.push(6);
        newStack.push(7);
        newStack.push(8);
        newStack.push(9);
        newStack.pop();
        newStack.peek();
        newStack.pop();
        newStack.peek();
        newStack.delete();
    }
}