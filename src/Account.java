import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Account {

    public Account(double balance){
        this.balance=balance;
    }
    private double balance;
    private List<Transaction> transactions=new ArrayList<>();

    public void showBalance(){
        System.out.println("Current balance" +  balance + "   Azn");
    }
    public void deposit(double amout){
        balance+=amout;
        Transaction transaction=new Transaction(amout,TransactionType.DEPOSIT, LocalDateTime.now());
        transactions.add(transaction);

    }
    public void withdraw(double amout){
        if(amout>balance){
            System.out.println("Enter less amount");
        }else{
            balance-=amout;
        }
        Transaction transaction=new Transaction(amout,TransactionType.WITHDRAW,LocalDateTime.now());
        transactions.add(transaction);
    }
    public void showTransactions(){
        for(Transaction transaction:transactions){
            System.out.println(transaction);
        }
    }
}
