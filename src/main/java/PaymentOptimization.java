import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Jack on 12/12/2017.
 */
public class PaymentOptimization {

    HashMap<Integer, ArrayList<LoanDataContainer>> configurations = new HashMap<Integer, ArrayList<LoanDataContainer>>();

    public static void run(ArrayList<LoanDataContainer> loans){
        for(int i = 0; i<loans.size(); i++){
            applyExtraPayment(loans.get(i));
        }

    }

    private static void applyExtraPayment(LoanDataContainer loan) {

    }


}
