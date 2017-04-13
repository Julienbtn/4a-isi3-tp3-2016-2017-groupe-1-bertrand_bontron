import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import persons.IPerson;
import java.util.GregorianCalendar;
import static org.assertj.core.api.Assertions.assertThat;


public abstract class IPersonTest {
        
        IPerson dupont;
    
        @Before
        public abstract void setup();
        
        /*
        @After
        public void after()
        {
            
        }
        */
        
        @Test
        public void wasBorn_should_give_false_on_anterior_date()
        {
            GregorianCalendar anteriorDate = new GregorianCalendar(1999,12,1);
            
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
        public void wasBorn_should_give_true_on_posterior_date()
        {
            GregorianCalendar anteriorDate = new GregorianCalendar(2000,2,1);
            
            boolean wasBorn = dupont.wasBorn(anteriorDate);
            
            assertThat(wasBorn).isTrue();
        }
        
        @Test
        public void wasBorn_should_give_true_on_day_after()
        {
            GregorianCalendar anteriorDate = new GregorianCalendar(2000,1,2);
            
            boolean wasBorn = dupont.wasBorn(anteriorDate);
            
            assertThat(wasBorn).isTrue();
        }
        
        @Test
        public void wasBorn_should_give_true_on_same_date()
        {
            GregorianCalendar anteriorDate = new GregorianCalendar(2000,1,1);
            
            boolean wasBorn = dupont.wasBorn(anteriorDate);
            
            assertThat(wasBorn).isTrue();
        }
        
        @Test(expected=NullPointerException.class)
        public void wasBorn_should_throw_NullPointer_on_null()
        {
            
            boolean wasBorn = dupont.wasBorn(null);
            
            assertThat(wasBorn).isFalse();
        }
        
        @Test(expected=IllegalArgumentException.class)
        public void getAge_should_throw_IllegalArgument_on_anterior_date()
        {
            GregorianCalendar anteriorDate = new GregorianCalendar(1999,12,1);
            
            int age = dupont.getAge(anteriorDate);
            
            assertThat(age).isNegative();
        }
        
        @Test(expected=IllegalArgumentException.class)
        public void getAge_should_throw_IllegalArgument_on_day_before()
        {
            GregorianCalendar dayBefore = new GregorianCalendar(1999,12,31);
            
            int age = dupont.getAge(dayBefore);
            
            assertThat(age).isNegative();
        }
        
        @Test
        public void getAge_should_give_positive_on_posterior_date()
        {
            GregorianCalendar posteriorDate = new GregorianCalendar(2001, 1, 1);
            
            int age = dupont.getAge(posteriorDate);
            
            assertThat(age).isEqualTo(1);
        }
        
        @Test
        public void getAge_should_give_zero_on_day_after()
        {
            GregorianCalendar dayAfter = new GregorianCalendar(2000, 1, 2);
            
            int age = dupont.getAge(dayAfter);
            
            assertThat(age).isZero();
        }
        
        @Test
        public void getAge_should_give_zero_on_same_date()
        {
            GregorianCalendar sameDate = new GregorianCalendar(2000, 1, 1);
            
            int age = dupont.getAge(sameDate);
            
            assertThat(age).isZero();
        }
        
        @Test(expected=NullPointerException.class)
        public void getAge_should_throw_NullPointer_on_null()
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
