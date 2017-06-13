package se.axw.tl_view;

import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Parser {
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
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
        try {
            Date d = sdf.parse(line);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
