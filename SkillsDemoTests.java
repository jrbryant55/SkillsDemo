import static org.junit.Assert.*;
import org.junit.*;

public class SkillsDemoTests{

    @Test 
    public void multiply(){
        assertEquals(7, SkillsDemo.multiply(2,3));
    }
}