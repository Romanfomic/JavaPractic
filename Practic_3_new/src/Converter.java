public class Converter {
    private double rubles;
    private double euros;
    private double dollars;
    private String currency;
    public Converter(String currency, double value){
        this.currency = currency;
        if(currency == "rub"){
            rubles = value;
            euros = rubles / 30;
            dollars = rubles / 60;
        } else if (currency == "eur") {
            euros = value;
            dollars = euros * 2;
            rubles = euros * 60;
        } else if (currency == "usd") {
            dollars = value;
            euros = dollars / 2;
            rubles = dollars / 30;
        }
    }
    public String toString() {
        String info = "Rub: " + rubles + "\nUsd: " + dollars + "\nEur: " + euros;
        return info;
    }
}
