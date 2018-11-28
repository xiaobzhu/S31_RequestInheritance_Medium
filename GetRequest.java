package RequestInheritance;

import java.util.UUID;

/**
 * this class is extends from request, the super class of the project
 */
public class GetRequest extends Request {
    /**
     * private things, value type is String,
     */
    private String URL;
    /**
     * private variaable, value type is int, to do the counter
     */
    public static int count;

    /**
     * this method is used to get tht value of url
     * @return the string value of url
     */
    public String getURL() {
        return URL;
    }

    /**
     * this method is used to set the value of url
     * @param URL local variable string type
     */
    public void setURL(String URL) {
        this.URL = URL;
    }
/**
 * this is the constructor for this file, extend the constructor from the request
 */
    public GetRequest(UUID UUID, String URL) {
        super(UUID);
        setURL(URL);
        count++;
    }

    @Override
    public String toString() {
        return super.toString() + "\nUniversal Resource Locator (URL): " + getURL();
    }

    public static int count() {
        return count;
    }

}

