package org.dimigo.oop;

public class Person {
    public static final String TYPE = "포유류";
    private final String birthDt;
    private String name;

    public Person(String birthDt, String name) {
        this.birthDt = birthDt;
        this.name = name;
    }

    public String toString() {
        return "Person{" + "type='" + TYPE + '\'' +
                ", birthDt='" + birthDt + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Person p1 = new Person("20020411", "김도훈");
        Person p2 = new Person("20021111", "강우석");
        System.out.println(p1);
        System.out.println(p2);

        System.out.println(Person.TYPE);
    }
}
