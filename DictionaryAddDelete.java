import java.util.Dictionary;
import java.util.Hashtable;

public class DictionaryAddDelete {
    public static void main(String[] args) {
        // Create a new Dictionary
        Dictionary<Integer, String> dictionary = new Hashtable<>();

        // Add elements to the dictionary
        dictionary.put(1, "One");
        dictionary.put(2, "Two");
        dictionary.put(3, "Three");

        // Print the dictionary
        System.out.println("Dictionary: " + dictionary);

        // Delete an element from the dictionary
        dictionary.remove(2);

        // Print the updated dictionary
        System.out.println("Updated Dictionary: " + dictionary);
    }
}
