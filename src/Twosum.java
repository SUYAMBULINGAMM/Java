import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Twosum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=9;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int curr=target-arr[i];
            if(!h.containsKey(curr))
            {
                h.put(arr[i],i);
            }
            else
            {

                System.out.print(h.get(curr)+" "+i);
                break;
            }
        }
    }
}