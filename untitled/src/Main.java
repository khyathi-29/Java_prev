//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        System.out.println(Thread.currentThread());
//        Thread thread = new Thread();
//        thread.setPriority(10);
//        thread.start();
//        System.out.println(thread);
//        System.out.println(thread.getThreadGroup());
          Mythread thread = new Mythread();
          //thread.run();// It just runs and prints current thread
          thread.start(); // It runs and initializes new thread
        long sum =0;
        for( int i=0 ;i<1000000;i++)
        {
            sum++;
        }
        System.out.println("sum = "+sum );
          System.out.println("Inside the main thread" + Thread.currentThread());

    }
    private static class Mythread extends Thread
    {
        @Override
        public void run()
        {
            System.out.println("Inside thread" + currentThread());

        }
    }
}