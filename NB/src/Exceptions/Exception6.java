package Exceptions;
class InsufficientFundsException extends Exception {
    private int withdrawAmount;
    public InsufficientFundsException (int withdrawAmount) {
        super();
        this.withdrawAmount = withdrawAmount;
    }
}
class AgeNotValidException extends Exception {
    private int age;
    public AgeNotValidException (int Age) {
        super();
        this.age = Age;
    }
}
public class Exception6 {
    static int Balance = 5000;

    public static void AmountWithdrawal(int withdrawAmount) throws InsufficientFundsException {

        int Balance = 5000;
        if (withdrawAmount > Balance) {

            throw new InsufficientFundsException(withdrawAmount);
        }
        else {
            System.out.println("Money withdrawed");
        }
    }
    public static void VoteCasting(int age) throws AgeNotValidException{
        if (age < 18) {

            throw new AgeNotValidException(age);
        }
        else {
            System.out.println("Can cast vote");
        }

    }
    public static void main (String[] args) throws InsufficientFundsException,AgeNotValidException {
          AmountWithdrawal(3000);
          VoteCasting(20);
    }
}
