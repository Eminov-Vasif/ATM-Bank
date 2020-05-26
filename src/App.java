import java.util.Scanner;

public class App {

    private static  Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to ATM");
        System.out.println("***************");

        String[] menu={"1.Balance","2.Deposit","3.Withdraw","4.Transactions","5.Exit"};
        Account myAccount=new Account(0);
        int option;
        do{
            System.out.println("***************");
            for(String item:menu)
                System.out.println(item);
            option=scanner.nextInt();
            double amount;
            switch (option){

                case 1:
                    System.out.println();
                    myAccount.showBalance();
                    break;
                case 2:
                    System.out.println("Enter deposit amount:");
                    amount=scanner.nextDouble();
                    myAccount.deposit(amount);
                    break;
                case 3:
                    System.out.println("Enter withdraw amount:");
                    amount=scanner.nextDouble();
                    myAccount.withdraw(amount);
                    break;
                case 4:
                    myAccount.showTransactions();
                    break;
                case 5:
                    System.out.println("Bye, Thank you");
                    break;
                    default:
                        System.out.println("Please enter correct option");
            }
        }while (option!=5);
    }
}
