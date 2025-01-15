package com.itlibrium.jfft;

import com.itlibrium.jfft.common.AssesmentEngine;

import java.util.Scanner;

import static com.itlibrium.jfft.common.AssesmentEngine.B2_STREAMS_OPTIONS;

public class B2SelfAssesment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Java Training Self-Assessment!");

        int totalPoints = 0;
        totalPoints += AssesmentEngine.assessSection(scanner, "The basics", AssesmentEngine.B1_BASICS);
        totalPoints += AssesmentEngine.assessSection(scanner, "Mid-sized machinery pieces", B2_STREAMS_OPTIONS);
        System.out.println("Your total score is: " + totalPoints);
        System.out.println("Assessment Completed!");

        scanner.close();
    }
}
