
import persons.Person;

import java.util.GregorianCalendar;


public class PersonTest extends IPersonTest{
    
    @Override
    public void setup()
    {
        dupont = new Person("Dupont", "Henry", new GregorianCalendar(2000, 1, 1));
    }
    
}
