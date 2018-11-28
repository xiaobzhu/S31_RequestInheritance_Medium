package RequestInheritance;

import java.util.HashMap;
import java.util.Random;
import java.util.UUID;

/**
 * this class is used to to the random data generate. This file is give from the professor
 */
class DataGenerator {
    // fields to hold example data
    /**
     * this private value is a constructor like the random
     */
    private Random rand;
    /**
     * this private string array is used to store the names
     */
    private String[] names;
    /**
     * this private string array is used to store the encryption
     */
    private String[] encryption;
    /**
     * this private string array is used to store the videoTitles
     */
    private String[] videoTitles;
    /**
     * this private string array is used to store the filePath
     */
    private String[] filePaths;
    /**
     * this private string array is used to store the filetype
     */
    private String[] fileTypes;
    /**
     * this private string array is used to store the colors
     */
    private String[] colors;

    // Constructor
    DataGenerator() {
        // initialize with example data
        this.rand = new Random();
        this.names = new String[]{"Tom", "Guadalupe", "Tina", "Markus", "Michael", "Diego", "Mr. Patel", "Alex"};
        this.encryption = new String[]{"Vigenere", "One Time Pad", "RSA", "Diffie-Hellman"};
        this.videoTitles = new String[]{"Top 10 Cutest Cat Videos", "ONE Simple Trick to Pass SWD", "Java 101", "Pythonistas Pythoning with Pythons", "P == NP?!?!?!"};
        this.filePaths = new String[]{"/Users/abpwrs/puppies", "/Users/tomc/backstroke", "/Users/swd_student/question", "/Users/cie_student/question", "/Users/student/stress"};
        this.fileTypes = new String[]{"txt", "csv", "pptx", "pdf", "hs", "gif", "png", "h5"};
        this.colors = new String[]{"red", "orange", "yellow", "green", "blue", "indigo", "violet", "egg shell"};
    }

    /**
     * this method is used to for the data generation
     *
     * @return the random name from the string array
     */
    // private utilities for data generation
    private String getRandName() {
        return this.names[this.rand.nextInt(this.names.length)];
    }

    /**
     * this method is used for the data generation
     *
     * @return the random color for the string array
     */
    private String getRandColor() {
        return this.colors[this.rand.nextInt(this.colors.length)];
    }

    /**
     * this method is used to random generate the videoTitle
     *
     * @return the random videoTitle of the string array
     */
    private String getRandVideoTitle() {
        return this.videoTitles[this.rand.nextInt(this.videoTitles.length)];
    }

    /**
     * this method is used to random generate the filetype
     *
     * @return the random filetype of the string array
     */
    private String getRandFileType() {
        return this.fileTypes[this.rand.nextInt(this.fileTypes.length)];
    }

    /**
     * this method is used to random generate the filepath
     *
     * @return the random filepath of the string array
     */
    private String getRandFilePath() {
        return this.filePaths[this.rand.nextInt(this.filePaths.length)];
    }

    /**
     * this method is used to random generate the URL
     *
     * @return the random URL of the string array
     */
    // public data generation tools
    public String getRandURL() {
        return "localhost:" + (((this.rand.nextInt(9) + 1) * 1000) + this.rand.nextInt(999));
    }

    /**
     * this method is used to random generate the Payment
     *
     * @return the random payment of the string array
     */

    public Payment getRandPayment() {
        return new Payment(this.getRandName(), this.rand.nextInt(10000), this.getRandName());
    }

    /**
     * this method is used to random generate the UUID
     *
     * @return the random UUID of the string array
     */
    public UUID getRandUUID() {
        return UUID.randomUUID();
    }

    /**
     * this method is used to random generate the EncryptionScheme
     *
     * @return the random EncryptionScheme of the string arrya
     */
    public String getRandEncryptionScheme() {
        return this.encryption[this.rand.nextInt(this.encryption.length)];
    }

    /**
     * this method is used to random generate the video
     *
     * @return constuctor of the video
     */
    public Video getRandVideo() {
        return new Video(this.getRandURL(), this.getRandVideoTitle(), this.getRandName());
    }

    /**
     * this method is used to random generate the file
     *
     * @return constructor of file
     */
    public File getRandFile() {
        return new File(this.getRandFilePath(), this.getRandFileType());
    }

    /**
     * this method is used to random generate the form
     *
     * @return constructor of form
     */
    public Form getRandForm() {
        HashMap<String, String> fields = new HashMap<>();
        fields.put("Favorite color", this.getRandColor());
        fields.put("Favorite encryption scheme", this.getRandEncryptionScheme());
        fields.put("Name", this.getRandName());
        return new Form(fields);
    }

    /**
     * this method is used to random generate the IP
     *
     * @return randomIP
     */
    public String getRandIP() {
        return rand.nextInt(256) + "." + rand.nextInt(256) + "." + rand.nextInt(256) + "." + rand.nextInt(256);
    }

}