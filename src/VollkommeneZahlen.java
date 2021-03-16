public class VollkommeneZahlen {
    public static void main(String[] args) {
        for (long i = 0; i <= 100000000; i++) {
            if (isPerfect(i) == true) {
                System.out.println(i + " is a perfect number.");
            }
        }


    }
    public static boolean isPerfect (long number) {

        long counter = 1;
        long sum = 0;

        while (counter <= number) {

            if (number % counter == 0) {
                sum = sum + counter;
            }

            counter++;


            if (sum == number) {
                return true;
            }
        }
        return false;
    }
}
