import java.text.DecimalFormat;

public class SavingsAccount extends BankAccount {

    private float rate;

    public SavingsAccount(String accountName, String accountID, float rate){
        accountName = super.getAccountName();
        accountID = super.getAccountID();
        setRate(rate);
    }

    public float getRate(){
        return rate;
    }

    public void setRate(float rate){
        if(rate < super.getLowRate()){
            rate = super.getLowRate();

        }if(rate > super.getHighRate()){
            rate = super.getHighRate();

        }else{
            rate = rate;
        }

    }
    public void addInterest(){
        DecimalFormat df = new DecimalFormat("#.##");
        float addedInterest = (super.getBalance() / rate) * 100;
        df.format(addedInterest);
        super.setBalance(addedInterest);
    }

    public void printDetails(){
        System.out.println("Account Name: " + accountName);
        System.out.println("Account ID: " + accountID);
        System.out.println("Balance: " + super.getBalance());
        System.out.println("Rate: " + rate + "%");
    }

}
