package Xenosis_Internship.Assignment4.Q1;

import java.util.ArrayList;

public class StudentDetails {
    private ArrayList<Student> students;

    StudentDetails(){
        students = new ArrayList<>();
    }

    private void addStudent(Student student){
        students.add(student);
    }

    private boolean removeStudent(int id){
//        return students.removeIf(student -> student.getId() == id);
        return students.removeIf(student -> student.getStudId() == id);
    }

    private void displayStudents(){
        for(Student student:students){
           // System.out.println("Id : "+student.getStudId() +"|| "+ "Name : "+student.getStudName()+" "+"gender : "+student.getGender());
            System.out.println("Student id : "+student.getStudId());
            System.out.println("Student Name :"+student.getStudName());
            System.out.println("Student Gender : "+student.getGender());
            System.out.println("======================================");
        }
    }


    public static void main(String[] args) {
        StudentDetails studentDetails = new StudentDetails();
        studentDetails.addStudent(new Student(1,"mahek desai","female"));
        studentDetails.addStudent(new Student(2,"devanshi patel","female"));
        studentDetails.addStudent(new Student(3,"abc","male"));
        System.out.println("Student Information : ");
        studentDetails.displayStudents();
        boolean removeStudent =  studentDetails.removeStudent(3);
        if(removeStudent){
            System.out.println("Student removed successfully");
            System.out.println("After remove Student now list is : ");
            studentDetails.displayStudents();
        }else {
            System.out.println("Can't removed ,Student is not exist!!");

        }

    }
}
