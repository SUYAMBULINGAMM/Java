import java.util.*;
public class vigenere {
    public static String encrypt(String p,String k)
    {
        StringBuilder sb=new StringBuilder();
        String P=p.toUpperCase();
        String K=k.toUpperCase();
        for(int i=0;i<P.length();i++)
        {
            char ch=P.charAt(i);
            char ch1=K.charAt(i%K.length());
            char res=(char) (((ch + ch1)-130)%26+'A');
            sb.append(res);
        }
        return sb.toString();
    }
    public static String decrypt(String c,String k)
    {
        StringBuilder sb=new StringBuilder();
        String C=c.toUpperCase();
        String K=k.toUpperCase();
        for(int i=0;i<C.length();i++)
        {
            char ch=C.charAt(i);
            char ch1=K.charAt(i%K.length());
            char res=(char) ((ch - ch1 + 26)%26 + 'A');
            sb.append(res);
        }
        return sb.toString().toLowerCase();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String plaintext=sc.nextLine();
        String key=sc.nextLine();
        String encryption=encrypt(plaintext,key);
        System.out.println(encryption);
        String decryption=decrypt(encryption,key);
        System.out.println(decryption);
    }
    
}
