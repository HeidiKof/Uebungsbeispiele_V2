public class Schaltjahr {
    public static void main(String[] args) {


        for (int i= 0; i <= 2100; i++) {
            isLeapYear(i);
        }

    }

    public static void isLeapYear (int year) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " ist ein Schaltjahr.");
            }
        }
        else {
            if (year % 4 == 0) {
                System.out.println(year + " ist ein Schaltjahr.");
            }
        }
    }
}
