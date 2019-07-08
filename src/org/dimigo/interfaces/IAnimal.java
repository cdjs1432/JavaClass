package org.dimigo.interfaces;

public interface IAnimal {
    // 인터페이스 필드 -> 상수 (public static final)
    String FARM_NAME = "디미 동물농장";

    //추상 메소드 (public abstract 붙음)
    // public abstract void eat();
    // abstract void sleep();
    void bark();

    // JDK 8 : 정적 메소드 구현
    static void welcome() {
        System.out.println(FARM_NAME + "에 오신걸 환영합니다");
    }

    // JDK 8 : default 메소드 구현
    public default void eat() {
        System.out.println("냠냠");
    }

    public default void sleep() {
        System.out.println("쿨쿨");
    }
}
