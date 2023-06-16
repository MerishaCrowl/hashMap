//Import java utilities
import java.util.HashMap;
import java.util.Scanner;

//Declare new class CarDealer and main method
public class CarDealer {
    public static void main(String[] args) {
        //Create a HashMap of vehicles (model as key, make as value)
        HashMap<String, String> vehicles = new HashMap<>();
        vehicles.put("Civic", "Honda");
        vehicles.put("Accord", "Honda");
        vehicles.put("Camry", "Toyota");
        vehicles.put("Corolla", "Toyota");
        vehicles.put("Mustang", "Ford");
        vehicles.put("F-150", "Ford");

        // Ask the customer for the car model they are looking for
        Scanner scanner = new Scanner(System.in);
        System.out.print("What car model are you looking for? ");
        String model = scanner.nextLine();

        //Check if the requested model exists in the Hashmap
        if (vehicles.containsKey(model)) {
            String make = vehicles.get(model);
            System.out.println("Oh, you're looking for a " + model + "? Our " + make + " selection is right over here...");
        } else System.out.println("Sorry, we don't have that car model in stock.");

        scanner.close();
    }
}