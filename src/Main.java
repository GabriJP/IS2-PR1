import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by usuario on 22/09/2015.
 */
public class Main {

    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        date.set(1964,Calendar.AUGUST,3);
        Person p1 = new Person("Ordenador","Listo",date);
        System.out.println(p1.getFullName()+"\n"+p1.getAge());
        System.out.println(p1.getBirthday().getTime());
    }
}
