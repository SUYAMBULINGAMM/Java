import java.util.*;
public class Optcodelong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> h=new HashMap<>();
        int n=sc.nextInt();
        int arr[]=new int[n];
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int l=0;
        int maxlen=0;
        for(int r=0;r<n;r++)
        {
            h.put(arr[r],h.getOrDefault(arr[r],0)+1);
            while(h.get(arr[r]) > k)
            {
                h.put(arr[l], h.get(arr[l])-1);
                l++;
            }
            int windowlen=r-l+1;
            maxlen=Math.max(maxlen,windowlen);
        }
        System.out.print(maxlen);
    }
}
