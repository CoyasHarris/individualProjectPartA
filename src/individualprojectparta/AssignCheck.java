/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualprojectparta;

import static individualprojectparta.userInputData.sc;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;


public class AssignCheck {
    //H συγκεκριμένη μέθοδος,παίρνει 1 μέρα,τσεκάρει τι μέρα είναι,
    //δημιουργεί όλη την εβδομάδα της αντίστοιχης μέρας και τσεκάρει για Assignments.
    public static void checkAssignmentDate(ArrayList<EachIndividualCourse> eachIndividualCoursesList) { 
                                                                                                        
        int ans;
        int intOfDay;
        String givenDate;
        do {

            System.out.println("Give me a date and I will find you Deliverable Assignements for this dates' week.\nIt is important to know the Expiring Time as well.\nEnter in the following form:\nYYYY/MM/DD/HH/MM");

            Scanner scan = new Scanner(System.in);
            givenDate = sc.nextLine();
            String[] givenDateArray = givenDate.split("/");

            LocalDateTime ld = LocalDateTime.of(Integer.parseInt(givenDateArray[0].trim()), Integer.parseInt(givenDateArray[1].trim()), Integer.parseInt(givenDateArray[2].trim()), Integer.parseInt(givenDateArray[3].trim()), Integer.parseInt(givenDateArray[4].trim()));
            DayOfWeek dow = DayOfWeek.from(ld);
            intOfDay = dow.getValue();

            if (intOfDay == 1) {

                LocalDateTime ldTues = ld.plusDays(1);
                LocalDateTime ldWed = ld.plusDays(2);
                LocalDateTime ldThur = ld.plusDays(3);
                LocalDateTime ldFri = ld.plusDays(4);
                LocalDateTime[] localdates = {ldTues, ldWed, ldThur, ldFri, ld};
                boolean assignExists = false;
                for (int i = 0; i < eachIndividualCoursesList.size(); i++) {
                    for (int k = 0; k < eachIndividualCoursesList.get(i).studentListPerCourse.size(); k++) {
                        for (int x = 0; x < eachIndividualCoursesList.get(i).studentListPerCourse.get(k).AssignmentListPerStudents.size(); x++) {
                            for (LocalDateTime element : localdates) {

                                if (element.equals(eachIndividualCoursesList.get(i).studentListPerCourse.get(k).AssignmentListPerStudents.get(x).getSubDateTime())) {
                                    System.out.println(eachIndividualCoursesList.get(i).studentListPerCourse.get(k).AssignmentListPerStudents.get(x).toString());

                                    System.out.println("   by Student :" + eachIndividualCoursesList.get(i).studentListPerCourse.get(k).toString());
                                    assignExists = true;
                                }

                            }

                        }

                    }

                }

                if (assignExists == true) {

                    System.out.println("\nThe above Assignement(s) needs to be delivered.");
                } else {
                    System.out.println("We couldn't find anything.");
                }

            } else if (intOfDay == 2) {
                LocalDateTime ldMon = ld.minusDays(1);
                LocalDateTime ldWed = ld.plusDays(1);
                LocalDateTime ldThur = ld.plusDays(2);
                LocalDateTime ldFri = ld.plusDays(3);
                LocalDateTime[] localdates = {ldMon, ldWed, ldThur, ldFri, ld};
                boolean assignExists = false;
                for (int i = 0; i < eachIndividualCoursesList.size(); i++) {
                    for (int k = 0; k < eachIndividualCoursesList.get(i).studentListPerCourse.size(); k++) {
                        for (int x = 0; x < eachIndividualCoursesList.get(i).studentListPerCourse.get(k).AssignmentListPerStudents.size(); x++) {
                            for (LocalDateTime element : localdates) {

                                if (element.equals(eachIndividualCoursesList.get(i).studentListPerCourse.get(k).AssignmentListPerStudents.get(x).getSubDateTime())) {
                                    System.out.println(eachIndividualCoursesList.get(i).studentListPerCourse.get(k).AssignmentListPerStudents.get(x).toString());

                                    System.out.println("   by Student :" + eachIndividualCoursesList.get(i).studentListPerCourse.get(k).toString());
                                    assignExists = true;
                                }

                            }

                        }

                    }

                }

                if (assignExists == true) {

                    System.out.println("\nThe above Assignement(s) needs to be delivered.");
                } else {
                    System.out.println("We couldn't find anything.");
                }

            } else if (intOfDay == 3) {

                LocalDateTime ldMon = ld.minusDays(2);
                LocalDateTime ldTues = ld.minusDays(1);
                LocalDateTime ldThur = ld.plusDays(2);
                LocalDateTime ldFri = ld.plusDays(3);
                LocalDateTime[] localdates = {ldTues, ldMon, ldThur, ldFri, ld};
                boolean assignExists = false;

                for (int i = 0; i < eachIndividualCoursesList.size(); i++) {
                    for (int k = 0; k < eachIndividualCoursesList.get(i).studentListPerCourse.size(); k++) {
                        for (int x = 0; x < eachIndividualCoursesList.get(i).studentListPerCourse.get(k).AssignmentListPerStudents.size(); x++) {
                            for (LocalDateTime element : localdates) {

                                if (element.equals(eachIndividualCoursesList.get(i).studentListPerCourse.get(k).AssignmentListPerStudents.get(x).getSubDateTime())) {
                                    System.out.println(eachIndividualCoursesList.get(i).studentListPerCourse.get(k).AssignmentListPerStudents.get(x).toString());

                                    System.out.println("   by Student :" + eachIndividualCoursesList.get(i).studentListPerCourse.get(k).toString());
                                    assignExists = true;
                                }

                            }

                        }

                    }

                }

                if (assignExists == true) {

                    System.out.println("\nThe above Assignement(s) needs to be delivered.");
                } else {
                    System.out.println("We couldn't find anything.");
                }

            } else if (intOfDay == 4) {
                LocalDateTime ldMon = ld.minusDays(3);
                LocalDateTime ldTues = ld.minusDays(2);
                LocalDateTime ldWen = ld.minusDays(1);
                LocalDateTime ldFri = ld.plusDays(1);
                LocalDateTime[] localdates = {ldTues, ldMon, ldWen, ldFri, ld};
                boolean assignExists = false;

                for (int i = 0; i < eachIndividualCoursesList.size(); i++) {
                    for (int k = 0; k < eachIndividualCoursesList.get(i).studentListPerCourse.size(); k++) {
                        for (int x = 0; x < eachIndividualCoursesList.get(i).studentListPerCourse.get(k).AssignmentListPerStudents.size(); x++) {
                            for (LocalDateTime element : localdates) {

                                if (element.equals(eachIndividualCoursesList.get(i).studentListPerCourse.get(k).AssignmentListPerStudents.get(x).getSubDateTime())) {
                                    System.out.println(eachIndividualCoursesList.get(i).studentListPerCourse.get(k).AssignmentListPerStudents.get(x).toString());

                                    System.out.println("   by Student :" + eachIndividualCoursesList.get(i).studentListPerCourse.get(k).toString());
                                    assignExists = true;
                                }

                            }

                        }

                    }

                }

                if (assignExists == true) {

                    System.out.println("\nThe above Assignement(s) needs to be delivered.");
                } else {
                    System.out.println("We couldn't find anything.");
                }

            } else if (intOfDay == 5) {
                LocalDateTime ldMon = ld.minusDays(4);
                LocalDateTime ldTues = ld.minusDays(3);
                LocalDateTime ldWen = ld.minusDays(2);
                LocalDateTime ldThur = ld.minusDays(1);
                LocalDateTime[] localdates = {ldTues, ldMon, ldThur, ldWen, ld};
                boolean assignExists = false;

                for (int i = 0; i < eachIndividualCoursesList.size(); i++) {
                    for (int k = 0; k < eachIndividualCoursesList.get(i).studentListPerCourse.size(); k++) {
                        for (int x = 0; x < eachIndividualCoursesList.get(i).studentListPerCourse.get(k).AssignmentListPerStudents.size(); x++) {
                            for (LocalDateTime element : localdates) {

                                if (element.equals(eachIndividualCoursesList.get(i).studentListPerCourse.get(k).AssignmentListPerStudents.get(x).getSubDateTime())) {
                                    System.out.println(eachIndividualCoursesList.get(i).studentListPerCourse.get(k).AssignmentListPerStudents.get(x).toString());

                                    System.out.println("   by Student :" + eachIndividualCoursesList.get(i).studentListPerCourse.get(k).toString());
                                    assignExists = true;
                                }

                            }

                        }

                    }

                }

                if (assignExists == true) {

                    System.out.println("\nThe above Assignement(s) needs to be delivered.");
                } else {
                    System.out.println("We couldn't find anything.");
                }

            } else if (intOfDay == 6) {
                LocalDateTime ldMon = ld.minusDays(5);
                LocalDateTime ldTues = ld.minusDays(4);
                LocalDateTime ldWen = ld.minusDays(3);
                LocalDateTime ldThur = ld.minusDays(2);
                LocalDateTime ldFri = ld.minusDays(1);
                LocalDateTime[] localdates = {ldTues, ldMon, ldThur, ldFri, ldWen, ld};
                boolean assignExists = false;
                for (int i = 0; i < eachIndividualCoursesList.size(); i++) {
                    for (int k = 0; k < eachIndividualCoursesList.get(i).studentListPerCourse.size(); k++) {
                        for (int x = 0; x < eachIndividualCoursesList.get(i).studentListPerCourse.get(k).AssignmentListPerStudents.size(); x++) {
                            for (LocalDateTime element : localdates) {

                                if (element.equals(eachIndividualCoursesList.get(i).studentListPerCourse.get(k).AssignmentListPerStudents.get(x).getSubDateTime())) {
                                    System.out.println(eachIndividualCoursesList.get(i).studentListPerCourse.get(k).AssignmentListPerStudents.get(x).toString());

                                    System.out.println("   by Student :" + eachIndividualCoursesList.get(i).studentListPerCourse.get(k).toString());
                                    assignExists = true;
                                }

                            }

                        }

                    }

                }

                if (assignExists == true) {

                    System.out.println("\nThe above Assignement(s) needs to be delivered.");
                } else {
                    System.out.println("We couldn't find anything.");
                }

            } else if (intOfDay == 7) {
                LocalDateTime ldMon = ld.minusDays(6);
                LocalDateTime ldTues = ld.minusDays(5);
                LocalDateTime ldWen = ld.minusDays(4);
                LocalDateTime ldThur = ld.minusDays(3);
                LocalDateTime ldFri = ld.minusDays(2);
                LocalDateTime[] localdates = {ldTues, ldMon, ldThur, ldFri, ldWen, ld};
                boolean assignExists = false;
                for (int i = 0; i < eachIndividualCoursesList.size(); i++) {
                    for (int k = 0; k < eachIndividualCoursesList.get(i).studentListPerCourse.size(); k++) {
                        for (int x = 0; x < eachIndividualCoursesList.get(i).studentListPerCourse.get(k).AssignmentListPerStudents.size(); x++) {
                            for (LocalDateTime element : localdates) {

                                if (element.equals(eachIndividualCoursesList.get(i).studentListPerCourse.get(k).AssignmentListPerStudents.get(x).getSubDateTime())) {
                                    System.out.println(eachIndividualCoursesList.get(i).studentListPerCourse.get(k).AssignmentListPerStudents.get(x).toString());

                                    System.out.println("   by Student :" + eachIndividualCoursesList.get(i).studentListPerCourse.get(k).toString());
                                    assignExists = true;
                                }

                            }

                        }

                    }

                }

                if (assignExists == true) {

                    System.out.println("\nThe above Assignement(s) needs to be delivered.");
                } else {
                    System.out.println("We couldn't find anything.");
                }

            }

            System.out.println("Do you want to check another Date?\nPress:1.Yes.\n2.No.");
            ans = scan.nextInt();
            scan.nextLine();
        } while (ans == 1);

    }

}
