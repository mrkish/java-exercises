package school;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {

    private static int nextCourseId = 1;
    private final int courseId;
    private String name;
    private String instructor;
    private double credits;
    private ArrayList<HashMap<Integer, String>> enrolledStudents = new ArrayList<>();

    public Course(int courseId, String name, double credits,
                  ArrayList<HashMap<Integer, String>> enrolledStudents) {
        this.courseId = courseId;
        this.name = name;
        this.credits = credits;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(int courseId, String name) {
        this(courseId, name, 0, new ArrayList<>());
    }

    public Course(String name) {
        this(nextCourseId, name);
        nextCourseId++;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setInstructor(String professor) {
        this.instructor = professor;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public void setEnrolledStudents(ArrayList<HashMap<Integer, String>> students) {
        this.enrolledStudents = students;
    }

    public void addEnrolledStudent(String studentName) {

        Student student = new Student(studentName);
        int studentId = student.getStudentId();

        HashMap<Integer, String> studentIdAndName = new HashMap<>();
        studentIdAndName.put(studentId, studentName);

        this.enrolledStudents.add(studentIdAndName);
    }

    // Getters

    public String getCourseName() {
        return this.name;
    }

    public double getCourseCredits() {
        return this.credits;
    }

    public String getInstructor() {
        return this.instructor;
    }

    public ArrayList<HashMap<Integer, String>> getEnrolledStudents() {
        return this.enrolledStudents;
    }


}
