package RequestInheritance;

import java.util.UUID;

/**
 * this class is extends from PostForm
 */
public class PostEncryptForm extends PostForm {
    /**
     * private String value for the encryptType
     */
    private String encryptType;
    /**
     * private int value for the count
     */
    public static int count;

    /**
     * this method is used to set the EncryptType
     * @param encryptType local variable give the value to the private variable
     */
    public void setEncryptType(String encryptType) {
        this.encryptType = encryptType;
    }

    /**
     * this method is used to get the value of EncryptType
     * @return
     */
    public String getEncryptType() {
        return encryptType;
    }

    /**
     * this is the constructor of this file
     * @param UUID is the UUID value for the UUID
     * @param IP is the String value for the IP
     * @param form is the form
     * @param encryptType is the String value of encryptType
     */

    public PostEncryptForm(UUID UUID, String IP, Form form, String encryptType) {
        super(UUID, IP, form);
        setEncryptType(encryptType);
        count++;
    }

    @Override
    public String toString() {
        return super.toString() + "\nThis form was encrypted using: " + getEncryptType();
    }

    public static int count() {
        return count;
    }
}
