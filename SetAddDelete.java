import java.util.HashSet;
import java.util.Set;

public class SetAddDelete {
    public static void main(String[] args) {
        // Create a new Set
        Set<String> set = new HashSet<>();

        // Add elements to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Print the set
        System.out.println("Set: " + set);

        // Delete an element from the set
        set.remove("Banana");

        // Print the updated set
        System.out.println("Updated Set: " + set);
    }
}
