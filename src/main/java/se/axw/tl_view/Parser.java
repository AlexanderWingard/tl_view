package se.axw.tl_view;

import java.io.InputStream;
import java.util.Scanner;

public class Parser {
    public int numberOfLines(InputStream in) {
        Scanner s = new Scanner(in);
        int count = 0;
        while (s.hasNextLine()) {
            String line = s.nextLine();
            if(hasValidDate(line)) {
                count++;
            }
        }
        return count;
    }

    private boolean hasValidDate(String line) {
       return true;
    }
}
