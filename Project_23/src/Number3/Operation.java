package Number3;

public abstract class Operation implements TrippleInterface {
    private TrippleInterface left;
    private TrippleInterface right;
    public Operation(TrippleInterface left, TrippleInterface right){
        this.left = left;
        this.right = right;
    }
    public abstract int evaluate(int left, int right);
    public int evaluate(int x, int y, int z) {
        return evaluate(left.evaluate(x,y,z), right.evaluate(x,y,z));
    }
}

