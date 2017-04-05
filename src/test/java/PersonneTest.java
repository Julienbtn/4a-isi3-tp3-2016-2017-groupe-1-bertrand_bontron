
import java.util.GregorianCalendar;


public class PersonneTest extends IPersonTest{

    @Override
    public void setup()
    {
        dupont = new PersonneAdapter("Dupont", "Henry", new GregorianCalendar(2000, 1, 1));
    }

}