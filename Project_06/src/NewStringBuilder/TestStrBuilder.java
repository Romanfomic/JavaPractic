package NewStringBuilder;

public class TestStrBuilder {
    public TestStrBuilder(){
        NewStringBuilder str = new NewStringBuilder();
        str.append("Some words");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.undo();
        System.out.println(str);
    }
}
