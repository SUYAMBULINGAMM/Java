public class balance {
    public static void main(String[] args) {
        int bal=100;
        int arr[]={50,-30,-200,-10,40};
        int sum=bal;
        for(int i=0;i<arr.length;i++)
        {
            bal+=arr[i];
            if(bal<0)
            {
                bal=sum;
                continue;
            }
            sum=bal;
        }
        System.out.print(sum);

    }
}
