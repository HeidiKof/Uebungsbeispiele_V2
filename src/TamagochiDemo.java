public class TamagochiDemo {
    public static void main(String[] args) {
        Tamagochi Baby = new Tamagochi();

        Baby.x = 6;
        Baby.y = 4;
        Baby.food = 5;

        System.out.println("Baby's Position ist: x = " + Baby.x + " / y = " + Baby.y);
        System.out.println("Baby hat noch " + Baby.food + " Portion(en) Essen übrig.");
        Baby.move("unten", 4);
        System.out.println("Baby's Position ist: x = " + Baby.x + " / y = " + Baby.y);
        System.out.println("Baby hat noch " + Baby.food + " Portion(en) Essen übrig.");
        Baby.getFood(5);
        System.out.println("Baby's Position ist: x = " + Baby.x + " / y = " + Baby.y);
        System.out.println("Baby hat noch " + Baby.food + " Portion(en) Essen übrig.");
        Baby.move("links", 6);
        System.out.println("Baby's Position ist: x = " + Baby.x + " / y = " + Baby.y);
        System.out.println("Baby hat noch " + Baby.food + " Portion(en) Essen übrig.");
    }
}
