package se.axw.tl_view;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

public class ParserTest {
    @Test public void testSomeLibraryMethod() {
        Parser parser = new Parser();
        InputStream test_input = getStreamFromResourceFile("test.csv");

        assertEquals(2, parser.numberOfLines(test_input));
    }

    private InputStream getStreamFromResourceFile(String name) {
        return this.getClass().getClassLoader().getResourceAsStream(name);
    }
}
