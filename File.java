package RequestInheritance;

/**
 * this class is the file class, it is used to do the random generate the filepath and filetype
 */
public class File {
    /**
     * this method is used to do the get filepath
     * @return
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * this method is used to set the filepath
     * @param filePath is a local variable
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * this private String file path value type is String
     */
    private String filePath;

    /**
     * this method is used to do the get the url
     * @return the value of url
     */
    public String getUrl() {
        return url;
    }

    /**
     * this method is used to do the set value
     * @param url the local variable string type
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * this url value type is String, used to store the url
     */
    private String url;

    /**
     * this method is used to get the filetype value
     * @return the value of the filetype, return value is String
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * this method is used to set the filetype
     * @param fileType is a local variable value type is String
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    /**
     * this private thing value type is String
     */
    private String fileType;

    /**
     * this is the construtor of this class
     * @param filePath the String value of filepath initial
     * @param fileType the String value of fileType initial
     */
    public File(String filePath, String fileType) {
        setFilePath(filePath);
        setFileType(fileType);
        setUrl("file://" + filePath + "." + fileType);
    }

}

