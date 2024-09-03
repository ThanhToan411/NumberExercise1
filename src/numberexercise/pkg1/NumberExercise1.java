package numberexercise.pkg1;
import java.util.ArrayList;
import java.util.Scanner;
public class NumberExercise1 {
    public static ArrayList<Integer> EnterData(ArrayList<Integer> numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (type 'q' to quit):");

        while (true) {
            String input = scanner.nextLine();
            
            // Stop when the user types "q"
            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                // Convert input to an integer and add to the list
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                // Handle non-integer input
                System.out.println("Invalid input, please enter a valid integer.");
            }
        }

        return numbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        EnterData(numbers);

        // Display the numbers entered
        System.out.println("You entered the numbers: " + numbers); {
        
    }
    }
}

    

