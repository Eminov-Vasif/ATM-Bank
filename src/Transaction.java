import java.time.LocalDateTime;

public class Transaction {
    private double amount;
    private TransactionType type;
    private LocalDateTime dateTime;

    public Transaction(double amount,TransactionType type,LocalDateTime dateTime){
        this.amount=amount;
        this.type=type;
        this.dateTime=dateTime;
    }
    public String toString(){
        return amount + " " + type + " " + dateTime;
    }
}
