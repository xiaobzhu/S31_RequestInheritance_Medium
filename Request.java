package RequestInheritance;

import java.util.UUID;

/**
 *this is the super class for the request inheritance, in this class, the constructor only have the UUID, UUID is kind of
 * value type, and also have the counter to the count for the request times
 */
public class Request {
    private UUID UUID;
    public static int count = 0;

    public Request(UUID UUID) {
        this.UUID = UUID;
        count++;
    }

    /**this method is used to get get the conut from above
     * @return return the value of count
     */
    public static int count() {
        return count;
    }

    /**this is toString funcction that used to display the Class name and class address, and the uuid
     * @return
     */
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode()) + "\nUUID: " + UUID;
    }


}