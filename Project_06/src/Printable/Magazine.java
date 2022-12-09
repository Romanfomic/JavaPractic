package Printable;

public class Magazine implements Printable
{
    String name;
    public Magazine(String name){ this.name = name; }
    public void print(){
        System.out.printf("Magazine: %s \n", name);
    }
}
