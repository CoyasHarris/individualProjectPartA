/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualprojectparta;

import java.util.ArrayList;
import java.util.Scanner;

public class IndividualProjectPartA {

    public static void main(String[] args) {

        ArrayList<EachIndividualCourse> eachIndividualCoursesList = new ArrayList<EachIndividualCourse>();

        System.out.println("Hello!!\n\nWelcome to our Private School Builder \n\nPress:\n1.To import data yourself.\n2.For Synthetic data insertion.");
        Scanner scan = new Scanner(System.in);
        int yn = scan.nextInt();

        if (yn == 1) {                                                  //Από χρήστη
            userInputData.addCoursesFromUser(eachIndividualCoursesList);//Γεμισμα αδειας λιστας με courses
            userInputData.addTrainersFromUser(eachIndividualCoursesList);// Προσθήκη λίστας με Trainers
            userInputData.addStudentsFromUser(eachIndividualCoursesList);//Προσθήκη Μαθητών
            userInputData.addAssignmentsFromUser(eachIndividualCoursesList);//Προσθήκη Assignments

        } else {                                                        //Απο Synthetic data

            SyntheticData.addSyntheticCourses(eachIndividualCoursesList);
            SyntheticData.addSyntheticTrainers(eachIndividualCoursesList);
            SyntheticData.addSyntheticStudents(eachIndividualCoursesList);
            SyntheticData.addSyntheticAssignments(eachIndividualCoursesList);
        }
        System.out.println("Your Private School is ready!!");
        System.out.println("Would you like to see what it contains? ");
        int answ;

        do {

            System.out.println("Press :\n"
                    + " 1.For Students List\n 2.For Trainers List\n 3.For Courses List\n 4.For Assignments List");
            int ans = scan.nextInt();

            if (ans == 1) {
                for (int i = 0; i < Students.eachStudentList.size(); i++) {            
                    System.out.println(Students.eachStudentList.get(i).toString());
                }
            } else if (ans == 2) {
                for (int i = 0; i < SimpleLists.simpleTrainersList.size(); i++) {

                    System.out.println(SimpleLists.simpleTrainersList.get(i));
                }
            } else if (ans == 3) {
                for (int i = 0; i < SimpleLists.simpleCourseList.size(); i++) {
                    System.out.println(SimpleLists.simpleCourseList.get(i));
                }

            } else if (ans == 4) {
                for (int i = 0; i < SimpleLists.simpleAssignmentList.size(); i++) {
                    System.out.println(SimpleLists.simpleAssignmentList.get(i));
                }

            }
            System.out.println("");
            System.out.println("Would you like to see something else?\n1.Yes please I want previous list menu again. "
                    + "\n2.No Proceed.");
            answ = scan.nextInt();
        } while (answ == 1);

        System.out.println("Would you like to see Data Per Course?\nPress:\n1.Yes.\n2.No.");

        int yn22;
        int moreCrs;
        int moreInf;
        yn22 = scan.nextInt();
        if (yn22 == 1) {

            do {
                System.out.println("For which Course you need details ?\nPress:");

                for (int k = 0; k < eachIndividualCoursesList.size(); k++) {
                    System.out.println((k + 1) + ".For :" + eachIndividualCoursesList.get(k).getCourse().toString());

                }

                int anss;
                anss = scan.nextInt();
                int anss2 = (anss - 1);
                do {
                    System.out.println("For Course \n:" + eachIndividualCoursesList.get(anss2).getCourse().toString() + "\nYou can have the following options :\nPress:"
                            + "\n1.For Students.\n2.For Trainers .\n3.For Assignments");
                    int anss22;
                    anss22 = scan.nextInt();

                    if (anss22 == 1) {

                        System.out.println("STUDENTS" + eachIndividualCoursesList.get(anss2).studentListPerCourse.toString());
                    } else if (anss22 == 2) {

                        System.out.println("TRAINERS :" + eachIndividualCoursesList.get(anss2).trainerListPerCourse.toString());
                    } else if (anss22 == 3) {
                        System.out.println("ASSIGNMENTS :" + eachIndividualCoursesList.get(anss2).assignmentListPerCourse.toString());

                    }

                    System.out.println("Do you need more details for this Course?\nPress:\n1.Yes.\n2.No.");
                    moreInf = scan.nextInt();
                    scan.nextLine();
                } while (moreInf == 1);

                System.out.println("Do you need more details for another Course?\nPress:\n1.Yes.\n2.No.");
                moreCrs = scan.nextInt();
                scan.nextLine();
            } while (moreCrs == 1);

        }

        int stuInf;
        int detStu;
        System.out.println("Would you like to see details for each Student?\nPress:\n1.Yes.\n2.No.");
        detStu = scan.nextInt();
        //detStu=scan.nextInt();        
        if (detStu == 1) {

            do {

                System.out.println("For which Student you need information \nPress:\n");
                for (int i = 0; i < Students.eachStudentList.size(); i++) {
                    System.out.println((i + 1) + ".For :" + Students.eachStudentList.get(i).toString());

                }

                int ans;
                ans = scan.nextInt();
                int ans2 = (ans - 1);

                System.out.println("For student : " + Students.eachStudentList.get(ans2).getLastName() + " " + Students.eachStudentList.get(ans2).getFirstName()
                        + "\nYou Have the following options:\nPress:\n1.For his/her Assignments");

                ans = scan.nextInt();
                if (ans == 1) {
                    System.out.println(Students.eachStudentList.get(ans2).AssignmentListPerStudents);

                }

                System.out.println("Would you like details for another Student?\nPress:\n1.Yes.\n2.No.");
                stuInf = scan.nextInt();
            } while (stuInf == 1);

        }

        System.out.println("Would you like to see a List of Students that below to more than 1 Course? \n1.Yes.\n2.No");
        int ans;
        ans = scan.nextInt();

        if (ans == 1) {
            System.out.println("More than 2 Courses have the following Students :\n");
            for (int i = 0; i < Students.eachStudentList.size(); i++) {
                int duplicate = Students.eachStudentList.get(i).CoursesListPerStudents.size();

                if (duplicate >= 2) {

                    System.out.println(Students.eachStudentList.get(i).getLastName() + "  " + Students.eachStudentList.get(i).getFirstName());
                    System.out.println(Students.eachStudentList.get(i).CoursesListPerStudents.toString());
                }
            }
        }

        System.out.println("Would you like to check  Assignments that need to be delivered? \n1.Yes.\n2.No");
        int ansAss;
        ansAss = scan.nextInt();

        if (ansAss == 1) {
            AssignCheck.checkAssignmentDate(eachIndividualCoursesList);
        }

        System.out.println("Thank you!");
    }

}
