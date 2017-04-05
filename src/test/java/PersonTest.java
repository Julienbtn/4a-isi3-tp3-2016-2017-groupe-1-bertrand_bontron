
import persons.Person;


public class PersonTest extends IPersonTest{
    
    @Override
    public void setup()
    {
        dupont = new Person("Dupont", "Henry", 2000, 01, 01);
    }
    
}
