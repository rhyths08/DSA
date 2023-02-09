import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class BuketSort 
{
    public static void bucket(int[] a)
    {
        int numberOfBuckets = (int)Math.ceil(Math.sqrt(a.length));
        int maxValue = Integer.MIN_VALUE;
        for(int value : a)
        {
            if(value > maxValue)
            maxValue = value;
        }
        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
        for(int i=0; i<buckets.length; i++)
        {
            buckets[i] = new ArrayList<Integer>();
        }
        for(int value : a)
        {
            int bucketNumber = (int)Math.ceil(((float)value * numberOfBuckets)/(float)maxValue);
            buckets[bucketNumber-1].add(value);
        }

        System.out.println("\n\n Printing bucket before sorting....");
        printBucket(buckets);

        for(ArrayList<Integer> bucket: buckets)
        {
            Collections.sort(bucket);
        }

        System.out.println("\n\n Printing bucket after sorting....");
        printBucket(buckets);

        int index = 0;
        for(ArrayList<Integer> bucket: buckets)
        {
            for(int value: bucket)
            {
                a[index] = value;
                index++;
            }
        }
        System.out.println("\nSorted Array is: ");
        for(int i=0; i<a.length; i++)
            System.out.print(a[i]+ " ");
    }
    //print bucket
    public static void printBucket(ArrayList<Integer>[] buckets)
    {
        for(int i=0; i<buckets.length; i++)
        {
            System.out.println("\nBuckets"+i+" : ");
            for(int j=0; j<buckets[i].size(); j++)
            {
                System.out.print(buckets[i].get(j)+" ");
            }
        }
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

        bucket(a);
    }
}
