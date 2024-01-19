package org.example;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        int seconds = 359999;
        DecimalFormat formatter = new DecimalFormat("00");
        Date date = new Date(0,Calendar.JANUARY, 0,0,0,seconds);
        System.out.printf("%s:%s:%s", formatter.format(date.getDay() * 24 + date.getHours()), formatter.format(date.getMinutes()), formatter.format(date.getSeconds()));
    }
}
