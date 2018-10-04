import java.util.Date;
import java.text.SimpleDateFormat;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        Date accountCreatedDate = new Date();
        account.setDateCreated(accountCreatedDate);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        System.out.println("The account balance is " + account.getBalance());
        account.deposit(3000);
        System.out.println("The account balance is " + account.getBalance());
        System.out.println("The monthly interest rate is " + account.getMonthlyInterestRate() + "%");
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("The date of account creation is " + sf.format(account.getDateCreated()));
    }
}
