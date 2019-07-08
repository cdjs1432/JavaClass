package org.dimigo.basic;

public class TypeCasting {
    public static void main(String[] args) {
        // 1. 자동 형변환 (Promotion) : 작은타입 -> 큰타입
        byte b = 10;
        short s = b;
        int i = s;
        long l = i;
        System.out.printf("%d %d %d %d\n", b, s, i, l);

        // 2. 강제 형변환 (Casting) : 큰타입 -> 작은타입
        i = (int) l;
        s = (short) i;
        b = (byte) s;
        System.out.printf("%d %d %d %d\n", b, s, i, l);

        // 강제 형변환시 주의사항
        int i2 = 128;
        byte b2 = (byte)i2;
        System.out.printf("%d %d\n", i2, b2);

        long l2 = 10000000000L;
        int i3 = (int)i2;
        System.out.println(i3);

        double d1 = 314.1592;
        int i4 = (int)d1;
        System.out.println(i4);
    }
}
