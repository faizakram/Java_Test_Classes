import java.util.HashMap;
import java.util.Map;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Token;

public class StripeExample {

	public static void main(String[] args) {
		/*RequestOptions requestOptions = (new RequestOptionsBuilder()).setApiKey("sk_test_SJiTJPL5rh7Sw5Jtsj0cWo34")
				.build();
		Map<String, Object> chargeMap = new HashMap<String, Object>();
		chargeMap.put("amount", 100);
		chargeMap.put("currency", "usd");
		Map<String, Object> cardMap = new HashMap<String, Object>();
		cardMap.put("number", "4242424242424242");
		cardMap.put("exp_month", 12);
		cardMap.put("exp_year", 2020);
		chargeMap.put("card", cardMap);
		try {
			Charge charge = Charge.create(chargeMap, requestOptions);
			System.out.println(charge);
		} catch (StripeException e) {
			e.printStackTrace();
		}*/
		
	/*	Stripe.apiKey = "sk_test_SJiTJPL5rh7Sw5Jtsj0cWo34";

		Map<String, Object> tokenParams = new HashMap<String, Object>();
		Map<String, Object> cardParams = new HashMap<String, Object>();
		cardParams.put("number", "4242424242424242");
		cardParams.put("exp_month", 1);
		cardParams.put("exp_year", 2020);
		cardParams.put("cvc", "314");
		tokenParams.put("card", cardParams);

		try {
			Token.create(tokenParams);
		} catch (StripeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		

	}

}
