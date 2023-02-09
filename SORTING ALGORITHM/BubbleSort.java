import java.util.Scanner;

public class BubbleSort
{
    public static void bubble(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0; j<a.length-i-1; j++)
            {
                if(a[j+1] < a[j])
                {
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
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

        bubble(a);
    }
}