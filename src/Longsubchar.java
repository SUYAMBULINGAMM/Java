import java.util.*;
public class Longsubchar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        HashMap<Character,Integer> h=new HashMap<>();
        int l=0;
        for(int r=0;r<s.length();r++)
        {
            h.put(s.charAt(r),h.getOrDefault(s.charAt(r),0)+1);
        }
        for(Map.Entry<Character,Integer> entry:h.entrySet())
        {
            if(entry.getValue()>=k)
            {
                l+= entry.getValue();
            }
        }
        System.out.print(l);
    }
}
