package src;

public abstract class BankAccount {

    // declare lowRate & highRate
    private static float lowRate;
    private static float highRate;

    // declare instance variables
    private float balance;
    private String accountName;
    private String accountNumber;


    public BankAccount(String accountName, String accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        balance = 0;
    }

    // public getter/setter for highRate/lowRate
    public static float getLowRate() {
        return lowRate;
    }

    public static void setLowRate(float rate) {
        if (rate < 0) {
            lowRate = 0;
        } else if (rate > highRate) {
            lowRate = highRate;
        } else {
            lowRate = rate;
        }
    }

    public static float getHighRate() {
        return highRate;
    }

    public static void setHighRate(float rate) {
        if (rate > 10) {
            highRate = 10;
        } else if (rate < lowRate) {
            highRate = lowRate;
        } else {
            highRate = rate;
        }
    }

    public float getBalance() {
        return balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public abstract void printDetails();

    public void deductBalance(float deduct) {
        balance = balance-deduct;
    }

    public boolean withdraw(float deduct) {
        if (deduct<=balance) {
            deductBalance(deduct);
            return true;
        } else {
            return false;
        }
    }
}
