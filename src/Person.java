import java.util.Date;

/**
 * Created by usuario on 22/09/2015.
 */
public class Person {

    private static final long MILLISECONDS_PER_YEAR = (long) (60 * 60 * 1000 * 24 * 365.25);
    private final String name;
    private final String surname;
    private final Date birthday;

    public Person(String name, String surname, Date birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getFullName(){
        return name + " " + surname;
    }

    public int getAge(){
        return fromMillisToYears(new Date().getTime()-birthday.getTime());
    }

    private int fromMillisToYears(long millis) {
        return (int) (millis/MILLISECONDS_PER_YEAR);
    }
}
