import Computer.TestComputer;
import Convert.TestConvert;
import Name.TestName;
import NewStringBuilder.TestStrBuilder;
import Price.TestPrice;
import Printable.TestPrintable;
import str.TestStringBuilderNotifier;

public class Program {
    public static void main(String[] args){
        TestName t1 = new TestName();
        TestPrice t2 = new TestPrice();
        TestPrintable t3 = new TestPrintable();
        TestComputer t4 = new TestComputer();
        TestConvert t5 = new TestConvert();
        TestStrBuilder t6 = new TestStrBuilder();
        TestStringBuilderNotifier t7    = new TestStringBuilderNotifier();
    }
}
