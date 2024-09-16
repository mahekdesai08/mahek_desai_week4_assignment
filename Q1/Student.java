package Xenosis_Internship.Assignment4.Q1;

public class Student {

    private int studId;
    private String studName;
    private String gender;

    public Student(int studId, String studName, String gender) {
        this.studId = studId;
        this.studName = studName;
        this.gender = gender;
    }

    public Student() {
    }

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studId=" + studId +
                ", studName='" + studName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
