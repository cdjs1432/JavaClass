package org.dimigo.oop2;

public class Car {
    // 정적 필드
    private static String company;

    // 인스턴스 필드
    private String name;

    static {
        System.out.println("static block 호출");
        company = "기아자동차";
    }
    public Car(String name) {
        System.out.println("생성자 호출");
        this.name = name;
    }

    public String toString() {
        return company + " : " + name;
    }

    public static void setCompany(String company) {
        Car.company = company;
    }

    public Car() {
    }
}
