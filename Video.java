package RequestInheritance;

/**
 * this class is used to set the video, like the to takein the random url , and random title, random publisher
 */
public class Video {
    /**
     * this method is used to get the string value of Url
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * this method is used to set the String url
     * @param url is string type
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * the string value type of Url
     */
    private String url;

    /**
     * this method is used to get the String valeu of titole
     * @return the String value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * this method is used to set the title
     * @param title the Sting value of title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * this method is used to set the String of title
     */

    private String title;

    /**
     * this method is used to get the String publisher
     * @return
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * this method is used to get the String value of publisher
     * @param publisher the String value of publisher
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * this is String value of publisher
     */
    private String publisher;

    /**
     * this is the constructor of this file
     * @param url is the String value
     * @param title is the String type value
     * @param publisher is the String value of publisher
     */
    public Video(String url, String title, String publisher) {
        setUrl(url);
        setTitle(title);
        setPublisher(publisher);
    }


    public String toString() {
        return "\nUniversal Resource Locator (URL): " + getUrl() + "\nVideo: " + getTitle() + "\nBy: " + getPublisher();
    }
}
