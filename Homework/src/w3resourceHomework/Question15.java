package w3resourceHomework;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class Question15 {

    public Question15() {

    }

    public String datePrinter() {

        String pattern = "MMMMMMMMMMM  dd, yyyy";
        String timePattern = "hh : mm";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        SimpleDateFormat simpleTimeFormat = new SimpleDateFormat(timePattern);
        Date date = new Date();

        String dateFormat = simpleDateFormat.format(date);
        String timeFormat = simpleTimeFormat.format(date);

        return "Current Date and Time :\n" + dateFormat + "\n" + timeFormat;

    }


}
