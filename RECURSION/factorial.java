class Main
{
    public static void main(String[] args) {
        System.out.println("Factorial of 5 is: "+factorial(5));        
    }
    public static int factorial(int n)
    {
        if(n<0)
            return -1;
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }
}