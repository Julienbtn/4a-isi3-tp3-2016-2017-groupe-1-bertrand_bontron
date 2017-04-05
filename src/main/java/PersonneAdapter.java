import persons.IPerson;
import persons.Person;

import java.util.GregorianCalendar;

class PersonneAdapter implements IPerson {

    private IPerson person;

    PersonneAdapter(String last, String first, GregorianCalendar birthday){
        person = new Person(last, first, birthday);
    }

    @Override
    public String getName() {
        return person.getName();
    }

    @Override
    public String getFirstName() {
        return person.getFirstName();
    }

    @Override
    public boolean wasBorn(GregorianCalendar date) {
        return person.wasBorn(date);
    }

    @Override
    public int getAge(GregorianCalendar date) {
        return person.getAge(date);
    }
}