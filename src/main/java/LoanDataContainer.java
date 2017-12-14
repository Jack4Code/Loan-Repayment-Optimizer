import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by Jack on 12/11/2017.
 */
public class LoanDataContainer {

    private double principal, interest, totalBalance, interestRate;
    private int amortization; //number of years the loan is alive...paid on a monthly basis
    private HashMap<Date, ArrayList<HashMap<String, Double>>> paymentHistory = new HashMap<Date, ArrayList<HashMap<String, Double>>>();
    private double minimumPayment;

    public LoanDataContainer(double principal, double interestRate, int amortization) {
        this.principal = principal;
        this.interestRate = interestRate;
        this.amortization = amortization;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getAmortization() {
        return amortization;
    }

    public void setAmortization(int amortization) {
        this.amortization = amortization;
    }

    public HashMap<Date, ArrayList<HashMap<String, Double>>> getPaymentHistory() {
        return paymentHistory;
    }

    public void setPaymentHistory(HashMap<Date, ArrayList<HashMap<String, Double>>> paymentHistory) {
        this.paymentHistory = paymentHistory;
    }

    public double getMinimumPayment() {
        minimumPayment = minimumPayment*100;
        minimumPayment = Math.round(minimumPayment);
        minimumPayment = minimumPayment*.01;
        return minimumPayment;
    }

    public void setMinimumPayment(double minimumPayment) {
        this.minimumPayment = minimumPayment;
    }

}
