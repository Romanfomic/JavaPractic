package Number2;

public class MagicChairFactory implements AbstractChairFactory{
    public Chair createChair() {
        return new MagicChair();
    }
}
