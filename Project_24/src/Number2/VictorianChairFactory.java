package Number2;

public class VictorianChairFactory implements AbstractChairFactory{
    public Chair createChair() {
        return new VictorianChair();
    }
}
