/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualprojectparta;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;


public class userInputData {

    static Scanner sc = new Scanner(System.in);

    public static void addCoursesFromUser(ArrayList<EachIndividualCourse> eachIndividualCoursesList) {

        String answer;
        String givenCourse;
        String givenCoursesDate;

        do {

            System.out.println("Please fill in a COURSE in the following form ");
            System.out.println("TITLE/" + "STREAM/" + "TYPE");
            givenCourse = sc.nextLine();
            String[] givenCoursesArray = givenCourse.split("/");

            do {
                System.out.println("Please fill in COURSE DATE IN THE FOLLOWING FORM  :\nSTART DATE      / END DATE \nYEAR-MONTH-DAY / YEAR-MONTH-DAY");
                givenCoursesDate = sc.nextLine();
                String[] givenCoursesDateArray = givenCoursesDate.split("/");

                if ((InputChecking.dateChecking(givenCoursesDateArray[0].trim())) && (InputChecking.dateChecking(givenCoursesDateArray[1].trim()))) {
                    Course b = new Course(givenCoursesArray[0].trim(), givenCoursesArray[1].trim(), givenCoursesArray[2].trim(), LocalDate.parse(givenCoursesDateArray[0].trim()), LocalDate.parse(givenCoursesDateArray[1].trim()));
                    eachIndividualCoursesList.add(new EachIndividualCourse(b));
                    SimpleLists.simpleCourseList.add(b);

                } else {
                    System.out.println("Please enter again in correct form");
                }

            } while (eachIndividualCoursesList.isEmpty());

            System.out.println("Would you like to create another Course :YES / NO ");
            answer = sc.nextLine();

        } while (answer.equalsIgnoreCase("YES"));
    }

    public static void addTrainersFromUser(ArrayList<EachIndividualCourse> eachIndividualCoursesList) {
        String answer;
        String givenTrainer;
        System.out.println("Please give Trainers for each Course .");

        for (int i = 0; i < eachIndividualCoursesList.size(); i++) {
            System.out.println("For the following Course  :");

            System.out.println(eachIndividualCoursesList.get(i).getCourse().getTitle() + "  " + eachIndividualCoursesList.get(i).getCourse().getStream()
                    + "  " + eachIndividualCoursesList.get(i).getCourse().getType());

            do {
                System.out.println("Provide Trainers in the following form :\nLast Name/First Name/Subject");
                givenTrainer = sc.nextLine();
                String[] givenTrainersArray = givenTrainer.split("/");
                Trainers tr = new Trainers(givenTrainersArray[0].trim(), givenTrainersArray[1].trim(), givenTrainersArray[2].trim());
                eachIndividualCoursesList.get(i).trainerListPerCourse.add(tr);
                SimpleLists.simpleTrainersList.add(tr);
                System.out.println("Would you like to create another Trainer for THIS COURSE? :YES / NO ");
                answer = sc.nextLine();
            } while (answer.equalsIgnoreCase("YES"));

        }

    }

