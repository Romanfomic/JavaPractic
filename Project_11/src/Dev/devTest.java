package Dev;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class devTest {
    public devTest(){
        Calendar d1 = Calendar.getInstance();
        Calendar d2 = Calendar.getInstance();
        d1.set(Calendar.YEAR,2002);
        d1.set(Calendar.MONTH,Calendar.AUGUST);
        d1.set(Calendar.DAY_OF_MONTH,31);
        Developer dev1 = new Developer("Name", d1, d2);
        System.out.println(dev1);
    }
}
