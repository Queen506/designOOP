package ex2;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ex2_1 {
    public static final int MAX = 5;

    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");

        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter 5 valid integers in the range [0, 10]");

        readAndValidateInput(nums);
        displaySortedNumbers(nums);
    }

    private static void readAndValidateInput(List<Integer> nums) {
        Scanner inp = new Scanner(System.in);

        while (nums.size() < MAX) {
            String input = getInput(inp);
            validateAndAddNumber(input, nums);
        }

        inp.close();
    }

    private static String getInput(Scanner inp) {
        return inp.nextLine();
    }

    private static void validateAndAddNumber(String input, List<Integer> nums) {
        try {
            int num = Integer.parseInt(input);

            if (isValidNumber(num)) {
                nums.add(num);
            } else {
                System.out.println("Invalid range! Try again!");
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
        }
    }

    private static boolean isValidNumber(int num) {
        return num >= 0 && num <= 10;
    }

    private static void displaySortedNumbers(List<Integer> nums) {
        sortAndDisplay(nums);
    }

    private static void sortAndDisplay(List<Integer> nums) {
        Collections.sort(nums);
        for (int num : nums)
            System.out.print(num + " ");
    }
}
