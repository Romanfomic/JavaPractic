package Number4;

public class Variable implements TrippleInterface {
    private final String stName;
    public Variable(String name) {
        this.stName = name;
    }
    public int evaluate(int x, int y, int z) {
        return stName.equals("x") ? x : stName.equals("y") ? y : stName.equals("z") ? z : 0;
    }
}
