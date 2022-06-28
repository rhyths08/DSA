class Fibonacci{
    public static void main(String[] args) 
    {
        Fibonacci obj = new Fibonacci();
        var abc = obj.fibonacci(5);
        System.out.println(abc);
    }
    public int fibonacci(int n)
    {
        if(n<0)
            return -1;
        if(n==0 || n==1)
            return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
