package Circle;

public class Circle {
    private Point center;
    private int radius;
    public Circle(Point center, int radius){
        this.center = center;
        this.radius = radius;
    }
    public Circle(int x, int y, int radius){
        this.center = new Point(x, y);
        this.radius = radius;
    }
    public Circle(){
        this.center = new Point(0, 0);
        this.radius = 0;
    }
    public void setCenter(Point center) { this.center = center; }
    public void setRadius(int radius) { this.radius = radius; }
    public Point getCenter(){ return center; }
    public int getRadius(){ return radius; }
    public String toString(){
        String info = "Center = " + center.toString() + ", radius = " + radius;
        return info;
    }
}
