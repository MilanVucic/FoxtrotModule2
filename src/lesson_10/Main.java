package lesson_10;

public class Main {
    // Additional HW:
    // Power function
    // Palindrome
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 4};
        int target = 4;
        System.out.println(numOfOccurrences(arr, target));
    }

    private static int numOfOccurrences(int[] array, int target) {
        return numOfOccurrencesHelper(array, target, 0);
    }

    // 1 2 3 4 5 6 4
    // target: 4
    private static int numOfOccurrencesHelper(int[] array, int target, int currentIndex) {
        if (currentIndex == array.length) {
            return 0;
        }
        int count = numOfOccurrencesHelper(array, target, currentIndex + 1);

        if (array[currentIndex] == target) {
            return count + 1;
        }
        return count;
    }

    // milan -> n + reverse(REST)
    //
    private static String reverse(String input) {
        if (input.length() == 0) {
            return "";
        }
        char lastChar = input.charAt(input.length() - 1);
        return lastChar + reverse(input.substring(0, input.length() - 1));
    }

    // Fibonacci series
    // 1 1 2 3 5 8 13 21 34 55...
    // 1 2 3 4 5 6 7  8  9  10
    private static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    // 557 -> 7 + sum(55)
    // 55 -> 5 + sum(5)
    // 5 -> 5 + sum(0)
    private static int sumOfDigits(int number) {
        number = Math.abs(number);
        if (number == 0) {
            return 0;
        }
        int lastDigit = number % 10; // 557 -> 7 + sumOfDigits(55)
        return lastDigit + sumOfDigits(number / 10);
    }

    // sum (10) = 10 + 9 + 8 + ... + 2 + 1 = 10 + sum(9)
    // sum (9) = 9 + 8 + 7 + ... + 2 + 1
    private static int sum(int number) {
        if (number <= 0) {
            return 0;
        }
        int previousSum = sum(number - 1);
        return number + previousSum;
    }

}
