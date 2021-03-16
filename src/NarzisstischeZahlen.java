public class NarzisstischeZahlen {
    public static void main(String[] args) {


        for (int i = 1; i <= 1000; i++) {
            if (isNarcissistic(i) == true) {
                System.out.println(i + " is a narcissistic number.");
            }
        }

    }

    public static int calcDigitSum (int value) {

        int summe = 0;

        while (value > 0) {
            summe = summe + (value % 10) * (value % 10) * (value % 10);
            value = value / 10;}

        return summe;
    }
public static boolean isNarcissistic (int value) {
        if (value == calcDigitSum(value)) {
            return true;
        }

        return false;
}
}
