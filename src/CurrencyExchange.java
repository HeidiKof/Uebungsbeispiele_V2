public class CurrencyExchange {
    public static void main(String[] args) {
        System.out.println(exchangeCurrency("HUF", 100));
        System.out.println(exchangeCurrency("SEK", 100));
        System.out.println(exchangeCurrency("USD", 100));
        System.out.println(exchangeCurrency("CAD", 100));
        System.out.println(exchangeCurrency("EUR", 100));
    }

    public static double exchangeCurrency (String currencyID, double value) {
        double converted = 0;
        if (currencyID.equals("HUF")) {
            converted = value * 328.61;
        } else if (currencyID.equals("SEK")) {
            converted = value * 10.76;
        } else if (currencyID.equals("USD")) {
            converted = value * 1.12;
        } else if (currencyID.equals("CAD")) {
            converted = value * 1.47;
        } else {
            System.out.println("Error - requested currency not supported. Please choose HUF, SEK, USD or CAD!");
        }

        return converted;
    }

}
