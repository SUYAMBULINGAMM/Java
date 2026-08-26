import java.util.Arrays;

public class Revstring {
    public static void main(String[] args) {
        String s="Five boxhing wizartds jump quickly";
        int ch[]=new int[26];
        boolean f=true;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) != ' ')
            {
                ch[Character.toLowerCase(s.charAt(i)) - 'a']++;
            }

        }
        String str= Arrays.toString(ch);
        System.out.print(str);
        for(int i=0;i<26;i++)
        {
            if(ch[i] == 0) {
                f=false;
                break;
            }
        }
        if(f)
        {
            System.out.print("True");
        }
        else {
            System.out.print("False");
        }
    }
}
