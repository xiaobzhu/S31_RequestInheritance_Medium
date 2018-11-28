package RequestInheritance;

/**
 * this class is used to set up the payment things
 */
public class Payment {
    /**
     * private sender value type is String
     */
    private String sender;
    /**
     * private receiver value type is String
     */
    private String receiver;
    /**
     * private amount value type is int
     */
    private int amount;

    /**
     * this is the constructor of the Payment
     * @param sender value type is String
     * @param amount value type is int
     * @param receiver value type is String
     */
    public Payment(String sender, int amount, String receiver) {
        this.sender = sender;
        this.amount = amount;
        this.receiver = receiver;
    }

    public String toString() {
        return ("\nPayment Data" + "\nPayment Sender: " + sender
                + "\nPayment amount: " + amount + "\nPayment receiver: "
                + receiver);

    }
}

