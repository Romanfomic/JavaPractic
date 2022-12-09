package Circle;
import java.util.Arrays;

import java.util.Random;

public class CircleTester {
    private Circle[] circleArray;
    private int count;
    public CircleTester(int count){
        circleArray = new Circle[count];
        this.count = count;
        Random rand = new Random();
        for(int i = 0; i < count; i++){
            int x = rand.nextInt(10);
            int y = rand.nextInt(10);
            int radius = rand.nextInt(10);
            circleArray[i] = new Circle(x, y, radius);
        }
        sort();
        System.out.println(toString());
    }
    private void sort(){
        Circle temp = new Circle();
        for(int i = 0; i < count-1; i++){
            for(int j = i; j < count; j++){
                if(circleArray[j].getRadius() < circleArray[i].getRadius()){
                    temp = circleArray[i];
                    circleArray[i] = circleArray[j];
                    circleArray[j] = temp;
                }
            }
        }
    }
    private Circle max(){
        int maxRadius = 0;
        Circle maxCircle = circleArray[0];
        for(int i = 0; i < count; i++){
            if(circleArray[i].getRadius() > maxRadius){
                maxRadius = circleArray[i].getRadius();
                maxCircle = circleArray[i];
            }
        }
        return maxCircle;
    }
    private Circle min(){
        int minRadius = circleArray[0].getRadius();
        Circle minCircle = circleArray[0];
        for(int i = 0; i < count; i++){
            if(circleArray[i].getRadius() < minRadius){
                minRadius = circleArray[i].getRadius();
                minCircle = circleArray[i];
            }
        }
        return minCircle;
    }
    public String toString(){
        String info = "";
        for(int i = 0; i < count; i++){
            info += circleArray[i].toString() + "\n";
        }
        info += "\nMax: " + max().toString() + "\nMin: " + min().toString();
        return info;
    }
}
