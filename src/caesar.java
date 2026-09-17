import java.util.*;
public class caesar
{
    public String encrypt(String p,int k)
    {
        StringBuilder sb=new StringBuilder();
        char ch[]=p.toUpperCase().toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='A' && ch[i]<='Z')
            {
                sb.append((char) ((ch[i]-'A'+k)%26+'A'));
            }
        }
        return sb.toString();
    }
    public String decrypt(String c,int k)
    {
        StringBuilder sb=new StringBuilder();
        char ch[]=c.toUpperCase().toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='A' && ch[i]<='Z')
            {
                sb.append((char) ((ch[i]-'A'-k+26)%26+'A'));
            }
        }
        return sb.toString();
    }
    public static void main(String args[])
    {
        caesar obj=new caesar();
        Scanner sc=new Scanner(System.in);
        String plaintext=sc.nextLine();
        int key=sc.nextInt();
        String encryption=obj.encrypt(plaintext,key);
        System.out.println(encryption);
        String decryption=obj.decrypt(encryption,key);
        System.out.println(decryption);

    }
}