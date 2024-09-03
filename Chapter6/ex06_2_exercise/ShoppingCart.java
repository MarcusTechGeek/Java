package Chapter6.ex06_2_exercise;

public class ShoppingCart { // Public class named 'ShoppingCart', which contains the main method to execute the program.

    public static void main(String[] args) { // Main method, the entry point of the program.

        // Declare and initialize 2 Item objects
        Item item1, item2;  // Declaration of two Item object references, 'item1' and 'item2'.
        item1 = new Item(); // Creation of the first Item object, and 'item1' is assigned to reference this object.
        item2 = new Item(); // Creation of the second Item object, and 'item2' is assigned to reference this object.

        // Assign descriptions to both items
        item1.desc = "Shirt"; // The 'desc' field of 'item1' is set to "Shirt".
        item2.desc = "Pants"; // The 'desc' field of 'item2' is set to "Pants".

        // Assign one item to another and run it again.
        item1 = item2; // 'item1' is now referencing the same object as 'item2'. The original object referenced by 'item1' is no longer accessible.

        // Print the descriptions of both items
        System.out.println("Item1: " + item1.desc); // This will print "Item1: Pants" since 'item1' now references the same object as 'item2'.
        System.out.println("Item2: " + item2.desc); // This will print "Item2: Pants".
    }
}
