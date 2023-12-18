package ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ex2_1 {
    public static final int MAX = 5;

    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");

        List<Integer> nums = getUserInput();
        nums = filterValidInput(nums);
        nums = sortNumbers(nums);
        displaySortedNumbers(nums);
    }

    public static List<Integer> getUserInput() {
        Scanner inp = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter 5 valid integers in the range [0, 10]");

        while (nums.size() < MAX) {
            String s = inp.nextLine();

            try {
                int num = Integer.parseInt(s);
                nums.add(num);
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid! Try again!");
            }
        }
        inp.close();
        return nums;
    }

    public static List<Integer> filterValidInput(List<Integer> nums) {
        List<Integer> validInput = new ArrayList<>();
        for (int num : nums) {
            if (isValidInput(num)) {
                validInput.add(num);
            } else {
                System.out.println("Invalid range! Number " + num + " will be excluded.");
            }
        }
        return validInput;
    }

    public static boolean isValidInput(int num) {
        return num >= 0 && num <= 10;
    }

    public static List<Integer> sortNumbers(List<Integer> nums) {
        Collections.sort(nums);
        return nums;
    }

    public static void displaySortedNumbers(List<Integer> nums) {
        System.out.println("Sorted numbers:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
