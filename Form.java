package RequestInheritance;

import java.util.HashMap;

public class Form {
    /**
     * this hashmap is used to key and value to do the pair function
     */
    private HashMap<String, String> fields;

    /**
     * this is the constructor of the Form
     * @param fields map value
     */
    public Form(HashMap<String, String> fields) {
        this.fields = fields;
    }

    public String toString() {
        return "\nForm Data" + "\nLabel: Favorite color\nValue: " + fields.get("Favorite color")
                + "\nLabel: Favorite encryption scheme\nValue: " + fields.get("Favorite encryption scheme")
                + "\nLabel: Name\nValue: " + fields.get("Name");
    }
}