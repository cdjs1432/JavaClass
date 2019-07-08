package org.dimigo.inheritance;

public class AnimalTest {

    public static void main(String[] args) {
        Animal a = new Animal("동물");
        System.out.println(a);

        Dog dog = new Dog("댕댕이");
        System.out.println(dog);
        dog.bark();
        dog.catchBall();

        Cat cat = new Cat("야옹이");
        System.out.println(cat);
        cat.bark();
        cat.scratch();

        Tiger tiger = new Tiger("킹랑이");
        System.out.println(tiger);
        tiger.bark();
        tiger.hunt();

        Animal a2 = new Dog("멍멍이");
        Animal a3 = new Cat("고양이");
        Animal a4 = new Tiger("호랭이");

        a2.bark();
        a3.bark();
        a4.bark();


        Animal[] animals = {
                new Dog("댕멍이"),
                new Cat("ㅈ냥이"),
                new Tiger("갓랑이")
        };

        for (Animal animal : animals) {
            animal.doBark(animal);
        }

        Animal b1 = new Dog("멍멍2");
        Animal b2 = new Cat("야옹2");
        Animal b3 = new Tiger("킹갓랑2");

        b1.eat();
        b1.bark();
        Dog d = (Dog) b1;
        d.catchBall();

        ((Dog) b1).catchBall();
        ((Cat) b2).scratch();
        ((Tiger) b3).hunt();

        // instanceof 연산자
        Animal c1 = new Dog("멍댕이");
        Animal c2 = new Cat("냥냥이");
        Animal c3 = new Tiger("황랑이");

        System.out.println(c1 instanceof Dog);
        System.out.println(c2 instanceof Cat);
        System.out.println(c1 instanceof Animal);
        System.out.println(c2 instanceof Animal);
        System.out.println(c1 instanceof Cat);
        System.out.println(c2 instanceof Dog);


    }
    public static void dobark(Animal animal){

    }
}
