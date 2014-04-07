package dt265.savings;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by brian on 07/04/2014.
 */
public class SavingsAccount {
    private static double annualInterestRate;

    private String accountNumber;
    private Calendar startDate;
    private double savingsBalance;

    SavingsAccount() {
        this("00000000", Calendar.getInstance(), 0.0);
    }

    SavingsAccount(String accountNumber, Calendar startDate, double savingsBalance) {
        this.accountNumber = accountNumber;
        this.startDate = startDate;
        this.savingsBalance = savingsBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate)  {
        this.startDate = startDate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest() {
        savingsBalance += savingsBalance * annualInterestRate / 12;
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    @Override public String toString() {
        return "Account: balance=" + savingsBalance + " opened=" +
                startDate.get(Calendar.YEAR) + "/" +
                startDate.get(Calendar.MONTH) + "/" +
                startDate.get(Calendar.DAY_OF_MONTH);
    }
}
