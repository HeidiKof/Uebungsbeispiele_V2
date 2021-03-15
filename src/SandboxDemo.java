public class SandboxDemo {
    public static void main(String[] args) {

        double l = 1.4;
        double w = 1.4;
        double h = 0.25;
        String name = "Homemade Sandbox";
        double price = 0;



        int x = 7;
        Sandbox homeMade= new Sandbox();
        Sandbox bauhaus = new Sandbox();
        Sandbox whikey = new Sandbox();

        homeMade.height = 0.2;
        homeMade.width = 1.4;
        homeMade.length = 1.4;
        homeMade.name = "Selbstgemacht";
        homeMade.price = 0;
        System.out.println("homeMade = " + homeMade.calcVolume());

        bauhaus.height = 0.26;
        bauhaus.width = 1.55;
        bauhaus.length = 1.55;
        bauhaus.name = "Sandkasten von Bauhaus";
        bauhaus.price = 59;

        whikey.height = 0.24;
        whikey.width = 1.6;
        whikey.length = 1.6;
        whikey.name = "Sandkasten von Whikey";
        whikey.price = 129;

        homeMade.print();
        bauhaus.print();
        whikey.print();
            }

    public static double calcVolume (double length, double width, double height) {
        return length * width * height;
    }
}
