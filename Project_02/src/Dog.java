public class Dog {
    private int Age;
    private double Weight;
    private String Name;
    private boolean Hungry;
    public Dog(int age, double weight, String name){
        Age = age;
        Weight = weight;
        Name = name;
        Hungry = false;
    }
    public Dog(int age, double weight){
        Age = age;
        Weight = weight;
        Name = "Unknown";
        Hungry = false;
    }
    public Dog(int age){
        Age = age;
        Weight = 0;
        Name = "Unknown";
        Hungry = false;
    }
    public Dog(){
        Age = 0;
        Weight = 0;
        Name = "Unknown";
        Hungry = false;
    }
    public String GetName(){
        return Name;
    }
    public int GetAge(){
        return Age;
    }
    public double GetWeight(){
        return Weight;
    }
    public boolean GetHunger(){
        return Hungry;
    }

    public void SetName(String name){
        Name = name;
    }
    public void SetAge(int age){
        Age = age;
    }
    public void SetWeight(double weight){
        Weight = weight;
    }
    public void SetHunger(boolean hunger){
        Hungry = hunger;
    }

    public String toString(){
        String information = "Dog, Name = " + Name + ", Age = " + Age + ", Weight = " + Weight + ", Hunger = " + Hungry;
        return information;
    }
}

