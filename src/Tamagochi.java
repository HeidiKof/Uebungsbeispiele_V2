public class Tamagochi {

    int x;
    int y;
    int food;


    public void move (String direction, int steps) {
        if (direction.equals("oben")) {
            y = y + steps;
        } else if (direction.equals("unten")) {
            y = y - steps;
        } else if (direction.equals("rechts")) {
            x = x + steps;
        } else if (direction.equals("links")) {
            x = x - steps;
        } else {
            System.out.println("Ungülige Richtungseingabe!");
        }
        food = food - steps;
    }

    public void getFood (int addFood) {
        food = food + addFood;
    }
}
