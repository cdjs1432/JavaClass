package org.dimigo.oop;

public class CalculatorTest {
    public static void main(String[] args) {
        int a = 10, b = 20;
        Calculator calc = new Calculator(a, b);
        calc.powerOn();
        System.out.printf("%d + %d = %d\n", a, b, calc.add());
        System.out.printf("%d - %d = %d\n", a, b, calc.sub());
        System.out.printf("%d * %d = %d\n", a, b, calc.mul());
        System.out.printf("%d / %d = %.1f\n", a, b, calc.div());
        calc.powerOff();
    }
}
