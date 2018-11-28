package RequestInheritance;

import java.util.UUID;

/**
 * this class is inherited from the postRequest
 */
public class PostForm extends PostRequest {
    /**
     * this is Form type of form
     */
    public Form form;

    /**
     * this is the int value of count
     */
    public static int count;

    /**
     * this is the constructor of this file
     * @param UUID this is the UUID UUI
     * @param UUID this is the UUID UUI
     * @param IP this is the String IP
     * @param form this is the Form form
     */
    public PostForm(UUID UUID, String IP, Form form) {
        super(UUID, IP);
        this.form = form;
        count++;
    }

    @Override
    public String toString() {
        return super.toString() + form.toString();
    }

    public static int count() {
        return count;
    }
}

