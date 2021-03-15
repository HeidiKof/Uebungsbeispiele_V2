import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        int [] numbers = {1, 2, 3, 4, 5, 6, 7};
        printArray(numbers);
        System.out.println();
        System.out.println("Includes Number 29: " + containsNumber(numbers, 29));
        System.out.println("Includes Number 2: " + containsNumber(numbers, 2));

        System.out.println("Summe: " + calculateSum(numbers));

        System.out.println(Arrays.toString(reverse(numbers)));

    }



    public static void printArray(int[] numbers) {
        System.out.print(Arrays.toString(numbers) + ", ");
    }

    public static boolean containsNumber(int[] numbers, int n) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                return true;
            }
        }
        return false;
    }

    public static int calculateSum(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static int[] reverse(int[] numbers) {
        int[] reversedResult = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int newIndex = numbers.length -1 -i;
            reversedResult [newIndex] = numbers[i];
        }
            return reversedResult;
    }

}
