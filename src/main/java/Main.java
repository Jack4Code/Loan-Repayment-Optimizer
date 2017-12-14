import java.util.ArrayList;

/**
 * Created by Jack on 12/11/2017.
 */
public class Main {

    public static void main(String[] args) {

        LoanDataContainer loan1 = new LoanDataContainer(10000, 0.05, 5);
        LoanPaymentCalculator.determineMinimumPayment(loan1);
        System.out.println(loan1.getMinimumPayment());

    }

}
