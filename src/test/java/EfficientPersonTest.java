
import people.EfficientPerson;


public class EfficientPersonTest extends IPersonTest {
    
    @Override
    public void setup(){
        dupont = new EfficientPerson("Dupont", "Henry", 17);
    }
}