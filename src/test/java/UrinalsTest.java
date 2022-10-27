import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* urinals Tester. 
* 
* @author <Authors name> 
* @since <pre>Oct 27, 2022</pre> 
* @version 1.0 
*/ 
public class UrinalsTest {
    Urinals urinal= new Urinals();

    @Test
    void test_goodString() {
        String x = "yash";
        assertEquals(true,urinal.goodString(x));
    }
}
