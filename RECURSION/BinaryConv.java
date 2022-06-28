public class BinaryConv 
{
    public static void main(String[] args) 
    {
        BinaryConv obj = new BinaryConv();
        int bin = obj.Binary(10);
        System.out.println(bin);
    }
    public int Binary(int n)
    {
        if(n<0)
            return -1;
        if(n==0)
            return 0;
        return n%2 + 10 * Binary(n/2);
    }
}
