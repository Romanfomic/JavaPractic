package Computer;

public class Processor {
    private String name;
    Processor(String name){
        this.name = name;
    }
    public String getName(){ return name; }

    public String toString() {
        return " Processor: " + name;
    }
}
