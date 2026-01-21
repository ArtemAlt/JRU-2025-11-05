import java.io.Reader;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Date date1 = new Date(2023, 3, 11);
//        System.out.println(date1);

//        Date date2 = new Date(123, 2, 11);
//        System.out.println(date2);
//        date2.setYear(2000);
//        System.out.println(date2);

//        Calendar cal = Calendar.getInstance();
//        cal.set(2023, Calendar.JANUARY, 1);
//        System.out.println(cal.getTime());

//        cal.set(Calendar.MINUTE, 30);
//        System.out.println(cal.getTime());

//        cal.add(Calendar.DAY_OF_MONTH, +7);
//        cal.add(Calendar.MONTH, -1);

//        cal.set(2023, Calendar.JANUARY, 32);
//        System.out.println(cal.getTime());
//
//        Calendar cal2 = Calendar.getInstance();
//        cal2.set(2023, Calendar.FEBRUARY, 20);

//        LocalDate today = LocalDate.now();
//        System.out.println(today);
//        LocalDate localDate = LocalDate.of(2023, Month.JANUARY, 32);
//        System.out.println(localDate);

//        LocalDate parse = LocalDate.parse("2023-12-30");
//        System.out.println(parse);

//        Month month = parse.getMonth();
//        int year = parse.getYear();
//        int monthValue = parse.getMonthValue();
//        System.out.println(year + "-" + monthValue + "-" + month);
//        LocalDate parse1 = parse.plusDays(1);

//        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime);
//        LocalTime parse = LocalTime.parse("20:45:01");
//        System.out.println(parse);

//        LocalTime now = LocalTime.now();
//        LocalTime startTime = LocalTime.of(9,0);
//        LocalTime endTime = LocalTime.of(18,0);
//
//        if (now.isAfter(startTime) && now.isBefore(endTime)) {
//            System.out.println("Not working time");
//        }

//        Duration duration = Duration.between(startTime, endTime);
//        System.out.println("Duration: " + duration.toHours() + " hours");

//        LocalTime date1 = LocalTime.of(22,0);
//        LocalTime date2 = LocalTime.of(6,0);
//        System.out.println("Duration: " + Duration.between(date1, date2).toHours());

//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);

//        LocalDateTime localDateTime = LocalDateTime.of(2023, Month.JANUARY, 1, 0, 0, 0);
//        System.out.println(localDateTime);
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy HH:mm:ss");
//        String format = localDateTime.format(formatter);
//        System.out.println(format);

//        LocalDateTime localDateTime2 = LocalDateTime.parse();

//        Set<String> zone = ZoneId.getAvailableZoneIds();
//        System.out.println(zone.size());

//        ZonedDateTime america = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
//        ZonedDateTime def = ZonedDateTime.now(ZoneId.systemDefault());
//        ZonedDateTime london = ZonedDateTime.now(ZoneId.of("Europe/London"));
//        System.out.println(america);
//        System.out.println(def);
//        System.out.println(london);

//        OffsetDateTime now = OffsetDateTime.now();
//        Period period = Period.ofDays(1);
//        Period period1 = Period.ofWeeks(5);
//        System.out.println(period1.getDays());
//        LocalDate start = LocalDate.of(2023, 1, 1);
//        LocalDate end = LocalDate.of(2024, 7, 16);
//        Period between = Period.between(start, end);
//        System.out.println("Между " + start + " и " + end + ":");
//        System.out.println(between.getYears() + " лет, " +
//                between.getMonths() + " месяцев, " +
//                between.getDays() + " дней");
//        LocalDate plus = start.plus(Period.ofDays(1));
//        System.out.println(plus);

//        Date date = new Date();
//        Instant instant = date.toInstant();

    }
}