import java.math.BigInteger;

public class FactorialUsingThreads {
    public static void main(String[] args)
    {
        int arr [] = {1000,2000,3000,4000,5000,6000,7000,8000,9000,10000 };
        MyThread[] threads = new MyThread[arr.length];
        long start = System.currentTimeMillis(); //epoch time
        for(int i=0;i< arr.length;i++)
        {
            threads[i] = new MyThread(arr[i]);
            threads[i].start();
//            threads[i].join();
//            System.out.println(threads[i].result);
// doing this makes it sequential program never ever do that
        }
        for(int i=0;i< arr.length;i++)
        {
            try {
                threads[i].join();
                System.out.println(threads[i].result);
            } catch (InterruptedException e) {
                // Handle the InterruptedException
                e.printStackTrace();
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("time spent" + (end-start));
        // takes approx 120 milli seconds for non threaded program
    }
    private static class MyThread extends Thread{
        private int num;
        private BigInteger result;
        MyThread(int num )
        {
            this.num = num;
            this.result = BigInteger.ONE;
        }
         @Override
        public void run(){
             calculate();
         }
         public void calculate(){

             BigInteger result = BigInteger.ONE;
             for(int i=2;i<=this.num;i++)
             {
                 result = result.multiply(BigInteger.valueOf(i));
             }

             System.out.println("result " + result);


         }
    }
}
