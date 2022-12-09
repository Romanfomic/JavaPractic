package String;

public class StrTest {
    public StrTest(){
        String str = "Hello World!";
        StrEditor t = new StrEditor();
        System.out.printf("String| %s \n\t\tLength: %s\n\t\tEdited: %s\n", str, t.length(str), t.newString(str));
    }
}
