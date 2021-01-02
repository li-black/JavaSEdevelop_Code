package com.itheima.PeriodAndDuration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Test1 {
    public static void main(String[] args) {
//        Period方法常用来计算日期的间隔
        LocalDate localDate1 = LocalDate.of(2020, 1, 1);
        LocalDate localDate2 = LocalDate.of(2050, 2, 2);
        Period period = Period.between(localDate1, localDate2);
        System.out.println(period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        System.out.println(period.toTotalMonths());
        System.out.println("-------------------");
//        Duration方法，常用来计算时间的间隔
        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 1, 1, 11, 11, 11);
        LocalDateTime localDateTime2 = LocalDateTime.of(2020, 1, 1, 13, 13, 13);
        Duration duration = Duration.between(localDateTime1, localDateTime2);
        System.out.println(duration);
        System.out.println(duration.toSeconds());
        System.out.println(duration.toMillis());
        System.out.println(duration.toNanos());
    }
}
