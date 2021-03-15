public class RechteckDemo {
    public static void main(String[] args) {
        Rechteck Gunther = new Rechteck();
        Rechteck Marianne = new Rechteck();
        Rechteck Mandy = new Rechteck();


        Gunther.width = 3;
        Gunther.length = 4;

        Marianne.width = 2;
        Marianne.length =5;

        Mandy.width = 7;
        Mandy.length = 5.5;

        Gunther.print();
        Marianne.print();
        System.out.println("Dieses Rechteck hat eine Fläche von " + Mandy.calcArea() + " cm^2, und eine Diagonale, die " + Mandy.calcDiagonal() + " cm misst.");
    }
}
