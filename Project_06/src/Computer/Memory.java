package Computer;

public class Memory {
    private String name;
    public Memory(String name){
        this.name = name;
    }
    public String getName(){ return name; }
    public String toString() {
        return " Memory: " + name;
    }
}
