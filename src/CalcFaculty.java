public class CalcFaculty {
    public static void main(String[] args) {
        System.out.println(calcFaculty(0));
        System.out.println(calcFaculty(1));
        System.out.println(calcFaculty(2));
        System.out.println(calcFaculty(3));
        System.out.println(calcFaculty(4));
        System.out.println(calcFaculty(5));
        System.out.println(calcFaculty(25));
        System.out.println(calcFaculty(125));
    }


    public static long calcFaculty (int value) {
        long faculty = 1;

        for (int i = 1; i < value+1; i++) {
            faculty = faculty * i;
        }

        return faculty;
    }
}
