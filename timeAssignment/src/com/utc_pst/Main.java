package com.utc_pst;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static int year;
    public static int month;
    public static int day;
    public static int hour;
    public static int minutes;
    public static int seconds;

    public static void main(String[] args) {

        System.out.println("Enter the Year");
        Scanner in = new Scanner(System.in);
        year = in.nextInt();
        System.out.println("Enter the Month");
        month = in.nextInt();
        System.out.println("Enter the Day");
        day = in.nextInt();
        System.out.println("Enter the Hour");
        hour = in.nextInt();
        System.out.println("Enter the Minutes");
        minutes = in.nextInt();
        System.out.println("Enter the Seconds");
        seconds = in.nextInt();

        String yy = String.valueOf(year);
        String mm = String.valueOf(month);
        String dd = String.valueOf(day);
        String hh = String.valueOf(hour);
        String min = String.valueOf(minutes);
        String sec = String.valueOf(seconds);
        String date = yy + "-" + mm + "-" + dd;
        String dateAndTime = yy + "-" + mm + "-" + dd + " " + hh + ":" + min + ":" + sec;

        datetimeUtc(date, hour, minutes, seconds);
        datetimePst(dateAndTime);

    }

    public static void datetimeUtc(String date, int hour, int mm, int ss) {

        final ZoneId utc = ZoneId.of("UTC");
        final ZonedDateTime start = LocalDate.parse(date).atStartOfDay(utc);
        final ZonedDateTime end = LocalDate.parse(date).atTime(hour, mm, ss).atZone(utc);
        System.out.println(end);

    }

    public static void datetimePst(String datetime) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(datetime, formatter);
        ZoneId zoneId = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zdt = ldt.atZone(zoneId);
        System.out.println(zdt);

    }

}
