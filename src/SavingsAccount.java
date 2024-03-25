package src;

import java.text.DecimalFormat;

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
    public float addInterest(){
        DecimalFormat df = new DecimalFormat("#.##");
        float addedInterest = (super.getBalance() / rate) * 100;
        df.format(addedInterest);
        return getBalance() + addedInterest;
    }

    public void printDetails(){
        System.out.println("Account Name: " + super.getAccountName());
        System.out.println("Account ID: " + super.getAccountNumber());
        System.out.println("Balance: " + super.getBalance());
        System.out.println("Rate: " + rate + "%");
    }

}
