import java.util.Scanner;

public class Day3 {
    // Integer data members
    private int num1, num2, num3, num4, num5;

    // Default constructor
    public Day3() {
        this.num1 = 0;
        this.num2 = 0;
        this.num3 = 0;
        this.num4 = 0;
        this.num5 = 0;
    }

    // Overloaded constructor to initialize the five integers
    public Day3(int num1, int num2, int num3, int num4, int num5) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
    }

    // Method to display the integers
    public void displayNumbers() {
        System.out.println("Numbers: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);
    }

    // Method to sort the integers using bubble sort
    public void sortNumbers() {
        int[] numbers = {num1, num2, num3, num4, num5};
        int n = numbers.length;
        
        // Bubble sort algorithm
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap the elements if they are in the wrong order
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // After sorting, update the integer members with sorted values
        num1 = numbers[0];
        num2 = numbers[1];
        num3 = numbers[2];
        num4 = numbers[3];
        num5 = numbers[4];
    }

    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the five integers
        System.out.println("Enter 5 integers:");

        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third integer: ");
        int num3 = scanner.nextInt();

        System.out.print("Enter fourth integer: ");
        int num4 = scanner.nextInt();

        System.out.print("Enter fifth integer: ");
        int num5 = scanner.nextInt();

        // Create an object of Day3 with user input
        Day3 sorter = new Day3(num1, num2, num3, num4, num5);

        // Display numbers before sorting
        System.out.println("Before Sorting:");
        sorter.displayNumbers();

        // Sort the numbers
        sorter.sortNumbers();

        // Display numbers after sorting
        System.out.println("After Sorting:");
        sorter.displayNumbers();

        // Close the scanner
        scanner.close();
    }
}
