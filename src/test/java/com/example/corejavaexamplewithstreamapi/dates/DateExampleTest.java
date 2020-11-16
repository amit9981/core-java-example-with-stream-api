package com.example.corejavaexamplewithstreamapi.dates;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

import static org.junit.jupiter.api.Assertions.*;

class DateExampleTest {

    @Test
    void specificDate(){
        final LocalDate date = LocalDate.of(2020, 11, 6);
        System.out.println(date);
        final LocalDate plusDays = date.plusDays(90);
        System.out.println(plusDays);
    }

    @Test
    void period(){
        final LocalDate date = LocalDate.of(2020, 11, 6);
        LocalDate now = LocalDate.now();
        final Period between = Period.between(date, now);
        System.out.println(between.getYears());
        System.out.println(between.getDays());
        System.out.println(between.getMonths());

    }

}