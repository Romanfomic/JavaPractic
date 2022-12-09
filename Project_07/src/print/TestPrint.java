package print;
import static print.Book.*;
import static print.Magazine.*;

public class TestPrint {
    public TestPrint(){
        Printable[] printable = new Printable[10];
        printable[0] = new Printable("bookName_0", "book");
        printable[1] = new Printable("magazineName_1", "magazine");
        printable[2] = new Printable("bookName_2", "book");
        printable[3] = new Printable("magazineName_3", "magazine");
        printable[4] = new Printable("bookName_4", "book");
        printable[5] = new Printable("magazineName_5", "magazine");
        printable[6] = new Printable("bookName_6", "book");
        printable[7] = new Printable("magazineName_7", "magazine");
        printable[8] = new Printable("bookName_8", "book");
        printable[9] = new Printable("magazineName_9", "magazine");
        printMagazines(printable);
        printBooks(printable);
    }
}
