package numberexercise.pkg1;
import java.util.ArrayList;
import java.util.Scanner;
public class Process  {

    // Method to input an array of integers
    public static ArrayList<Integer> EnterData(ArrayList<Integer> numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (type 'q' to quit):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a valid integer.");
            }
        }
        return numbers;
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
            System.out.println();
        }
    }

    // Method to find the second largest value in the array
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

    // Method to delete all odd numbers from the array
    public static void deleteOddNumber(ArrayList<Integer> numbers) {
        numbers.removeIf(number -> number % 2 != 0);
    }

    // Main method with menu for user to choose options
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu options
            System.out.println("\n--- Menu ---");
            System.out.println("1. Nhập mảng số nguyên");
            System.out.println("2. Xuất mảng ra màn hình");
            System.out.println("3. Tìm phần tử lớn thứ 2 trong mảng");
            System.out.println("4. Xóa các phần tử lẻ");
            System.out.println("5. Thoát");
            System.out.print("Chọn một chức năng (1-5): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    numbers.clear();  // Clear existing numbers before entering new ones
                    EnterData(numbers);
                    break;

                case 2:
                    printData(numbers);
                    break;

                case 3:
                    try {
                        int secondMax = findMax2(numbers);
                        System.out.println("Phần tử lớn thứ 2 là: " + secondMax);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    deleteOddNumber(numbers);
                    System.out.println("Đã xóa các phần tử lẻ.");
                    break;

                case 5:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);  // Exit the program
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    
}
