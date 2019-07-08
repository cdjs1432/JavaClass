package org.dimigo.inheritance;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }


    public void catchBall() {
        System.out.println(name + "이 공을 잡아옵니다. ");
    }
}
