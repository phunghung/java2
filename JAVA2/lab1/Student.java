package baitap.lab1;

import java.util.Scanner;

public class Student extends Person{
    private double mark;
    private String grade;

    public Student(int mark, String grade, String id, String name, int age) {
        super(id, name, age);
        this.mark = mark;
        this.grade = grade;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getGrade() {
        if(getMark() >= 8) {
            return "Distinction";
        }
        else if(getMark() >= 7) {
            return "Credit";
        }
        else if(getMark() >= 5) {
            return "Pass";
        }
        return "Fail";
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    public void Input() {
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem: ");
        double mark = Double.parseDouble(sc.nextLine());
        setMark(mark);
    }
    
    public void Display() {
        super.Display();
        System.out.println("Diem: " + getMark());
        System.out.println("Danh gia: " + getGrade());
    }
    
    public static void main(String[] args) {
        Student objStudent = new Student(0, "", "", "", 0);
        
        objStudent.Input();
        objStudent.Display();
    }
}
