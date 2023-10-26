import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    private String name;
    private String accountNumber;
    private double balance;

   public Problem2(String name,String accountNumber,double balance){
       this.accountNumber=accountNumber;
       this.name=name;
       this.balance=balance;
   }

   public  String getName(){
       return  name;
   }

   public  String getAccountNumber(){
       return  accountNumber;
   }
   public  double getBalance(){
       return balance;
   }

   public  String toString(){
       return "Name is "+getName()+ "Acount Number is "+getAccountNumber()+"blance is "+getBalance();
   }

   public  void deposit(double ammount){
       if(ammount>0){
           balance+=ammount;
       }else{
           System.out.println("invalid blance");
       }

   }
   public  void withdraw(double bl){
       if(bl>0 && balance>=bl){
           balance-=bl;
       }else{
           System.out.println("invalid ammunt");
       }
   }
}
class  Bank{
    private List<Problem2>account=new ArrayList<>();

    public  void addAccount(Problem2 acc){
        account.add(acc);
    }

    public  void removeAccount(Problem2 acc){
        account.remove(acc);
    }

    public  void list(){
        for (Problem2 account :account) {
            System.out.println(account);
        }
    }
}

class  BankApp{
    public static void main(String[] args) {
        Bank bank=new Bank();
       Problem2 a1=new Problem2("12345", "John Doe", 1000.0);
        Problem2 a2=new Problem2("bg dzs ", "25236", 10060.0);

        bank.addAccount(a1);
        bank.addAccount(a2);


        System.out.println("Account Details:");
       bank.list();
       a1.deposit(500);
       bank.list();

    }
}
