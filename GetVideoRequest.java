package RequestInheritance;

/**
 *this class is extends from the GetRequest
 */
public class GetVideoRequest extends GetRequest {
    /**
     * call the constructor in video
     */
    public Video video;
    /**
     * set the count for the getVideoRequest
     */
    public static int count;

    /**
     * this is the construtor of the GetVideoRequest
     * @param UUID value type is UUID
     * @param video constructor of Video
     */

    public GetVideoRequest(java.util.UUID UUID, Video video) {
        super(UUID, video.getUrl());
        this.video = video;
        count++;
    }

    @Override
    public String toString() {
        return super.toString() + "\nVideo: " + video.getTitle() + "\nBy: " + video.getPublisher();
    }

    public static int count() {
        return count;
    }
}

