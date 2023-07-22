import java.util.ArrayList;

public class FibonacciBU {
    public static void main(String[] args) {
        System.out.println(fibTab(6));
    }

    public static int fibTab(int n) {
        ArrayList<Integer> tab = new ArrayList<Integer>();
        tab.add(0);
        tab.add(1);
        for(int i = 2; i<=n-1; i++) {
            int n1 = tab.get(i-1);
            int n2 = tab.get(i-2);
            tab.add(n1+n2);
        }
        return tab.get(n-1);
    }
}
