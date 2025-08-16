package com.learn.java8._14DateAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        // ✅ 1. Current Date
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date 📅: " + today);

        // ✅ 2. Specific Date (Birthday Example)
        LocalDate birthday = LocalDate.of(2002, Month.JULY, 15);
        System.out.println("My Birthday 🎂: " + birthday);

        // ✅ 3. Add/Subtract Days
        LocalDate movieRelease = today.plusDays(7); // after 7 days
        System.out.println("Movie releasing on 🎬: " + movieRelease);

        LocalDate projectDeadline = today.minusDays(10); // 10 days ago
        System.out.println("Project deadline was ⏳: " + projectDeadline);

        // ✅ 4. Compare Dates
        if(today.isAfter(birthday)) {
            System.out.println("I am already born 😅");
        }

        // ✅ 5. Current Time
        LocalTime now = LocalTime.now();
        System.out.println("Current Time ⏰: " + now);

        // ✅ 6. Specific Time (Train Departure Example)
        LocalTime trainTime = LocalTime.of(15, 45);
        System.out.println("Train departure time 🚆: " + trainTime);

        // ✅ 7. Add/Subtract Hours
        LocalTime lunchTime = now.plusHours(2);
        System.out.println("Lunch in 2 hours 🍱: " + lunchTime);

        // ✅ 8. DateTime (Combine Date + Time)
        LocalDateTime meeting = LocalDateTime.of(today, LocalTime.of(18, 0));
        System.out.println("Office Meeting 🏢: " + meeting);

        // ✅ 9. ZonedDateTime (Working with time zones 🌍)
        ZonedDateTime usaTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("New York Time 🇺🇸: " + usaTime);

        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("India Time 🇮🇳: " + indiaTime);

        // ✅ 10. Formatting Date/Time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm");
        String formattedMeeting = meeting.format(formatter);
        System.out.println("Formatted Meeting 📌: " + formattedMeeting);

        // ✅ 11. Period (Difference between Dates - Age Calculator 🎂)
        Period age = Period.between(birthday, today);
        System.out.println("My Age is 👶: " + age.getYears() + " years, " +
                age.getMonths() + " months, " +
                age.getDays() + " days");

        // ✅ 12. Duration (Difference between Times)
        Duration duration = Duration.between(trainTime, now);
        System.out.println("Time difference ⏱️: " + duration.toHours() + " hours " +
                duration.toMinutesPart() + " minutes");
    }
}

