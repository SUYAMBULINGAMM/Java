import java.util.*;
public class Sequential {
    public static int check(int n,int []arr,int k)
    {
//        if(arr[arr.length-1]<n)
//        {
//            return n;
//        }
        for(int i=k;i<arr.length;i++)
        {
            if(arr[i] == n)
            {
                return check(n+1,arr,i);
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        boolean f=false;
        for(int i=1;i<n;i++)
        {
            sum+=arr[i-1];
            if(arr[i]-arr[i-1] != 1)
            {
                f=true;
                break;
            }
        }
        //System.out.print(sum);
        if(f) {
            Arrays.sort(arr);
            System.out.print(check(sum, arr, 0));
        }
        else {
            if(n == 1)
            {
                System.out.print(arr[n-1]+1);
            }
            else {
                System.out.print(sum + arr[n - 1]);
            }
        }
    }
}
