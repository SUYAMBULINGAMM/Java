import java.util.*;
public class Coin {
    static int dp[][];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int amt=sc.nextInt();
        int n=sc.nextInt();
        int coins[]=new int[n];
        for(int i=0;i<n;i++) {
            coins[i]=sc.nextInt();
        }
        dp=new int[n][amt+1];
        for(int i=0;i<n;i++)
        {
            dp[i][0]=1;
        }
        for(int j=1;j<=amt;j++)
        {
            if(j%coins[0] == 0)
            {
                dp[0][j]=1;
            }
            else {
                dp[0][j]=0;
            }
        }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=amt;j++)
            {
                if(j<coins[i])
                {
                    dp[i][j]=dp[i-1][j];
                }
                else
                {
                    dp[i][j]=dp[i-1][j] + dp[i][j-coins[i]];
                }
            }
        }
        System.out.print(dp[n-1][amt]);

    }
}