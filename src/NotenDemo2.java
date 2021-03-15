public class NotenDemo2 {
    public static void main(String[] args) {

        int punkte1 = 42;
        int punkte2 = 52;
        int punkte3 = 69;
        int punkte4 = 79;
        int punkte5 = 99;
        int punkte6 = 101;

        String notentext1 = getNotentext(punkte1);
        String notentext2 = getNotentext(punkte2);
        String notentext3 = getNotentext(punkte3);
        String notentext4 = getNotentext(punkte4);
        String notentext5 = getNotentext(punkte5);
        String notentext6 = getNotentext(punkte6);

        System.out.println("Du hast " + punkte1 + " Punkte erreicht. Deine Note ist " + notentext1 + ".");
        System.out.println("Du hast " + punkte2 + " Punkte erreicht. Deine Note ist " + notentext2 + ".");
        System.out.println("Du hast " + punkte3 + " Punkte erreicht. Deine Note ist " + notentext3 + ".");
        System.out.println("Du hast " + punkte4 + " Punkte erreicht. Deine Note ist " + notentext4 + ".");
        System.out.println("Du hast " + punkte5 + " Punkte erreicht. Deine Note ist " + notentext5 + ".");
        System.out.println("Du hast " + punkte6 + " Punkte erreicht. Deine Note ist " + notentext6 + ".");
    }

    public static String getNotentext (int punkte) {

        String note = "##Bitte geben Sie eine gültige Punktezahl ein!##";

        if (punkte >= 90 && punkte <= 100) {
            note = "Sehr Gut";
        }
        else if (punkte >= 78 && punkte < 90) {
            note = "Gut";
        }
        else if (punkte >= 65 && punkte < 78) {
            note = "Befriedigend";
        }
        else if (punkte >=51 && punkte < 65) {
            note = "Genügend";
        }
        else if (punkte >= 0 && punkte < 51){
            note = "Nicht Genügend";
        }

            return note;


    }
}
