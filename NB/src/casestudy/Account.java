package casestudy;

public class Account {
    private String accHolderName;
    private Long contactNo;
    private Long accNo;
    private String typeofAcc;
    private float balance;


    public Long getContactNo() {
        return contactNo;
    }

    public void setContactNo(Long contactNo) {
        this.contactNo = contactNo;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public Long getAccNo() {
        return accNo;
    }

    public void setAccNo(Long accNo) {
        this.accNo = accNo;
    }

    public String getTypeofAcc() {
        return typeofAcc;
    }

    public void setTypeofAcc(String typeofAcc) {
        this.typeofAcc = typeofAcc;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    public Account(String accHolderName,Long contactNo,Long accNo, String typeofAcc, Float balance){
        super();
        this.accHolderName = accHolderName;
        this.contactNo = contactNo;
        this.accNo = accNo;
        this.typeofAcc = typeofAcc;
        this.balance=balance;
    }

}
