
package numberexercise.pkg1;
import java.util.ArrayList;
import java.util.Iterator;
public class NumberExercise4 {
    public static ArrayList<Integer> EnterData(ArrayList<Integer> numbers) {
    }
    public static void printData(ArrayList<Integer> numbers) {
    }
    public static int findMax2(ArrayList<Integer> numbers) {
    }
    public static void deleteOddNumber(ArrayList<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 != 0) {  // If the number is odd
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        EnterData(numbers);
        System.out.println("Original array:");
        printData(numbers);
        deleteOddNumber(numbers);
        System.out.println("Array after deleting odd numbers:");
        printData(numbers);
    }
}
