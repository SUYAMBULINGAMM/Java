public class Main {
    public static void main(String[] args) throws InterruptedException{
        StringBuffer sb =new StringBuffer();

        //thread 1
        Thread t1=new Thread(()->{
            for(int i=0;i<5;i++)
            {
                sb.append("A");
            }
        });
        
        Thread t2=new Thread(()->{
            for(int i=0;i<5;i++)
            {
                sb.append("B");
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.print(sb);
    }
}
