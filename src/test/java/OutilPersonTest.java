
import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import persons.IPerson;
import persons.Person;


public class OutilPersonTest {
    
    private Collection<Mock> persons;
            
    public void setup(){
        persons = new ArrayList<>();
        IPerson person = mock(Person.class);
        when(person.getAge(any(GregorianCalendar.class))).thenReturn(5);
        
    }
    
}
