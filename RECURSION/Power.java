public class Power {
    public static void main(String[] args) 
    {
        Power obj = new Power();
        int pow = obj.pow(2,2);
        System.out.println(pow);
    }
    public int pow(int x, int n)
    {
        if(n<0)
            return -1;
        if(n==0)
            return 1;
        return x * pow(x,n-1);
    }
}
