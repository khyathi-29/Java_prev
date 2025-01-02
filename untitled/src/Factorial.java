import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args)
    {
        int arr [] = {1000,2000,3000,4000,5000,6000,7000,8000,9000,10000 };
        long start = System.currentTimeMillis(); //epoch time

        for (int j : arr) {
            calculate(j);
        }
        long end = System.currentTimeMillis();
        System.out.println("time spent" + (end-start));
        // takes approx 120 milli seconds for non threaded program
    }
    public static  BigInteger calculate(int num)
    {
        long start = System.currentTimeMillis(); //epoch time


        BigInteger result = BigInteger.ONE;
        for(int i=2;i<=num;i++)
        {
            result = result.multiply(BigInteger.valueOf(i));
        }
        long end = System.currentTimeMillis();
        //System.out.println("time spent" + (end-start));
        return result;
    }
}
