package com.demo.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CrickeCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice Fast Bowling for 15 mins !!";
    }
}
