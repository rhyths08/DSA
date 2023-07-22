import java.util.HashMap;

class FibonacciTD {
    public static void main(String[] args) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        System.out.println(fibMemo(6, memo));
    }

    //using memoizaation --- top down approach
    public static int fibMemo(int n, HashMap<Integer, Integer> memo) {
        if(n == 0)
            return 0;
        if(n == 2 || n == 1)
            return 1;
        if(!memo.containsKey(n)) {
            int k = fibMemo(n-1 , memo);
            memo.put(n, (fibMemo(n-1, memo) + fibMemo(n-2, memo)));
        }
        return memo.get(n);
    }
}