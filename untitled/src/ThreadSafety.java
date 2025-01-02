public class ThreadSafety{

    public static void main(String[] args) throws InterruptedException {
        BankAccount ba = new BankAccount("1",1000);
        Mythread t1 = new Mythread(ba,true,100);
        Mythread t2 = new Mythread(ba,false,200);
        Mythread t3 = new Mythread(ba,true,500);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println(ba.getBalance());
    }
    private static class Mythread extends Thread {
        private BankAccount bankAccount;
        private boolean isDeposit;

        private Integer amount;

         public Mythread( BankAccount bankAccount, boolean isDeposit, Integer amount)
         {
             this.bankAccount =bankAccount;
             this.isDeposit = isDeposit;
             this.amount = amount;
         }
        @Override
        public void run()
        {
            //entry section
            try {
               if(isDeposit) {
                   this.bankAccount.deposit(amount); // critical section
               }
               else {
                   this.bankAccount.withdraw(amount); // critical section
               }
           } catch (InterruptedException e)
           {
               throw new RuntimeException(e);
           }
          //exit
        }
    }

}
// we can do synchronization  at block level too