package org.dimigo.oop;

public class StringTest {

    public static void main(String[] args) {
        // 1. 문자열 리터럴 방식
        String dog1 = "설기";
        String dog2 = "설기";
        System.out.println(dog1 == dog2);

        // 2. new 객체 생성 방식
        String cat1 = new String("야옹이");
        String cat2 = new String("야옹이");
        System.out.println(cat1 == cat2);

        // 문제
        System.out.println(dog1 == "설기");
        System.out.println(cat1 == "야옹이");

        // 문자열 비교
        System.out.println(dog1.equals("설기"));
        System.out.println(cat1.equals("야옹이"));

        System.out.println(dog1.equals(dog2));
        System.out.println(cat1.equals(cat2));

        String id = null;
        // id가 "admin" 이면 "관리자" 출력
        // 아니면 "일반 사용자" 출력
        System.out.println("admin".equalsIgnoreCase(id) ? "관리자" : "일반 사용자");

        testString();
    }

    private static void testString() {
        //          01234567890123
        String s = "abcdefgABCDEFG";

        System.out.println(s.length());
        System.out.println(s.substring(3));         // defgABCDEFG
        System.out.println(s.substring(3,6));       // def
        System.out.println(s.indexOf("C"));         // 9
        System.out.println(s.charAt(7));            // A
        System.out.println(s.concat("ABC"));        // abcdefgABCDEFGABC
        System.out.println("   ABC   ".trim());     // ABC
        System.out.println(s.toUpperCase());        // ABCDEFGABCDEFG
        System.out.println(s.toLowerCase());        // abcdefgabcdefg
        System.out.println(s.replace("a", "A"));
        System.out.println(s.startsWith("abc"));    // true
        System.out.println(s.endsWith("EFG"));      // true
    }
}
