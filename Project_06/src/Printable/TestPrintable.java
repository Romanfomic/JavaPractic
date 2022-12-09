package Printable;

import java.util.Optional;

public class TestPrintable {
    public TestPrintable(){
        Printable[] array = new Printable[5];
        array[0] = new Book("Capitan douther", "Pushkin");
        array[1] = new Magazine("number 12");
        array[2] = new Magazine("number 5");
        array[3] = new Book("Idiot", "Dostoevsky");
        array[4] = new Magazine("number 7");
        for(int i = 0; i < array.length; i++){
            array[i].print();
        }
    }
}
