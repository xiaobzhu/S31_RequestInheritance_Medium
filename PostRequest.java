package RequestInheritance;

import java.util.UUID;

/**
 * this class is inherited from the Request
 */
public class PostRequest extends Request {
    /**
     * this is String type IP
     */
    private String IP;
    /**
     * this is the int value of count
     */
    public static int count = 0;

    /**
     * this is used to get the String value of IP
     * @return
     */
    public String getIP() {
        return IP;
    }

    /**
     * this method is used to set the value of the String IP
     * @param IP
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * this is the constructor of this file
     * @param UUID is the UUID UUID
     * @param IP is the String value of IP
     */

    public PostRequest(UUID UUID, String IP) {
        super(UUID);
        setIP(IP);
        count++;

    }

    @Override
    public String toString() {
        return super.toString() + "\nPost request to server with IP address: "
                + getIP();
    }

    public static int count() {
        return count;
    }


}

