package str;

public class TestStringBuilderNotifier {
    public TestStringBuilderNotifier() {
        StringBuilderNotifier sbn = new StringBuilderNotifier("Some Words");

        sbn.actionManager.addActionListener(StringBuilderAction.APPEND, () -> System.out.println("Вызван метод append()"));
        sbn.actionManager.addActionListener(StringBuilderAction.DELETE, () -> System.out.println("Вызван метод delete()"));
        sbn.actionManager.addActionListener(StringBuilderAction.REVERSE, () -> System.out.println("Вызван метод reverse()"));

        sbn.append("Some another words");
        sbn.delete(1, 3);
        sbn.reverse();
        sbn.reverse();
        System.out.println(sbn);
    }
}