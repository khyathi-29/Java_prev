public class BankAccount {


    private String name;
    private Integer balance;

    public BankAccount(String name, Integer balance)
    {
        this.name = name;
        this.balance = balance;
    }
    public Integer deposit(int money) throws InterruptedException
    {
        System.out.println("Inside deposit thread " + Thread.currentThread()+ " money = " + money);
        synchronized (this) {
            System.out.println("Inside deposit sync thread " + Thread.currentThread()+ " money = " + money);
            this.balance += money;
            Thread.sleep(200);
            System.out.println("Exit deposit sync  thread " + Thread.currentThread()+ " money = " + money + "balance" + this.balance);
        }
        System.out.println("Exit deposit thread " + Thread.currentThread()+ " money = " + money + "balance" + this.balance);
        return this.balance;
    }


    public synchronized Integer withdraw(int money) throws InterruptedException
    {
        System.out.println("Inside withdraw thread" + Thread.currentThread() + " money = " + money);
        synchronized (this) {
            System.out.println("Inside withdraw  sync thread" + Thread.currentThread() + " money = " + money);
            this.balance -= money;
            Thread.sleep(100);
            System.out.println("Exit withdraw thread  sync" + Thread.currentThread()+ " money = " + money + "balance" + this.balance);
        }
        System.out.println("Exit withdraw thread " + Thread.currentThread()+ " money = " + money + "balance" + this.balance);
        return this.balance;
    }

    public Integer getBalance (){
        return this.balance;
    }
}
