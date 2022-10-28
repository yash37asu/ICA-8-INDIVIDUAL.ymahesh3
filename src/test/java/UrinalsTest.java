import org.junit.jupiter.api.Test;

import java.util.*;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * urinals Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Oct 27, 2022</pre>
 */
public class UrinalsTest {
    Urinals urinal = new Urinals();

    @Test
    void test_goodString() {
        String x = "yash";
        System.out.println("====== Yashkumar Maheshwari == TEST ONE EXECUTED =======");
        assertEquals(true, urinal.goodString(x));
    }


    @Test
    void validInput() {
        String x = "008701";
        System.out.println("====== Yashkumar Maheshwari == TEST TWO EXECUTED =======");
        assertEquals(false, urinal.validInput(x));
    }

    @Test
    void openFile() throws IOException {
        String path = "src/Urinal.dat";
        System.out.println("====== Yashkumar Maheshwari == TEST THREE EXECUTED =======");
        assertEquals(true, urinal.openFile(path));
    }

    @Test
    void freeUrinals() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("1010", "0100011", "0010001010010001"));
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(0, -1, 3));
        System.out.println("====== Yashkumar Maheshwari == TEST FOUR EXECUTED =======");
        assertEquals(numbers, urinal.freeUrinals(input));
    }

    @Test
    void writetofile() throws IOException {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("====== Yashkumar Maheshwari == TEST FIVE EXECUTED =======");
        assertEquals(true, urinal.writeToFile(numbers));

    }
}
