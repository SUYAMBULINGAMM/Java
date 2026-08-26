import java.util.HashMap;
import java.util.Map;

public class total {
    public static void main(String[] args) {
        String id[]={"A1", "A2", "A1", "A3", "A2", "A1"};
        int amt[]={100,  50,   200,  75,   30,   -50};
        HashMap<String,Integer> h=new HashMap<>();
        for(int i=0;i<id.length;i++)
        {
            h.put(id[i],h.getOrDefault(id[i],0)+Math.abs(amt[i]));
        }
        int max=0;
        String act="";
        for(Map.Entry<String,Integer> entry:h.entrySet())
        {
            if(max< entry.getValue())
            {
                max= entry.getValue();
                act= entry.getKey();
            }
        }
        System.out.print(act);
    }
}
