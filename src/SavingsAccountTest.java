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
        savingsAccount.addInterest();
        assertEquals(10f,savingsAccount.addInterest(),0.0);
    }
}
