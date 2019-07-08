package org.dimigo.inheritance;

public class Teacher extends Person{
    public Teacher(){ }

    private String subject;

    public Teacher(String name, int age, int height, int weight, String subject) {
        super(name, age, height, weight);
        this.subject = subject;
    }

    public Teacher(String subject) {
        this.subject = subject;
    }

    public void teach() {
        System.out.println(super.getName() + "이(가) 공부를 가르칩니다.");
    }

    public void oversee() {
        System.out.println(super.getName() + "이(가) 감독을 합니다.");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                super.toString() +
                "}";
    }
}
