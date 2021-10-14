/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualprojectparta;

import java.util.ArrayList;


public class SimpleLists {

    public static ArrayList<Course> simpleCourseList = new ArrayList<Course>();
    public static ArrayList<Trainers> simpleTrainersList = new ArrayList<Trainers>();
    public static ArrayList<Students> simpleStudentList = new ArrayList<Students>();
    public static ArrayList<Assignments> simpleAssignmentList = new ArrayList<Assignments>();

    public static ArrayList<Course> getSimpleCourseList() {
        return simpleCourseList;
    }

    public static ArrayList<Trainers> getSimpleTrainersList() {
        return simpleTrainersList;
    }

    public static ArrayList<Students> getSimpleStudentList() {
        return simpleStudentList;
    }

    public static ArrayList<Assignments> getSimpleAssignmentList() {
        return simpleAssignmentList;
    }

    public SimpleLists() {
    }

}
