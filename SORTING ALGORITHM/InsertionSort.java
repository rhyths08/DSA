import java.util.Scanner;

public class InsertionSort 
{
    public static void insert(int[] a)
    {
        for(int i=1;i<a.length;i++)
        {
            int temp = a[i], j=i;
            while(j>0 && a[j-1]>temp)
            {
                a[j] = a[j-1];
                j--;
            }
            a[j] =temp;
        }
        for(int i=0; i<a.length; i++)
            System.out.print(a[i]+ " ");
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sixe of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array:");
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();

        insert(a);
    }
}
