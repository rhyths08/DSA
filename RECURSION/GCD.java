public class GCD {
    public static void main(String[] args) 
    {
        GCD obj = new GCD();
        int div = obj.gcd_cal(8, 12);
        System.out.println(div);
    }
    public int gcd_cal(int a, int b)
    {
        if(a<0 || b<0)
            return -1;
        if(b==0)
            return a;
        return gcd_cal(b, a%b);
    }
    
}
