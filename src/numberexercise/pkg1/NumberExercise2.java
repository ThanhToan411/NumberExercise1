package numberexercise.pkg1;
import java.util.ArrayList;
public class NumberExercise2 {

    // Method to input an array of integers
    public static ArrayList<Integer> EnterData(ArrayList<Integer> numbers) {
        // Same as previous method to enter data
    }

    // Method to print the array of integers
    public static void printData(ArrayList<Integer> numbers) {
        if (numbers.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("The numbers in the list are:");
            for (Integer number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println(); // Move to the next line after printing all numbers
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        EnterData(numbers);
        
        // Print the array of integers
        printData(numbers);
    }
}