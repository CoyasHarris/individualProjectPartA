/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualprojectparta;

import java.util.ArrayList;


public class EachIndividualCourse {

    private Course course;

    ArrayList<Students> studentListPerCourse = new ArrayList<Students>();
    ArrayList<Trainers> trainerListPerCourse = new ArrayList<Trainers>();
    ArrayList<Assignments> assignmentListPerCourse = new ArrayList<Assignments>();

    public EachIndividualCourse(Course course) {

        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<Students> getStudentListPerCourse() {
        return studentListPerCourse;
    }

    public void setStudentListPerCourse(ArrayList<Students> studentListPerCourse) {
        this.studentListPerCourse = studentListPerCourse;
    }

    public ArrayList<Trainers> getTrainerListPerCourse() {
        return trainerListPerCourse;
    }

    public void setTrainerListPerCourse(ArrayList<Trainers> trainerListPerCourse) {
        this.trainerListPerCourse = trainerListPerCourse;
    }

    public ArrayList<Assignments> getAssignmentListPerCourse() {
        return assignmentListPerCourse;
    }

    public void setAssignmentListPerCourse(ArrayList<Assignments> assignmentListPerCourse) {
        this.assignmentListPerCourse = assignmentListPerCourse;
    }

}
