package RequestInheritance;

/**
 * this method is inherited from postPayment class
 */
public class PostEncryptPayment extends PostPayment {
    /**
     * String value for the encrtptMethod
     */
    private String encryptMethod;
    /**
     * int value for the count
     */
    public static int count;

    /**
     * this is the set method used to set the value of encryptMethod
     * @param encryptMethod
     */
    public void setEncryptMethod(String encryptMethod) {
        this.encryptMethod = encryptMethod;
    }

    /**
     * this method is uesd to get the value of encryptmethod
     * @return the String value of encryptMethod
     */
    public String getEncryptMethod() {
        return encryptMethod;
    }

    /**
     * this is the contructor of this file
     * @param UUID is UUID UUID
     * @param IP is the String IP
     * @param payment is the Payment Payment
     * @param encryptMethod is the String value
     */
    public PostEncryptPayment(java.util.UUID UUID, String IP, Payment payment, String encryptMethod) {
        super(UUID, IP, payment);
        setEncryptMethod(encryptMethod);
        count++;
    }

    @Override
    public String toString() {
        return super.toString() + "\nThis payment was encrypted using: " + getEncryptMethod();
    }

    public static int count() {
        return count;
    }
}

