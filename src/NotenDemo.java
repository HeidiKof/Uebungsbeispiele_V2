public class NotenDemo {
    public static void main(String[] args) {

        int punkte1 = 67;
        int punkte2 = 50;
        int punkte3 = 79;
        int punkte4 = 92;
        int punkte5 = 55;
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
        if (punkte >= 90 && punkte <= 100) {
            return "Sehr Gut";
        }
        else if (punkte >= 78 && punkte < 90) {
            return "Gut";
        }
        else if (punkte >= 65 && punkte < 78) {
            return "Befriedigend";
        }
        else if (punkte >=51 && punkte < 65) {
            return "Genügend";
        }
        else if (punkte >= 0 && punkte < 51){
            return "Nicht Genügend";
        }
        else {
            return "##Bitte geben Sie eine gültige Punktezahl ein!##";
        }

    }
}
