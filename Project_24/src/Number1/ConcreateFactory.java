package Number1;

import java.util.Random;

public class ConcreateFactory {
    public Complex createComplex() {
        return new Complex(new Random().nextInt(1,100), new Random().nextInt(1,100));
    }
    public Complex createComplex(int iReal, int iImage) {
        return new Complex(iReal, iImage);
    }
}