public class first {
    public static void main(String[] args) {
        String s="swiss";
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            int count=1;
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i] == ch[j])
                {
                    count++;
                }
            }
            if(count == 1)
            {
                System.out.print(i);
                break;
            }
        }
    }
}
