public class BankAccount {
    private double balance; //data hiding


    public BankAccount(double amount){
        setBalance(amount);
    }

    public void setBalance(double amount){
        this.balance = amount;
    }

    public double getBalance(){
        return this.balance; 
    }

    public void deposit (double amount){
        setBalance(getBalance() + amount);
    }

    public void withdraw (double amount){
        if (getBalance() >= amount)
            setBalance(getBalance() - amount);
        else System.out.println("Can't withdraw, Balance not enough.");
    }

    public String toString(){
        return "Balance : " + getBalance();
    }
}