    public static void addStudentsFromUser(ArrayList<EachIndividualCourse> eachIndividualCoursesList) {

        int answerAnother;
        int answer2;
        String givenStudentus;
        String answer3;

        do {
            System.out.println("Provide Students in the following form :\nLast Name/First Name /DateOfBirth(YYYY-MM-DD)/ Tuition Fees/ Course ");
            givenStudentus = sc.nextLine();
            String[] givenStudentusArray = givenStudentus.split("/");
            Students st = new Students(givenStudentusArray[0].trim(), givenStudentusArray[1].trim(), givenStudentusArray[2].trim(), Double.parseDouble(givenStudentusArray[3].trim()), givenStudentusArray[4].trim());
            Students.eachStudentList.add(st);
            do {
                System.out.println("To which Course you want to add " + st.getFirstName() + "  " + st.getLastName() + " ?");

                for (int k = 0; k < eachIndividualCoursesList.size(); k++) {
                    System.out.println("\nPress\n"
                            + (k + 1) + ".For :" + eachIndividualCoursesList.get(k).getCourse().toString());
                }

                answer3 = sc.nextLine();

                int answer4 = (Integer.parseInt(answer3) - 1);

                eachIndividualCoursesList.get(answer4).studentListPerCourse.add(st);//ΠΡΟΣΘΗΚΗ ΜΑΘΗΤΗ ΣΤΟ SPC

                int position = Students.eachStudentList.indexOf(st);
                Students.eachStudentList.get(position).CoursesListPerStudents.add(eachIndividualCoursesList.get(answer4).getCourse());

                System.out.println("Does this Student belong to another Course?\nPress:\n1.YES\n2.NO");
                answer2 = sc.nextInt();
                sc.nextLine();
            } while (answer2 == 1);

            System.out.println("Would you like to create another Student?\nPress:\n1.YES\n2.NO");
            answerAnother = sc.nextInt();
            sc.nextLine();
        } while (answerAnother == 1);
    }

    public static void addAssignmentsFromUser(ArrayList<EachIndividualCourse> eachIndividualCoursesList) {
        int answer;
        int ansMorAss;
        String givenAssignment;
        String givenAssignmentDate;
        System.out.println("Please give Assignments  for each Course .");
        String answer3;
        for (int i = 0; i < eachIndividualCoursesList.size(); i++) {
            System.out.println("For the following Course  :");

            System.out.println(eachIndividualCoursesList.get(i).getCourse().getTitle() + "  " + eachIndividualCoursesList.get(i).getCourse().getStream()
                    + "  " + eachIndividualCoursesList.get(i).getCourse().getType());

            do {
                System.out.println("Provide Assignments in the following form :\nTitle/Description/Oral Mark/Total Mark");
                givenAssignment = sc.nextLine();
                String[] givenAssignmentArray = givenAssignment.split("/");

                System.out.println("Please give Assignment Submission Date in the following form:\n YYYY/MM/DD/HH/MM");
                givenAssignmentDate = (sc.nextLine());
                String[] givenAssignmentDateArray = givenAssignmentDate.split("/");

                LocalDateTime ld
                        = LocalDateTime.of(Integer.parseInt(givenAssignmentDateArray[0]), Integer.parseInt(givenAssignmentDateArray[1]), Integer.parseInt(givenAssignmentDateArray[2]),
                                Integer.parseInt(givenAssignmentDateArray[3]), Integer.parseInt(givenAssignmentDateArray[4]));

                Assignments as = new Assignments(givenAssignmentArray[0].trim(), givenAssignmentArray[1].trim(), ld, Integer.parseInt(givenAssignmentArray[2].trim()), Integer.parseInt(givenAssignmentArray[3].trim()));
                SimpleLists.simpleAssignmentList.add(as);
                eachIndividualCoursesList.get(i).assignmentListPerCourse.add(as);
                do {
                    System.out.println("To which Student of this Course you want to add " + as.getDescription() + as.getTitle() + "?");

                    for (int k = 0; k < eachIndividualCoursesList.get(i).studentListPerCourse.size(); k++) {
                        System.out.println("\nPress\n"
                                + (k + 1) + ".For :" + eachIndividualCoursesList.get(i).studentListPerCourse.get(k).toString());
                    }

                    answer3 = sc.nextLine();
                    int answer4 = (Integer.parseInt(answer3) - 1);

                    eachIndividualCoursesList.get(i).studentListPerCourse.get(answer4).AssignmentListPerStudents.add(as);

                    System.out.println("Would you like to add this Assignments to more Students?\nPress:\n1.Yes.\n2.No.");
                    answer = sc.nextInt();
                    sc.nextLine();
                } while (answer == 1);
                System.out.println("Would you like to add more Assignments to THIS Course?\nPress:\n1.Yes.\n2.No.");
                ansMorAss = sc.nextInt();
                sc.nextLine();
            } while (ansMorAss == 1);

        }

    }
}
