package src;

public class SavingsAccount extends BankAccount {

    private float rate;

    public SavingsAccount(String accountName, String accountID, float rate){
        super(accountName,accountID);
        accountName = super.getAccountName();
        accountID = super.getAccountNumber();
        setRate(rate);
    }

    public float getRate(){
        return rate;
    }

    public void setRate(float rate){
        this.rate = rate;

        if(rate < getLowRate()){
            this.rate = getLowRate();
        }if(rate > getHighRate()){
            this.rate = getHighRate();
        }
    }
    public void addInterest(){
        float balance = super.getBalance();
        float addedInterest = (balance * rate) / 100;
        float total = balance + addedInterest;
        super.setBalance(total);
    }

    public void printDetails(){
        System.out.println("Account Name: " + super.getAccountName());
        System.out.println("Account ID: " + super.getAccountNumber());
        System.out.println("Balance: " + super.getBalance());
        System.out.println("Rate: " + rate + "%");
    }

}
