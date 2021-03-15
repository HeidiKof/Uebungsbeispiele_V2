public class Rechteck {
    double length;
    double width;


    public double calcArea() {
        return length * width;
    }

    public double calcDiagonal() {
        return Math.sqrt(length*length + Math.pow(width, 2));
    }
    public void print() {
        System.out.println("Dieses Rechteck hat eine Fläche von " + calcArea() + " cm^2, und eine Diagonale, die " + calcDiagonal() + " cm misst.");
    }
}
