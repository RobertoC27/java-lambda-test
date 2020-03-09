package gt.com.celera;

import java.security.SecureRandom;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Hello world!
 *
 */
public class App implements RequestHandler<RequestClass, ResponseClass> {
    public ResponseClass handleRequest(RequestClass request, Context context) {
        SecureRandom random = new SecureRandom();
        String responseString = String.format("Hey there %s, rand is %d", request.getFirstName(), random.nextInt());
        return new ResponseClass(responseString);
    }
}
