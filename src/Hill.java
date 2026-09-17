import java.util.*;
public class Hill {
    public static String encrypt(String p, int k[][])
    {
        char [] ch=p.toUpperCase().toCharArray();
        int c1,c2,c3,p1,p2,p3;
        p1=ch[0]-'A';
        p2=ch[1]-'A';
        p3=ch[2]-'A';
        c1=(p1*k[0][0]+p2*k[1][0]+p3*k[2][0])%26;
        c2=(p1*k[0][1]+p2*k[1][1]+p3*k[2][1])%26;
        c3=(p1*k[0][2]+p2*k[1][2]+p3*k[2][2])%26;
        char [] ch1={(char)(c1+'A'),(char)(c2+'A'),(char)(c3+'A')};
        return String.valueOf(ch1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String plaintext=sc.nextLine();
        int key[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                key[i][j]=sc.nextInt();
            }
        }
        String encryption=encrypt(plaintext,key);
        System.out.println(encryption);
    }
    
}
