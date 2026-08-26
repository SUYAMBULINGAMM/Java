import java.util.*;
class Result {
    String result1;
    String result2;
    String result3;

    Result(String result1, String result2, String result3) {
        this.result1 = result1;
        this.result2 = result2;
        this.result3 = result3;
    }
    @Override
    public String toString() {
        return result1 + "\n" + result2 + "\n" + result3;
    }
}
public class StringEncode
{
    public static  String[] split(String str,int n,int k)
    {
        String []s=new String[3];
        int len=str.length();
        if(n == 0)
        {
            s[0]=str.substring(0,k);
            s[1]=str.substring(k,2*k);
            s[2]=str.substring(2*k,len);
        }
        if(n == 1)
        {
            s[0]=str.substring(0,k);
            s[1]=str.substring(k,2*k+1);
            s[2]=str.substring(2*k+1,len);
        }
        if(n == 2)
        {
            s[0]=str.substring(0,k+1);
            s[1]=str.substring(k+1,2*k+1);
            s[2]=str.substring(2*k+1,len);
        }
        return s;
    }
    public static String swap(String r)
    {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<r.length();i++)
        {
            if(Character.isLowerCase(r.charAt(i)))
            {
                s.append(Character.toUpperCase(r.charAt(i)));
            }
            else
            {
                s.append(Character.toLowerCase(r.charAt(i)));
            }
        }
        return s.toString();
    }
    public static Result splitAndCombine(String s1, String s2, String s3) {
        int len1=s1.length()%3;  //2
        int len2=s2.length()%3;  //1
        int len3=s3.length()%3;  //0
        int k=2;
        String []str1=split(s1,len1,k);
        String []str2=split(s2,len2,k);
        String []str3=split(s3,len3,k);
        String result1=str1[0]+str2[0]+str3[0];
        String result2=str1[1]+str2[1]+str3[1];
        String result3=str1[2]+str2[2]+str3[2];
        String toggle=swap(result3);
        return new Result(result1, result2, toggle);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String s3=sc.nextLine();
        Result res=splitAndCombine(s1,s2,s3);
        System.out.print(res);

    }
}