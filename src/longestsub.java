import java.util.*;
public class longestsub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> h=new HashMap<>();
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        int length=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int nums:arr)
        {
            int cc=h.getOrDefault(nums,0)+1;
            if(cc <= k)
            {
                h.put(nums,cc);
            }
            else {
                break;
            }
        }
        for(Map.Entry<Integer,Integer> entry : h.entrySet())
        {
            length+=entry.getValue();
        }
        System.out.print(length);


    }
}
