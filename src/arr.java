import java.util.*;
class arr
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    int sum=arr[j]-arr[i];
                    int sum2=arr[k]-arr[j];
                    if(sum==d && sum2==d)
                    {
                        c++;
                    }
                }
            }
        }
        System.out.println(c);

    }
}