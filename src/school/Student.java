package school;

public class Student {

    private static int nextStudentId = 1;
    private final int studentId;
    private String name;
    private int numberOfCredits;
    private double gpa;

    public Student(int studentId, String name,
                   int numberOfCredits, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(int studentId, String name) {
        this(studentId, name,  0, 0);
    }

    public Student(String name) {
        this(nextStudentId, name);
        nextStudentId++;
    }

    // Setters

    public void setStudentName(String name) {
        boolean validName = false;
        for(int i = 0; i < name.length() ; i++) {
            char ch = name.charAt(i);
            if(Character.isLetter(ch) || ch == ' ') {
                validName = true;
                continue;
            } else {
                validName = false;
                break;
            }
        }
        if(validName == true) {
            this.name = name;
        }
    }

    public void setStudentCredits(int credits) {
        this.numberOfCredits = credits;
    }

    public void setStudentGpa(double gpa) {
        this.gpa = gpa;
    }

    // Getters

    public String getStudentName() {
        return this.name;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public int getStudentCredits() {
        return this.numberOfCredits;
    }

    public double getStudentGpa() {
        return this.gpa;
    }
}
