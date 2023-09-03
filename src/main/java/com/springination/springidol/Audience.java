package com.springination.springidol;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience implements Performer {
    public void takeSeats() { // Перед выступлением
        System.out.println("The audience is taking their seats.");
    }
    public void turnOffCellPhones() { // Перед выступлением
        System.out.println("The audience is turning off their cellphones");
    }
    public void applaud() { // После выступления
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
    }
    public void demandRefund() { // После неудачного выступления
        System.out.println("Boo! We want our money back!");
    }
    public void watchPerformance(ProceedingJoinPoint proceedingJoinPoint){
        try{
            System.out.println("The audience is taking their seats.");
            System.out.println("The audience is turning off their cellphones");
            long startTime = System.currentTimeMillis();
            proceedingJoinPoint.proceed();
            long endTime = System.currentTimeMillis();
            System.out.println("time of perf " + (endTime-startTime));
            System.out.println("CLAP CLAP CLAP CLAP CLAP");
        } catch (Throwable e) {
            System.out.println("Boo! We want our money back!");
        }
    }

    @Override
    public void perform() {
        System.out.println("hhhhhh");
    }
}