package casestudy;
import java.time.LocalDate;
public class Transactions {
    private long accNo;
    private byte transId;
    private LocalDate date;
    private float debits;
    private float credits;
    private float balance;
    private String typeOfTrans;
    public Transactions(long accNo, byte transId, LocalDate date, float debits, float credits, float balance, String typeOfTrans) {
        super();
        this.accNo = accNo;
        this.transId = transId;
        this.date = date;
        this.debits = debits;
        this.credits = credits;
        this.balance = balance;
        this.typeOfTrans = typeOfTrans;
    }
    @Override
    public String toString() {
        return "Transactions{" +
                "accNo=" + accNo +
                ", transId=" + transId +
                ", date=" + date +
                ", debits=" + debits +
                ", credits=" + credits +
                ", balance=" + balance +
                ", typeOfTrans='" + typeOfTrans + '\'' +
                '}';
    }

    public long getAccNo() {
        return accNo;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public byte getTransId() {
        return transId;
    }

    public void setTransId(byte transId) {
        this.transId = transId;
    }

    public String getTypeOfTrans() {
        return typeOfTrans;
    }

    public void setTypeOfTrans(String typeOfTrans) {
        this.typeOfTrans = typeOfTrans;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getCredits() {
        return credits;
    }

    public void setCredits(float credits) {
        this.credits = credits;
    }

    public float getDebits() {
        return debits;
    }

    public void setDebits(float debits) {
        this.debits = debits;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
