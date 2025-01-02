package casestudy;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class BankServices {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashMap<Long, Account> accounts = new HashMap<Long, Account>();
        HashMap<Byte, Transactions> transactions = new HashMap<Byte,Transactions>();
        String accHoldername ;
        Long contactno;
        Long accNo;
        String typeOfAcc;
        float balance=0;
        boolean value = true;
        while(value) {
            Account account;
            System.out.println("Welcome to bank service");
            System.out.println("------------------------");
            System.out.println("1.Create an acoount");
            System.out.println("2.Balance Check");
            System.out.println("3.Check Account Details");
            System.out.println("4.Deposit");
            System.out.println("5.Withdraw");
            System.out.println("6.Fundraiser");
            System.out.println("7.Bank Statement");
            System.out.println("Please select your option");
            byte option = scan.nextByte();
            System.out.println();
            switch (option) {
                case 1: {
                    System.out.println("Create an account");
                    System.out.println("Please enter your name");
                    accHoldername = scan.next();
                    System.out.println("Please enter your contactNo");
                    contactno = scan.nextLong();
                    System.out.println("Please enter type of account");
                    typeOfAcc = scan.next();
                    accNo = contactno;

                    account = new Account(accHoldername, contactno, accNo, typeOfAcc, balance);
                    accounts.put(accNo, account);
                    System.out.println("Your account number is :-" + accNo);
                    break;
                }
                case 2: {
                    System.out.println("2.Balance Check");
                    System.out.println("Please enter your account number:- ");
                    accNo = scan.nextLong();
                    account = accounts.get(accNo);
                    float AccountBalance = account.getBalance();
                    System.out.println(" The current Balance is "+ AccountBalance);
                    break;
                }
                case 3: {
                    System.out.println("3.Check Account Details");
                    System.out.println("Please enter your account number:- ");
                    accNo = scan.nextLong();
                    account = accounts.get(accNo);
                    System.out.println(account);
                    break;
                }
                case 4: {
                    System.out.println("4.Deposit");
                    System.out.println("Please enter your account number:- ");
                    accNo = scan.nextLong();
                    System.out.println("Please enter your deposit ammount:- ");
                    float depositAmount  = scan.nextFloat();
                    account = accounts.get(accNo);
                    float existingAmount = account.getBalance();
                    float finalAmount = depositAmount+existingAmount;
                    account.setBalance(finalAmount);
                    accounts.put(accNo,account);
                    System.out.println("Ypur amount is credited successfully");
                    System.out.println("Current balance is "+ finalAmount);
                    LocalDate date = LocalDate.now();
                    Random random = new Random();
                    byte transId = (byte)random.nextInt();
                    Transactions trans = new Transactions(accNo,transId, date,0,depositAmount,finalAmount,"deposit");
                    transactions.put(transId,trans);
                    break;
                }
                case 5: {
                    System.out.println("5.Withdraw");
                    System.out.println("Please enter your account number:- ");
                    accNo = scan.nextLong();
                    System.out.println("Please enter your withdraw amount:- ");
                    float withdrawAmount  = scan.nextFloat();
                    account = accounts.get(accNo);
                    float existingAmount = account.getBalance();
                    float finalAmount = existingAmount - withdrawAmount;
                    account.setBalance(finalAmount);
                    accounts.put(accNo,account);
                    System.out.println("Ypur amount is debited successfully");
                    System.out.println("Current balance is "+ finalAmount);
                    LocalDate date = LocalDate.now();
                    Random random = new Random();
                    byte transId = (byte)random.nextInt();
                    Transactions trans = new Transactions(accNo,transId, date,withdrawAmount,0,finalAmount,"withdrawal");
                    transactions.put(transId,trans);
                    break;
                }
                case 6: {
                    System.out.println("6.Fund transfer");
                    System.out.println("Enter your account number:- ");
                    Long fromaccNo = scan.nextLong();
                    System.out.println("Enter account number to transfer :- ");
                    Long toaccNo = scan.nextLong();
                    System.out.println("Enter amount to transfer :- ");
                    float transferAmount = scan.nextFloat();
                    Account from = accounts.get(fromaccNo);
                    Account to = accounts.get(toaccNo);
                    float fromBal = from.getBalance();
                    float toBal = to.getBalance();
                    float fromFinal = fromBal-transferAmount;
                    float toFinal = toBal+ transferAmount;
                    from.setBalance(fromFinal);
                    to.setBalance(toFinal);
                    accounts.put(fromaccNo,from);
                    accounts.put(toaccNo,to);
                    System.out.println("Amount transferred successfully");
                    System.out.println("The final balance after transfer is "+ toFinal);
                    LocalDate date = LocalDate.now();
                    Random random = new Random();
                    byte transId = (byte)random.nextInt();
                    Transactions trans = new Transactions(fromaccNo,transId, date,transferAmount,0,fromFinal,"transfer");
                    transactions.put(transId,trans);

                    break;
                }
                case 7: {
                    System.out.println("7.Bank Statement");
                    System.out.printf("-15s%-15s%-15s%-15s%-15s%-15s%-15%s","AccountNo","transId","Date","credits","debits","Balance","TypeOfTransaction");
                    System.out.println("\n \n \n");
                    Set<Byte> set = transactions.keySet();
                    for(Byte keys:set){
                        Transactions trans = transactions.get(keys);
                        System.out.println(trans.getAccNo()+"             "+trans.getTransId()+"             "+trans.getDate()+"             "+trans.getCredits()+"             "+trans.getDebits()+"             "+trans.getBalance()+"             "+trans.getTypeOfTrans());
                    }
                    value=false;
                    break;
                }
                default: {
                    System.out.println("Thank you");
                    break;
                }
            }
        }




    }
}
