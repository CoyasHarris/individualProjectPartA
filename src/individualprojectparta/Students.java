/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualprojectparta;

import java.util.ArrayList;

public class Students {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private double tuitionFees;
    private String course;

    ArrayList<Course> CoursesListPerStudents = new ArrayList<Course>();
    ArrayList<Assignments> AssignmentListPerStudents = new ArrayList<Assignments>();
    public static ArrayList<Students> eachStudentList = new ArrayList<Students>();

    Students(String lastName, String firstName, String dateOfBirth, double tuitionFees, String course) {

        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
        this.course = course;

    }

    @Override
    public String toString() {

        return "FIRST NAME :" + firstName + "  ," + "LAST NAME :" + lastName + "  ," + "DATE OF BIRTH :" + dateOfBirth + "  ,"
                + "TUITION FEES : " + tuitionFees + " COURSE : " + course;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(double tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public ArrayList<Course> getCoursesListPerStudents() {
        return CoursesListPerStudents;
    }

    public void setCoursesListPerStudents(ArrayList<Course> CoursesListPerStudents) {
        this.CoursesListPerStudents = CoursesListPerStudents;
    }

    public ArrayList<Assignments> getAssignmentListPerStudents() {
        return AssignmentListPerStudents;
    }

    public void setAssignmentListPerStudents(ArrayList<Assignments> AssignmentListPerStudents) {
        this.AssignmentListPerStudents = AssignmentListPerStudents;
    }

    public static ArrayList<Students> getEachStudentList() {
        return eachStudentList;
    }

    public static void setEachStudentList(ArrayList<Students> eachStudentList) {
        Students.eachStudentList = eachStudentList;
    }

}
