package RequestInheritance;

import java.util.UUID;
//This class is inherited from the PostRequest
public class PostPayment extends PostRequest {
    /**
     * this is the int value of count
     */
    public static int count;
    /**
     * this is the payment type of payment
     */
    public Payment payment;

    /**
     * this is the constructor of the file
     * @param UUID is the UUID UUID
     * @param IP is the String value of IP
     * @param payment is the Payment of payment
     */
    public PostPayment(UUID UUID, String IP, Payment payment) {
        super(UUID, IP);
        this.payment = payment;
        count++;
    }

    @Override
    public String toString() {
        return super.toString() + payment.toString();
    }

    public static int count() {
        return count;
    }


}

