public class OrderException extends Exception{
    public OrderException(String adress){
        super("Order exception:\t" + adress);
    }
}
