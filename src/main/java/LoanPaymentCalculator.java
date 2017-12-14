import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by Jack on 12/13/2017.
 */
public class LoanPaymentCalculator {

    public static void determineMinimumPayment(LoanDataContainer loan){
        double principal = loan.getPrincipal();
        double interestRate = loan.getInterestRate();
        int amortization = loan.getAmortization();
        double minimumPayment = principal*((interestRate/12) + ((interestRate/12)/(Math.pow(1+(interestRate/12), amortization*12) -1)));
        loan.setMinimumPayment(minimumPayment);
    }



}
