import java.util.*;
public class maximum {
    public static void main(String[] args) {
        int max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        max = 0;
        for(int i=0; i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n;i++){
            if(max<a[i])
                max = a[i];
        }
        System.out.println("Maximum no. is: "+max);
    }
}
