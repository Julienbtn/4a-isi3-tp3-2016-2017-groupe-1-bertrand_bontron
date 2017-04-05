import java.util.GregorianCalendar;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.After;
import org.junit.Before;
import java.lang.IllegalArgumentException;

import org.junit.Test;
import persons.IPerson;
import persons.Person;
import static org.assertj.core.api.Assertions.assertThat;


public abstract class IPersonTest {
        
        IPerson dupont;
    
        @Before
        public abstract void setup();
        
        @After
        public void after()
        {
            
        }
        
        @Test
        public void wasBorn_should_give_false_on_anterior_date()
        {
            GregorianCalendar anteriorDate = new GregorianCalendar(1999,12,01);
            
            boolean wasBorn = dupont.wasBorn(anteriorDate);
            
            assertThat(wasBorn).isFalse();
        }
        
        @Test
        public void wasBorn_should_give_false_on_day_before()
        {
            GregorianCalendar anteriorDate = new GregorianCalendar(1999,12,31);
            
            boolean wasBorn = dupont.wasBorn(anteriorDate);
            
            assertThat(wasBorn).isFalse();
        }
        
        @Test
        public void wasBorn_should_give_false_on_posterior_date()
        {
            GregorianCalendar anteriorDate = new GregorianCalendar(2000,02,01);
            
            boolean wasBorn = dupont.wasBorn(anteriorDate);
            
            assertThat(wasBorn).isFalse();
        }
        
        @Test
        public void wasBorn_should_give_false_on_day_after()
        {
            GregorianCalendar anteriorDate = new GregorianCalendar(2000,01,02);
            
            boolean wasBorn = dupont.wasBorn(anteriorDate);
            
            assertThat(wasBorn).isFalse();
        }
        
        @Test
        public void wasBorn_should_give_true_on_same_date()
        {
            GregorianCalendar anteriorDate = new GregorianCalendar(2000,01,01);
            
            boolean wasBorn = dupont.wasBorn(anteriorDate);
            
            assertThat(wasBorn).isTrue();
        }
        
        @Test(expected=IllegalArgumentException.class)
        public void wasBorn_should_give_illegal_on_null()
        {
            GregorianCalendar anteriorDate = new GregorianCalendar();
            
            boolean wasBorn = dupont.wasBorn(anteriorDate);
            
            assertThat(wasBorn).isFalse();
        }
        
        @Test(expected=IllegalArgumentException.class)
        public void getAge_should_give_illegal_on_anterior_date()
        {
            GregorianCalendar anteriorDate = new GregorianCalendar(1999,12,01);
            
            int age = dupont.getAge(anteriorDate);
            
            assertThat(age).isNegative();
        }
        
        @Test(expected=IllegalArgumentException.class)
        public void getAge_should_give_illegal_on_day_before()
        {
            GregorianCalendar dayBefore = new GregorianCalendar(1999,12,31);
            
            int age = dupont.getAge(dayBefore);
            
            assertThat(age).isNegative();
        }
        
        @Test
        public void getAge_should_give_positive_on_posterior_date()
        {
            GregorianCalendar posteriorDate = new GregorianCalendar(2001, 01, 01);
            
            int age = dupont.getAge(posteriorDate);
            
            assertThat(age).isEqualTo(1);
        }
        
        @Test
        public void getAge_should_give_zero_on_day_after()
        {
            GregorianCalendar dayAfter = new GregorianCalendar(2000, 01, 02);
            
            int age = dupont.getAge(dayAfter);
            
            assertThat(age).isZero();
        }
        
        @Test
        public void getAge_should_give_zero_on_same_date()
        {
            GregorianCalendar sameDate = new GregorianCalendar(2000, 01, 01);
            
            int age = dupont.getAge(sameDate);
            
            assertThat(age).isZero();
        }
        
        @Test(expected=IllegalArgumentException.class)
        public void getAge_should_give_illegal_on_null()
        {
            
            int age = dupont.getAge(null);
            
            assertThat(age).isNull();
        }
        
        
        
        
        /*
	@Test(expected=Illl)
	public void test(){
            
            
		assertThat(true).isTrue();
	}*/
}
