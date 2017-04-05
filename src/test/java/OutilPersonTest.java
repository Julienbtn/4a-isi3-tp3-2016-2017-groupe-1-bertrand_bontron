
import org.junit.Before;
import org.junit.Test;
import persons.IPerson;
import persons.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;


public class OutilPersonTest {

    private GregorianCalendar date = new GregorianCalendar();
    private IPerson person5;
    private IPerson person8;
    private IPerson person1;
    private IPerson person63;

    @Before
    public void setup(){

        person5 = mock(Person.class);
        when(person5.getAge(any(GregorianCalendar.class))).thenReturn(5);
        person8 = mock(Person.class);
        when(person8.getAge(any(GregorianCalendar.class))).thenReturn(8);
        person1 = mock(Person.class);
        when(person1.getAge(any(GregorianCalendar.class))).thenReturn(1);
        person63 = mock(Person.class);
        when(person63.getAge(any(GregorianCalendar.class))).thenReturn(63);
        
    }

    @Test
    public void filterByAgeInterval_should_be_between_1_and_15(){
        Collection<IPerson> persons = new ArrayList<>();
        persons.add(person5);
        persons.add(person8);
        persons.add(person1);
        persons.add(person63);

        Collection<IPerson> filtered = OutilsPerson.filterByAgeInterval(persons, date,1, 15);

        assertThat(filtered).allMatch(n -> n.getAge(date) >= 1 && n.getAge(date) <= 15);
    }

    @Test(expected = IllegalArgumentException.class)
    public void filterByAgeInterval_should_throw_IllegalArgument_when_ageMin_sup_to_ageMax(){
        Collection<IPerson> persons = new ArrayList<>();
        Collection<IPerson> filtered;

        filtered = OutilsPerson.filterByAgeInterval(persons, date, 15, 1);

        assertThat(filtered).allMatch(n -> persons.contains(n) && n.getAge(date) >= 1 && n.getAge(date) <= 15);
    }

    @Test
    public void getMaxAge_should_be_8(){
        Collection<IPerson> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person8);
        persons.add(person5);

        int maxAge = OutilsPerson.getMaxAge(persons, date);

        assertThat(maxAge).isEqualTo(8);
    }

    @Test
    public void getMaxAge_should_be_minus_one_when_empty_list(){
        Collection<IPerson> persons = new ArrayList<>();

        int maxAge = OutilsPerson.getMaxAge(persons, date);

        assertThat(maxAge).isEqualTo(-1);
    }
    
}
