class bit
{
    public static void main(String[] args) {
        final int BITS=30;
        int n=4;
        int arr[]={3,10,5,25};
        int basis[]=new int[BITS+1];
        for(int t:arr)
        {
            int curr=t;
            for(int bit=BITS;bit>=0;bit--)
            {
                if(((curr >> bit)&1) == 0) continue;
                if(basis[bit] == 0)
                {
                    basis[bit] = curr;
                    break;
                }
                curr^=basis[bit];
            }
        }
        int res=0;
        for(int bit=BITS;bit>=0;bit--)
        {
            if((res ^ basis[bit])>res)
            {
                res^=basis[bit];
            }
        }
        System.out.print(res);
    }
}