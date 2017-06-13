package se.axw.tl_view;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

public class ParserTest {
    @Test public void testSomeLibraryMethod() {
        Parser classUnderTest = new Parser();
        InputStream test_input = this.getClass().getClassLoader().getResourceAsStream("test.csv");
        assertEquals(2, classUnderTest.numberOfLines(test_input));
    }
}
