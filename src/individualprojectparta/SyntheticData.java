/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualprojectparta;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class SyntheticData {

    public static void addSyntheticCourses(ArrayList<EachIndividualCourse> eachIndividualCoursesList) {
        LocalDate lds = LocalDate.of(2020, 10, 10);
        LocalDate ldf = LocalDate.of(2021, 4, 30);
        LocalDate lds1 = LocalDate.of(2020, 11, 30);
        LocalDate ldf1 = LocalDate.of(2021, 5, 27);
        LocalDate lds2 = LocalDate.of(2020, 9, 10);
        LocalDate ldf2 = LocalDate.of(2021, 6, 25);

        Course b = new Course("CB11", "JAVA", "PART TIME", lds, ldf);
        eachIndividualCoursesList.add(new EachIndividualCourse(b));
        SimpleLists.simpleCourseList.add(b);

        Course c = new Course("CB12", "JAVA", "FULL TIME ", lds1, ldf1);
        eachIndividualCoursesList.add(new EachIndividualCourse(c));
        SimpleLists.simpleCourseList.add(c);

        Course d = new Course("CB13", "C#", "PART TIME  ", lds2, ldf2);
        eachIndividualCoursesList.add(new EachIndividualCourse(d));
        SimpleLists.simpleCourseList.add(d);

        Course f = new Course("CB14", "PYTHON", "FULL TIME   ", lds2, ldf2);
        eachIndividualCoursesList.add(new EachIndividualCourse(f));
        SimpleLists.simpleCourseList.add(f);

    }

    public static void addSyntheticTrainers(ArrayList<EachIndividualCourse> eachIndividualCoursesList) {

        Trainers t = new Trainers("PAPADIMITRIOU", "DIMITRIS", "JAVA");
        eachIndividualCoursesList.get(0).trainerListPerCourse.add(t);

        SimpleLists.simpleTrainersList.add(t);

        Trainers t2 = new Trainers("PAPAKOSTAS", "KOSTAS", "C#");
        eachIndividualCoursesList.get(1).trainerListPerCourse.add(t2);
        SimpleLists.simpleTrainersList.add(t2);

        Trainers t3 = new Trainers("PAPAGIANNIS", "GIANNIS", "PYTHON");
        eachIndividualCoursesList.get(2).trainerListPerCourse.add(t3);
        SimpleLists.simpleTrainersList.add(t3);

        Trainers t4 = new Trainers("PAPAZACHOS", "ZACHARIAS", "JAVASCRPIPT");
        eachIndividualCoursesList.get(3).trainerListPerCourse.add(t4);
        SimpleLists.simpleTrainersList.add(t4);

        Trainers t5 = new Trainers("PAPAMARIOS", "MARIOS", "JAVA");
        eachIndividualCoursesList.get(0).trainerListPerCourse.add(t5);
        SimpleLists.simpleTrainersList.add(t5);
    }

    public static void addSyntheticStudents(ArrayList<EachIndividualCourse> eachIndividualCoursesList) {

        Students st = new Students("COYAS", "HARRIS", "30/04/1988", 2500, "JAVA");
        eachIndividualCoursesList.get(0).studentListPerCourse.add(st);
        SimpleLists.simpleStudentList.add(st);
        Students.eachStudentList.add(st);
        Students.eachStudentList.get(0).CoursesListPerStudents.add(eachIndividualCoursesList.get(0).getCourse());
        Students.eachStudentList.get(0).CoursesListPerStudents.add(eachIndividualCoursesList.get(1).getCourse());

        Students st2 = new Students("SARLAS", "GEORGE", "01/10/1955", 2100, "JAVA");
        eachIndividualCoursesList.get(0).studentListPerCourse.add(st2);
        SimpleLists.simpleStudentList.add(st2);
        Students.eachStudentList.add(st2);
        Students.eachStudentList.get(1).CoursesListPerStudents.add(eachIndividualCoursesList.get(2).getCourse());
        Students.eachStudentList.get(1).CoursesListPerStudents.add(eachIndividualCoursesList.get(1).getCourse());

        Students st3 = new Students("TSALIKIS", "GEORGE", "27/05/1980", 1500, "C#");
        eachIndividualCoursesList.get(2).studentListPerCourse.add(st3);
        SimpleLists.simpleStudentList.add(st3);
        Students.eachStudentList.add(st3);
        Students.eachStudentList.get(2).CoursesListPerStudents.add(eachIndividualCoursesList.get(2).getCourse());

        Students st4 = new Students("MAMAKOS", "PETROS", "04/09/1979", 1600, "PYTHON");
        eachIndividualCoursesList.get(1).studentListPerCourse.add(st4);
        SimpleLists.simpleStudentList.add(st4);
        Students.eachStudentList.add(st4);
        Students.eachStudentList.get(3).CoursesListPerStudents.add(eachIndividualCoursesList.get(2).getCourse());

        Students st5 = new Students("ARNIAKOS", "TASOS", "08/05/1955", 3000, "C#");
        eachIndividualCoursesList.get(2).studentListPerCourse.add(st5);
        SimpleLists.simpleStudentList.add(st5);
        Students.eachStudentList.add(st5);
        Students.eachStudentList.get(4).CoursesListPerStudents.add(eachIndividualCoursesList.get(2).getCourse());

        Students st6 = new Students("SOVATZHS", "ANDREAS", "08/05/1955", 1800, "C#");
        eachIndividualCoursesList.get(3).studentListPerCourse.add(st6);
        SimpleLists.simpleStudentList.add(st6);
        Students.eachStudentList.add(st6);
        Students.eachStudentList.get(5).CoursesListPerStudents.add(eachIndividualCoursesList.get(0).getCourse());

        Students st7 = new Students("VAMVAKARIS", "ALEKSANDROS", "10/08/1947", 1800, "C#");
        eachIndividualCoursesList.get(2).studentListPerCourse.add(st7);
        SimpleLists.simpleStudentList.add(st7);
        Students.eachStudentList.add(st7);
        Students.eachStudentList.get(6).CoursesListPerStudents.add(eachIndividualCoursesList.get(2).getCourse());

        Students st8 = new Students("TOGIA", "MARGARITA", "08/05/1979", 1800, "PYTHON");
        eachIndividualCoursesList.get(1).studentListPerCourse.add(st8);
        SimpleLists.simpleStudentList.add(st8);
        Students.eachStudentList.add(st8);
        Students.eachStudentList.get(7).CoursesListPerStudents.add(eachIndividualCoursesList.get(1).getCourse());
        Students.eachStudentList.get(7).CoursesListPerStudents.add(eachIndividualCoursesList.get(0).getCourse());
        Students.eachStudentList.get(7).CoursesListPerStudents.add(eachIndividualCoursesList.get(2).getCourse());

    }

    public static void addSyntheticAssignments(ArrayList<EachIndividualCourse> eachIndividualCoursesList) {
        LocalDateTime sd = LocalDateTime.of(2020, 11, 11, 10, 10);
        LocalDateTime sd1 = LocalDateTime.of(2020, 12, 12, 21, 15);
        LocalDateTime sd2 = LocalDateTime.of(2021, 9, 8, 7, 35);
        LocalDateTime sd3 = LocalDateTime.of(2020, 9, 8, 10, 35);

        Assignments as = new Assignments("ProjA", "MakePrivSch", sd, 50, 50);
        eachIndividualCoursesList.get(0).assignmentListPerCourse.add(as);       //ΠΡΟΣΘΗΚΗ ASSIGNMENT ΣΤΗΝ ΛΙΣΤΑ ΤΟΥ eachIndividualCourse
        SimpleLists.simpleAssignmentList.add(as);                               //ΠΡΟΣΘΗΚΗ ASSIGNMENT ΣΤΗΝ ΑΠΛΗ ΛΙΣΤΑ
        Students.eachStudentList.get(0).AssignmentListPerStudents.add(as);      //ΠΡΟΣΘΗΚΗ ASSIGNMENT ΣΤΗΝ ΛΙΣΤΑ ΜΕ ASSIGNMENTS ΤΟΥ STUDENT
        Students.eachStudentList.get(3).AssignmentListPerStudents.add(as);      //ΠΡΟΣΘΗΚΗ ASSIGNMENT ΣΤΗΝ ΛΙΣΤΑ ΜΕ ASSIGNMENTS ΤΟΥ STUDENT

        Assignments as1 = new Assignments("ProjB", "MakeShop", sd1, 50, 50);
        eachIndividualCoursesList.get(0).assignmentListPerCourse.add(as1);
        SimpleLists.simpleAssignmentList.add(as1);
        Students.eachStudentList.get(0).AssignmentListPerStudents.add(as1);
        Students.eachStudentList.get(2).AssignmentListPerStudents.add(as1);
        Students.eachStudentList.get(1).AssignmentListPerStudents.add(as1);

        Assignments as2 = new Assignments("ProjC", "MakeUniversity", sd2, 50, 50);
        eachIndividualCoursesList.get(1).assignmentListPerCourse.add(as2);
        SimpleLists.simpleAssignmentList.add(as2);
        Students.eachStudentList.get(1).AssignmentListPerStudents.add(as2);
        Students.eachStudentList.get(4).AssignmentListPerStudents.add(as2);
        Students.eachStudentList.get(5).AssignmentListPerStudents.add(as2);

        Assignments as3 = new Assignments("ProjD", "MakeRestaurant", sd3, 50, 50);
        eachIndividualCoursesList.get(2).assignmentListPerCourse.add(as3);
        SimpleLists.simpleAssignmentList.add(as3);
        Students.eachStudentList.get(2).AssignmentListPerStudents.add(as3);
        Students.eachStudentList.get(3).AssignmentListPerStudents.add(as3);

        Assignments as4 = new Assignments("ProjE", "MakeClub", sd2, 50, 50);
        eachIndividualCoursesList.get(3).assignmentListPerCourse.add(as4);
        SimpleLists.simpleAssignmentList.add(as4);
        Students.eachStudentList.get(3).AssignmentListPerStudents.add(as4);
        Students.eachStudentList.get(7).AssignmentListPerStudents.add(as3);
        Students.eachStudentList.get(6).AssignmentListPerStudents.add(as3);

        Assignments as5 = new Assignments("ProjF", "MakeGroceryStore", sd3, 50, 50);
        eachIndividualCoursesList.get(3).assignmentListPerCourse.add(as5);
        SimpleLists.simpleAssignmentList.add(as5);
        Students.eachStudentList.get(3).AssignmentListPerStudents.add(as5);
        Students.eachStudentList.get(7).AssignmentListPerStudents.add(as4);

        Assignments as6 = new Assignments("ProjG", "MakeBarber", sd, 50, 50);
        eachIndividualCoursesList.get(3).assignmentListPerCourse.add(as6);
        SimpleLists.simpleAssignmentList.add(as6);
        Students.eachStudentList.get(4).AssignmentListPerStudents.add(as6);
        Students.eachStudentList.get(6).AssignmentListPerStudents.add(as2);

    }

}
