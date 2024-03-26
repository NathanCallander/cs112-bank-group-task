import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SavingsAccountTest {
    @Test
    public void setRateTest(){
        BankAccount.setHighRate(9f);
        BankAccount.setLowRate(1f);
        SavingsAccount savingsAccount = new SavingsAccount("test","12345",5f);

        assertEquals(5f,savingsAccount.getRate(), 0.0);
    }

    @Test
    public void setRateLowTest(){
        BankAccount.setHighRate(9f);
        BankAccount.setLowRate(1f);
        SavingsAccount savingsAccount = new SavingsAccount("test","12345",11f);

        assertEquals(9f,savingsAccount.getRate(), 0.0);
    }

    @Test
    public void setRateHighTest(){
        BankAccount.setHighRate(9f);
        BankAccount.setLowRate(1f);
        SavingsAccount savingsAccount = new SavingsAccount("test","12345",-1f);

        assertEquals(1f,savingsAccount.getRate(), 0.0);
    }

    @Test
    public void setRateEdgeTest(){
        BankAccount.setHighRate(9f);
        BankAccount.setLowRate(1f);
        SavingsAccount savingsAccount = new SavingsAccount("test","12345",9f);

        assertEquals(9f,savingsAccount.getRate(), 0.0);
    }

    @Test
    public void addInterestTest(){
        BankAccount.setHighRate(9f);
        BankAccount.setLowRate(1f);
        SavingsAccount savingsAccount = new SavingsAccount("test","12345",6f);
        savingsAccount.setBalance(1000f);
        savingsAccount.addInterest();
        assertEquals(1060.0f,savingsAccount.getBalance(), 0.0);
    }

    @Test
    public void addInterestExtremeHighTest(){
        BankAccount.setHighRate(9f);
        BankAccount.setLowRate(1f);
        SavingsAccount savingsAccount = new SavingsAccount("test","12345",11f);
        savingsAccount.setBalance(1000f);
        savingsAccount.addInterest();
        assertEquals(1090.0,savingsAccount.getBalance(), 0.0);
    }

    @Test
    public void addInterestExtremeLowTest(){
        BankAccount.setHighRate(9f);
        BankAccount.setLowRate(1f);
        SavingsAccount savingsAccount = new SavingsAccount("test","12345",-1f);
        savingsAccount.setBalance(1000f);
        savingsAccount.addInterest();
        assertEquals(1010.0,savingsAccount.getBalance(), 0.0);
    }
}
