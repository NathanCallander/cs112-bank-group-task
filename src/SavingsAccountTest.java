package src;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SavingsAccountTest {

    private SavingsAccount savingsAccount;

    @Test
    public void setRateTest(){
        BankAccount.setHighRate(9f);
        BankAccount.setLowRate(1f);
        savingsAccount = new SavingsAccount("test","12345",5f);

        assertEquals(5f,savingsAccount.getRate(), 0.0);
    }

    @Test
    public void setRateLowTest(){
        BankAccount.setHighRate(9f);
        BankAccount.setLowRate(1f);
        savingsAccount = new SavingsAccount("test","12345",11f);

        assertEquals(9f,savingsAccount.getRate(), 0.0);
    }

    @Test
    public void setRateHighTest(){
        BankAccount.setHighRate(9f);
        BankAccount.setLowRate(1f);
        savingsAccount = new SavingsAccount("test","12345",-1f);

        assertEquals(1f,savingsAccount.getRate(), 0.0);
    }

    @Test
    public void setRateEdgeTest(){
        BankAccount.setHighRate(9f);
        BankAccount.setLowRate(1f);
        savingsAccount = new SavingsAccount("test","12345",9f);

        assertEquals(9f,savingsAccount.getRate(), 0.0);
    }

    @Test
    public void addInterestTest(){
        BankAccount.setHighRate(9f);
        BankAccount.setLowRate(1f);
        savingsAccount = new SavingsAccount("test","12345",6f);
        savingsAccount.setBalance(4f);
        savingsAccount.addInterest();
        assertEquals(4.239999771118164f,savingsAccount.getBalance(), 0.0);
    }

    @Test
    public void addInterestExtremeTest(){
        BankAccount.setHighRate(9f);
        BankAccount.setHighRate(1f);
        savingsAccount = new SavingsAccount("test","12345",11f);
        savingsAccount.setBalance(1000f);
        savingsAccount.addInterest();
        assertEquals(1010.0,savingsAccount.getBalance(), 0.0);
    }
}
