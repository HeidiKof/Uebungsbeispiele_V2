public class Sandbox {

    double length;
    double height;
    double width;
    String name;
    double price;

    public double calcVolume() {
        return length * width * height;
    }

    public void print() {
        System.out.println("Wir brauchen für " + name + " " + calcVolume() + " m^3 Sand. Kosten: " + price + " €.");
    }

}
