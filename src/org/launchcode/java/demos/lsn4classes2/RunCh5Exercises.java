package org.launchcode.java.demos.lsn4classes2;

public class RunCh5Exercises {
    public static void main(String[] args){
        Student Michael = new Student("Michael");

        System.out.println(Michael.studentInfo());
        System.out.println(Michael.getGradeLevel());

        Michael.addGrade(3, 4);
        System.out.println(Michael.studentInfo());
        System.out.println(Michael.getGradeLevel());

        Michael.addGrade(60, 4);
        System.out.println(Michael.studentInfo());
        System.out.println(Michael.getGradeLevel());
        System.out.println("");
        System.out.println(Michael.toString());

    }
}
