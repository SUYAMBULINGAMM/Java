import java.util.*;

public class rev {
    static void reverse(char ch[],int i,int j)
    {
        while(i<j)
        {
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<j)
        {
            if((ch[i]=='(' || ch[i]==')') && (ch[j]=='(' || ch[j]==')'))
            {
                reverse(ch,i,j);
                i++;
                j--;
            }
            if(ch[i]!='(' && ch[i]!=')')
            {
                i++;
            }
            if(ch[j]!='(' && ch[j]!=')')
            {
                j--;
            }
        }
        for(char k:ch)
        {
            if(k=='(' || k==')')
            {
                continue;
            }
            else
            {
                System.out.print(k);
            }
        }

    }
    
}
