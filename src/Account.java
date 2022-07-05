

public class Account {
    private String id;
    private String name;
    private  double balance;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public void credit(double amount)
    {
        this.balance+=amount;
    }
    public boolean debit(double amount){
        if(amount>this.balance)
        {
            System.out.println("Amount exceeded");
            return false;
        }
        else
        {
            this.balance-=amount;
            return true;
        }
    }
    public void transferTo(Account account,double amount)
    {
        if(account.getBalance()>amount)
        {
            System.out.println("Amount exceeded");
        }
        else
        {
            account.debit(amount);
            credit(amount);
            System.out.println("Transfer Completed");
        }
    }
    public String accountDetails(){
        String detail=this.name+","+"the current balance in your account "+this.id+" is "+this.balance;
        return detail;
    }

}

