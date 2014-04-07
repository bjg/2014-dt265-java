package dt265.savings;


import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by brian on 07/04/2014.
 */
public class SavingsAccountTest {
    public static void main(String args[]) {
        SavingsAccount saver1 = new SavingsAccount();
        saver1.setAccountNumber("12345678");
        saver1.setSavingsBalance(20000.0);
        saver1.setStartDate(new GregorianCalendar(2007, 3, 27));
        System.out.println(saver1);
    }
}
