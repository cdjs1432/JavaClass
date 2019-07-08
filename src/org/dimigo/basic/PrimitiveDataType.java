package org.dimigo.basic;

public class PrimitiveDataType {

    //static boolean flag;

    public static void main(String[] args) {
        // 1. 논리형

        // flag 가 참이면 "참입니다.", 거짓이면 "거짓입니다." 출력
        boolean flag = true;
        if (flag) {
            System.out.println("참입니다.");
        } else {
            System.out.println("거짓입니다.");
        }

        // 삼항연산자
        System.out.println(flag ? "참입니다." : "거짓입니다.");


        // 2. 문자형
        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("뷁");

        // 문자열
        String name = "김도훈";
        System.out.println("My name is " + name);

        // 3. 정수형
        int i1 = 10;
        int i2 = 0b00001010;
        int i3 = 012;
        int i4 = 0x0000000A;
        System.out.printf("%d %d %d %d\n", i1, i2, i3, i4);

        // byte타입 (-128 ~ 127)
        byte b1 = -128;
        byte b2 = 127;
        System.out.println(b1);
        System.out.println(b2);

        b1--;
        b2++;
        System.out.println(b1);
        System.out.println(b2);

        // 정수의 범위
        System.out.println(Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);

        // 문제 : 100억을 저장하려면?
        long large = 10000000000L;
        System.out.println(large);

        // 4. 실수형
        float f1 = 3.14f;
        double d1 = 3.14;

        // 높은 정밀도 : double
        float f2 = 0.12345678901234567890f;
        double d2 = 0.12345678901234567890;

        System.out.println(f2);
        System.out.println(d2);

        System.out.printf("%c %d %.2f %s\n",'A', 100, 3.141592, "즐거운 자바");
    }
}
