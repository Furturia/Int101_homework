package Work04;



public class BankAccount {

    private int number;
    private Person owner;
    private double balance;

    public BankAccount(int number, Person owner) {
        this.number = number;
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        return balance += amount;
    }

    public double withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
        else {System.out.println("insufficient money");}
        return balance;
        
    }

    public void transfer(double amount, BankAccount account) {
            if (amount <= balance) {
            balance -= amount;
            account.deposit(amount);
            }
            else {System.out.println("insufficient money");}
    }

    @Override
    public String toString() {
        return "BankAccount(" + owner.getId() + ")";
    }

}
