package com.udemy.oca;

import java.time.DayOfWeek;

import java.time.LocalDate;

import java.time.temporal.ChronoUnit;

import java.util.Random;



public class ProjectCompletionSimulation {



    public static void main(String[] args) {

        int numberOfStories = 92;

        int numberOfSimulations = 1000;

        int sprintLengthWeeks = 2;

        double velocity = 62.0;

        LocalDate startDate = LocalDate.of(2025, 5, 12);

        Random random = new Random();



        LocalDate earliestCompletion = null;

        LocalDate latestCompletion = null;



        for (int i = 0; i < numberOfSimulations; i++) {

            int totalStoryPoints = 0;

            for (int j = 0; j < numberOfStories; j++) {

                totalStoryPoints += random.nextInt(7) + 1; // Generates a random number between 1 and 7

            }



            double numberOfSprints = (double) totalStoryPoints / velocity;

            long totalDays = (long) (numberOfSprints * sprintLengthWeeks * 7);

            LocalDate completionDate = startDate.plus(totalDays, ChronoUnit.DAYS);



            if (earliestCompletion == null || completionDate.isBefore(earliestCompletion)) {

                earliestCompletion = completionDate;

            }

            if (latestCompletion == null || completionDate.isAfter(latestCompletion)) {

                latestCompletion = completionDate;

            }

        }



        System.out.println("--- Project Completion Simulation Results (Based on 1000 Simulations) ---");

        System.out.println("Start Date: " + startDate);

        System.out.println("Number of User Stories: " + numberOfStories);

        System.out.println("Story Point Range per Story: 1 to 7");

        System.out.println("Sprint Length: " + sprintLengthWeeks + " weeks");

        System.out.println("Velocity per Sprint: " + velocity + " story points");

        System.out.println("-----------------------------------------------------------------------");

        System.out.println("Earliest Possible Completion Date: " + earliestCompletion);

        System.out.println("Latest Possible Completion Date: " + latestCompletion);

        System.out.println("-----------------------------------------------------------------------");

        System.out.println("Note: This simulation assumes a constant velocity and independent story point estimates.");

    }

}