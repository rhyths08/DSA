class Sum_of_digit
{
    public static void main(String[] args) 
    {
        Sum_of_digit obj = new Sum_of_digit();
        int sum = obj.sumOfDigit(123);
        System.out.println(sum);
    }
    public int sumOfDigit(int n)
    {
        if(n==0 || n<0)
            return 0;
        return n%10 + sumOfDigit(n/10);
    }
}