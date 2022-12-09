public class Ball {
    private String Color;
    private boolean Fullness;

    public Ball(String color, boolean fullness){
        Color = color;
        Fullness = fullness;
    }
    public Ball(String color){
        Color = color;
        Fullness = true;
    }
    public Ball(){
        Color = "red";
        Fullness = true;
    }

    public void SetBallColor(String color){
        Color = color;
    }
    public void SetFullness(boolean fullness){
        Fullness = fullness;
    }
    public String GetBallColor(){
        return Color;
    }
    public boolean GetFullness(){
        return Fullness;
    }

    public String toString() {
        String information = "Ball, Color = " + Color + ", Fullness = " + Fullness;
        return information;
    }
}
