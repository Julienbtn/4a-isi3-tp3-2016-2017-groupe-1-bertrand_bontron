
import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import persons.IPerson;



public abstract class OutilsPerson {


    public static Collection<IPerson> filterByAgeInterval(Collection<IPerson> persons, GregorianCalendar date, int ageMin, int ageMax)
    {
        if (ageMin > ageMax || ageMin < 0)
            throw new IllegalArgumentException("ageMin ne peut pas �tre inf�rieur � 0 ou sup�rieur � ageMax");
        
        ArrayList<IPerson> res = new ArrayList<>();
        persons.forEach(n -> {
            if (n.getAge(date) >= ageMin && n.getAge(date) <= ageMax)
                res.add(n);
            });
        
        return res;
    }

    public static int getMaxAge(Collection<IPerson> persons, GregorianCalendar date)
    {
        if (persons.isEmpty())
            return -1;
        int max = Integer.MIN_VALUE;
        for (IPerson person : persons)
            max = Integer.max(max, person.getAge(date));
        return max;
    }
}
