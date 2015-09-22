import java.util.Date;

/**
 * Created by usuario on 22/09/2015.
 */
public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Ordenador","Listo",new Date(64,3,7));
        System.out.println(p1.getFullName()+"\n"+p1.getAge());
    }
}
