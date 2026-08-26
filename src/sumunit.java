import java.util.*;
public class sumunit {
    public static int digit(int n)
    {
        int sum=0;
        while(n>0) {
            int d = n % 10;
            sum += d;
            n /= 10;
        }
        if(sum<=9)
        {
            return sum;
        }
        return digit(sum);
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=digit(n);
        System.out.print(d);
    }
}
