package org.dimigo.inheritance;

public class Student extends Person {

    private String studentId;

    public Student(){
    }

    public Student(String name, int age, int height, int weight, String studentId) {
        super(name, age, height, weight);
        this.studentId = studentId;
    }

    public Student(String studentId) {
        this.studentId = studentId;
    }

    public void study() {
        System.out.println(getName() + "이(가) 공부를 합니다.");
    }

    public void eatSnack(){
        System.out.println(getName() + "이(가) 과자를 먹습니다.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                super.toString() + "}";
    }
}
