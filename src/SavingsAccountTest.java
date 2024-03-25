package src;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SavingsAccountTest {

    private SavingsAccount savingsAccount;
    private BankAccount bankAccount;

    @Test
    public void setRateTest(){
        bankAccount.setHighRate(9f);
        bankAccount.setLowRate(1f);
        savingsAccount = new SavingsAccount("test","12345",5f);

        assertEquals(5f,savingsAccount.getRate(), 0.0);
    }

    @Test
    public void setRateLowTest(){
        bankAccount.setHighRate(9f);
        bankAccount.setLowRate(1f);
        savingsAccount = new SavingsAccount("test","12345",11f);

        assertEquals(9f,savingsAccount.getRate(), 0.0);
    }

    @Test
    public void setRateHighTest(){
        bankAccount.setHighRate(9f);
        bankAccount.setLowRate(1f);
        savingsAccount = new SavingsAccount("test","12345",-1f);

        assertEquals(1f,savingsAccount.getRate(), 0.0);
    }

    @Test
    public void addInterestTest(){

    }
}
