package Number2;

public class MultiFuncChairFactory implements AbstractChairFactory{
    public Chair createChair() {
        return new MultiFuncChair();
    }
}
