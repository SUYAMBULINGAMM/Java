import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s1="hello";
        String s2="world";
        char ch[]=new char[26];
        char ch1[]=new char[26];
        for(int i=0;i<s1.length();i++)
        {
            ch[s1.charAt(i) - 'a']++;
        }
        for(int i=0;i<s2.length();i++)
        {
            ch1[s2.charAt(i) - 'a']++;
        }
        String res1= Arrays.toString(ch);
        String res2=Arrays.toString(ch1);
        if(res1.equals(res2))
        {
            System.out.print("True");
        }
        else {
            System.out.print("False");
        }
    }
}
