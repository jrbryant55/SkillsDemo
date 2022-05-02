import static org.junit.Assert.*;
import org.junit.*;

public class SkillsDemoTests{

    @Test 
    public void subtract(){
        assertEquals(7, SkillsDemo.subtract(8,3));
    }
}