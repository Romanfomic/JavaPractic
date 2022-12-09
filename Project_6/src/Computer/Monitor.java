package Computer;

public class Monitor {
    private String name;
    public Monitor(String name){
        this.name = name;
    }
    public String getName(){ return name; }
    public String toString() {
        return " Monitor: " + name;
    }
}
