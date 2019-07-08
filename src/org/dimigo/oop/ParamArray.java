package org.dimigo.oop;

public class ParamArray {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        add(intArr, 10);
        printArray(intArr);

        String[] strArr = {"홍길동", "홍길서", "홍길남", "홍길북"};
        changeName(strArr, "김"); // 홍 -> 김
        printArray(strArr);
    }

    private static void printArray(String[] strArr) {
        for (String values : strArr) {
            System.out.print(values + " | ");
        }
        System.out.println();
    }

    private static void changeName(String[] strArr, String familyName) {
        for (int i = 0; i < strArr.length; i++) {
            // strArr[i] = strArr[i].replace("홍", familyName);
            strArr[i] = familyName + strArr[i].substring(1);
        }
    }

    private static void printArray(int[] intArr) {
        for (int values : intArr) {
            System.out.print(values + " | ");
        }
        System.out.println();
    }

    private static void add(int[] intArr, int num) {
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] += num;
        }
    }
}
