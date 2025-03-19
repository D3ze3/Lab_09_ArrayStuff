import java.util.Random;
import java.util.Scanner;

public class Lab_09_ArrayStuff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] dataPoints = new int[100];

        // Task 2: Initialize array with random values (1-100)
        Random rand = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1; // Generates numbers between 1 and 100
        }

        // Task 3: Print array values separated by " | "
        System.out.print("Array values: ");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        // Task 4: Calculate sum and average
        int sum = 0;
        for (int num : dataPoints) {
            sum += num;
        }
        double average = (double) sum / dataPoints.length;

        // Display sum and average
        System.out.println("The sum of all values in dataPoints is: " + sum);
        System.out.println("The average of the values in dataPoints is: " + average);

        // Task 5: Prompt user for a value between 1-100
        int searchValue = SafeInput.getRangedInt(in, "Enter a value to search for (1-100): ", 1, 100);

        // Task 6: Count occurrences of searchValue
        int count = 0;
        for (int num : dataPoints) {
            if (num == searchValue) {
                count++;
            }
        }
        System.out.println("The value " + searchValue + " appears " + count + " times in the array.");

        // Task 7: Find the first occurrence of searchValue
        int position = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchValue) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            System.out.println("The value " + searchValue + " was found at index " + position + ".");
        } else {
            System.out.println("The value " + searchValue + " was not found in the array.");
        }

        // Task 8: Find min and max values
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int num : dataPoints) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);

        // Task 9: Call getAverage method
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    // Task 9: Static method to calculate average
    public static double getAverage(int values[]) {
        int sum = 0;
        for (int num : values) {
            sum += num;
        }
        return (double) sum / values.length;
    }
}

