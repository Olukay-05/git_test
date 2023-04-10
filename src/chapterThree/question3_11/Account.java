package chapterThree.question3_11;

public class Account {

    private String name;
    private double balance;


    public Account(String name, double balance){
        this.name = name;
        if(balance > 0.0) {
            this.balance = balance;
        }
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

   public void deposit(double depositAmount){
        if (depositAmount > 0.0){
            balance += depositAmount;
        }
   }

   public void withdraw(double withdrawAmount){
        if(withdrawAmount <= balance) {
            balance = balance - withdrawAmount;
        }else System.out.println("Withdrawal Amount Exceeded Balance");
   }

   public double getBalance(){
        return balance;
   }
}
