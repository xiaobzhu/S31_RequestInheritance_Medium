package RequestInheritance;

/**
 * this class is extends from getRequest
 */
public class GetFileRequest extends GetRequest {
    /**
     * private int value to do the counter
     */
    public static int count;
    /**
     * constructor for file
     */
    public File file;

    /**
     * this is the constructor of the GetFileRequest, it extend the constructor from super class
     * @param UUID
     * @param file
     */
    public GetFileRequest(java.util.UUID UUID, File file) {
        super(UUID, file.getUrl());
        this.file = file;
        count++;
    }

    public String toString() {
        return super.toString() + "\nFile Path: " + file.getFilePath() + "\nFile Type: " + file.getFileType();
    }

    /**
     * this method is used to do the count
     * @return the value of count
     */
    public static int count() {
        return count;
    }
}

