package com.ss.mar.jb.five;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DatesPlayground {
    public static void main(String[] args){
        Date currentTime = new Date();
        ZonedDateTime zoneCurrentTime = ZonedDateTime.now();
        LocalDate dt = LocalDate.now();
        LocalDate bdLD = LocalDate.of(2020,01,01);
        LocalDateTime bdLDT = LocalDateTime.of(bdLD, LocalTime.now());

        ZonedDateTime bd2 = ZonedDateTime.of(bdLDT, ZoneId.systemDefault());
//        ZonedDateTime.of()

        System.out.println("Date is: "+ currentTime);
//        System.out.println("ZonedDateTime is "+ zoneCurrentTime);
        System.out.println("Last Thrusday is: " + dt.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY)));
        System.out.println("Birtday is:" + bd2 + "\n");

        System.out.println("ZoneDateTime is: "+ zoneCurrentTime +" Zone.Id is: "+ ZoneId.systemDefault());
        System.out.println("While both track time zones from the Greenwich line, Zone Date Time is just the absolute hours form it ");
        System.out.println("while Zone.id Follows the time zone rules and is shorter notation");

        ZonedDateTime zInstant = ZonedDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        Instant iZone = ZonedDateTime.now().toInstant();

        System.out.println("This is ZonedDateTime from an instant: " + zInstant);
        System.out.println("This is instant from an ZonedDateTime: " + iZone);



        //last week
        System.out.println("Last week was "+ subtractDays(currentTime, 7));

        //Length of Months in 2020
        for(Month month: Month.values()){
            YearMonth ym = YearMonth.of(2020, month);
            System.out.println(month+ " has "+ym.lengthOfMonth() +" days");
        }

        //Mondays in Jan
        LocalDate monthDate = Year.now().atMonth(1).atDay(1).with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));

        Month mi = monthDate.getMonth();
        while (mi == Month.JANUARY) {
            System.out.println("Monday In Jan "+ monthDate);
            monthDate = monthDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            mi = monthDate.getMonth();
        }


        //isFriday13th?
        try {
            LocalDate isUnlucky = Year.now().atMonth(8).atDay(13);
            System.out.println(isUnlucky +" isunlucky? "+isUnlucky.query(new unLucky()));
            LocalDate today = LocalDate.now();
            System.out.println(today +" isunlucky? "+today.query(new unLucky()));

        } catch (DateTimeException e){
            e.printStackTrace();
        }


    }

    public static Date subtractDays(Date date, int days){
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        cal.add(Calendar.DATE, -days);

        return cal.getTime();
    }


}

