import java.util.Scanner;

public class SelectionSort
{
    public static void selec(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            int min = i;
            for(int j=i+1; j<a.length; j++)
            {
                if(a[min] > a[j])
                    min = j;
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
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

        selec(a);
    }
}
