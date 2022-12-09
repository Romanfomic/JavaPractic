package Price;

public class Price implements Priceable {
    private int price;
    public Price(int price){
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
}
