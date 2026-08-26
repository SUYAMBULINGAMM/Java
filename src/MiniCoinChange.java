import java.util.*;
public class MiniCoinChange {
    public static int dp[][];
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int coins[]=new int[n];
        for(int i=0;i<n;i++)
        {
            coins[i]=sc.nextInt();
        }
        int amt=sc.nextInt();
        dp=new int[n][amt+1];
        for(int i=0;i<n;i++)
        {
            dp[0][i]=0;
        }


    }
}
