package numberexercise.pkg1;
import java.util.ArrayList;
public class NumberExercise3 {
    public static ArrayList<Integer> EnterData(ArrayList<Integer> numbers) {
    }
    public static void printData(ArrayList<Integer> numbers) {
    }
    public static int findMax2(ArrayList<Integer> numbers) {
        if (numbers.size() < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max1) {
                max2 = max1;
                max1 = number;
            } else if (number > max2 && number != max1) {
                max2 = number;
            }
        }

        if (max2 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Array does not have two distinct elements.");
        }

        return max2;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        EnterData(numbers);
        printData(numbers);

        try {
            int secondMax = findMax2(numbers);
            System.out.println("The second largest value is: " + secondMax);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
        
    
    

