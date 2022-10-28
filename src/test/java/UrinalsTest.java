import org.junit.jupiter.api.Test;
import java.util.*;
import java.io.IOException;

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
        System.out.println("====== Yashkumar Maheshwari == TEST ONE EXECUTED =======");
    }


    @Test
    void validInput() {
        String x = "008701";
        assertEquals(false,urinal.validInput(x));
        System.out.println("====== Yashkumar Maheshwari == TEST TWO EXECUTED =======");
    }

    @Test
    void openFile() throws IOException {
        String path = "src/Urinal.dat";
        assertEquals(true,urinal.openFile(path));
        System.out.println("====== Yashkumar Maheshwari == TEST THREE EXECUTED =======");
    }

    @Test
    void writetofile() throws IOException {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertEquals(true,urinal.writeToFile(numbers));

    }
}
