package org.dimigo.oop;

public class WrapperTest {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toHexString(13));

        // Boxing : 기본자료형 데이터 -> Wrapper 클래스 객체
        // 생성자 이용
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");

        System.out.println(i1 == i2);

        Integer ii = Integer.valueOf(100);
        Integer iii = Integer.valueOf("100");
        System.out.println(ii == iii);

        Integer i3 = Integer.valueOf(100);
        Integer i4 = Integer.valueOf("100");
        Double d1 = Double.valueOf(3.14);

        // Unboxing
        int i = i3.intValue();
        double d = d1.doubleValue();

        // 문자열 -> 기본형 : ParseXxx()
        int i5 = Integer.parseInt("1000");

        // "3.14" -> double
        double d2 = Double.parseDouble("3.14");

        Integer n1 = 1000;
        Integer n2 = 2000;
        System.out.println(n1 + n2);

        Integer obj = 1000;
        int i6 = obj + 100;

        // 총 몇번 autoboxing, autounboxing이 일어났을까?
        Integer n3 = 10;            // autoboxing 1번
        Integer n4 = n3 + 20;       // autoboxing 1번, autounboxing
        Integer result = n3 + n4;   // autoboxing 1번, autounboxing 2번
    }
}
