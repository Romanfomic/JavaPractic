public class TestBall {
    public TestBall(){
        Ball ball1 = new Ball("red", false);
        Ball ball2 = new Ball("green");
        Ball ball3 = new Ball();
        ball3.SetBallColor("purple");
        ball2.SetFullness(false);
        System.out.println(ball1);
    }
}
