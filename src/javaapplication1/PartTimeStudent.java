/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author rehma
 */
public class PartTimeStudent extends Student {
    private int numofCourses;

    public int getNumofCourses() {
        return numofCourses;
    }

    public void setNumofCourses(int numofCourses) {
        this.numofCourses = numofCourses;
    }

    public PartTimeStudent(int numofCourses, int sId, String sname) {
        super(sId, sname);
        this.numofCourses = numofCourses;
    }
}