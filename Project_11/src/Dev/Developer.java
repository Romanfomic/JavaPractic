package Dev;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Developer {
    private String name;
    private Calendar firstDate = Calendar.getInstance();
    private Calendar lastDate = Calendar.getInstance();
    public Developer(String name, Calendar firsDate, Calendar lastDate){
        this.name = name;
        this.firstDate = firsDate;
        this.lastDate = lastDate;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        firsDate.set(Calendar.YEAR,firsDate.get(Calendar.YEAR));
        firstDate.set(Calendar.MONTH,firsDate.get(Calendar.MONTH));
        firstDate.set(Calendar.DAY_OF_MONTH,firsDate.get(Calendar.DAY_OF_MONTH));

        lastDate.set(Calendar.YEAR,lastDate.get(Calendar.YEAR));
        lastDate.set(Calendar.MONTH,lastDate.get(Calendar.MONTH));
        lastDate.set(Calendar.DAY_OF_MONTH,lastDate.get(Calendar.DAY_OF_MONTH));
    }
    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        return "Name: " + name + "\nFistDate: " + sdf.format(firstDate.getTime()) + "\nLastDate: " + sdf.format(lastDate.getTime()) + "\n";
    }
}
