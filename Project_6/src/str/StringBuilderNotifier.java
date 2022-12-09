package str;

public class StringBuilderNotifier {
    private StringBuilder sb;
    public ActionManager actionManager;

    public StringBuilderNotifier(String str) {
        sb = new StringBuilder(str);
        actionManager = new ActionManager(StringBuilderAction.values());
    }
    private StringBuilder getStringBuilder() {
        return sb;
    }

    public int compareTo(StringBuilderNotifier another) {
        return sb.compareTo(another.getStringBuilder());
    }
    public StringBuilderNotifier append(String str) {
        sb.append(str);
        actionManager.notifyActionListeners(StringBuilderAction.APPEND);
        return this;
    }

    public StringBuilderNotifier delete(int start, int end) {
        String deleted = sb.substring(start, end);
        sb.delete(start, end);
        actionManager.notifyActionListeners(StringBuilderAction.DELETE);
        return this;
    }

    public int indexOf(String str) {
        return sb.indexOf(str);
    }

    public int lastIndexOf(String str) {
        return sb.lastIndexOf(str);
    }

    public StringBuilderNotifier reverse() {
        sb.reverse();
        actionManager.notifyActionListeners(StringBuilderAction.REVERSE);
        return this;
    }

    public String toString() {
        return sb.toString();
    }
}