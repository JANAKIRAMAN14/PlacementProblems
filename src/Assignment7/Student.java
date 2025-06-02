package Assignment7;
import java.util.*;
public class Student {
    int rollNo ;
    String Name;

    public Student(int rollNo) {
        this.rollNo = rollNo;
    }

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        Name = name;
    }

    public Student() {
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", Name='" + Name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student =  new Student();
        student.setRollNo(1);
        student.setName("John");
        System.out.println(student.toString());
        student.setRollNo(2);
        student.setName("sakthi");
        System.out.println(student.toString());
    }
}
