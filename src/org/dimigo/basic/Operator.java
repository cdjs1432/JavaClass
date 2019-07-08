package org.dimigo.basic;

public class Operator {
    public static void main(String[] args) {
        // 1. 산술연산자
        int a = 5, b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println((double) a / b);

        // System.out.println(a/0);

        // 2. 다른 타입과의 연산

        int i = 10;
        double d = 3.14;
        int r = (int) (i + d);
        double r2 = i + d;

        short s1 = 1, s2 = 2;
        short r3 = (short) (s1 + s2);
        int r4 = s1 + s2;

        // 3. short-circuit 테스트
        boolean flag = true;
        a = 10;
        b = 0;
        if (flag || (a / b == 0)) {
            System.out.println("short circuit OR");
        }
        if (!flag && (a / b == 0)) {
            System.out.println("short circuit AND");
        }

        // 4. 문자열 연결 연산자
        String school = "디미고";
        int grade = 2;
        int ban = 3;
        String name = "김도훈";

        System.out.println(school + grade + ban + name);
        System.out.println(grade + ban + school + name);

        // 23디미고김도훈으로 출력하려면?
        System.out.println(grade + (ban + school) + name);
        System.out.println("" + grade + ban + school + name);
    }
}
