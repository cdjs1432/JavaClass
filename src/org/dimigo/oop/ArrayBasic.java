package org.dimigo.oop;


public class ArrayBasic {
    public static void main(String[] args) {
        // 기본형 배열
        // int, float, double, byte, boolean, short, char, long
        int[] intArr = null;
        intArr = new int[5];
        double[] doubleArr = new double[5];
        int[] intArr2 = {1, 2, 3, 4, 5};
        int[] intArr3 = new int[]{1, 2, 3, 4, 5};
        printArray(intArr);
        printArray(intArr2);
        printArray(intArr3);
        printArray(doubleArr);


        // 참조형 배열
        // String, Book, Car, StringBuilder, Scanner, Random, ...
        String[] strArr = new String[3];
        strArr[0] = "중궈";
        strArr[1] = "기제";
        strArr[2] = "문학";
        String[] strArr2 = {"정진영", "기안84", "정민욱"};
        printArray(strArr);
        printArray(strArr2);

        // Book 타입 2개짜리 배열
        Book[] books = new Book[2];
        books[0] = new Book("민욱이의 모험", "미눅스", 100);
        books[1] = new Book("토불노", "어린이도서연구회", 160);

        Book[] books2 = {
                new Book("민욱이의 모험", "미눅스", 100),
                new Book("토불노", "어린이도서연구회", 160)
        };
        printArray(books);
        printArray(books2);


        // 배열 사용시 주의사항
//        int[] intArr4 = new int[3];
//        System.out.println(intArr4.length);
//        System.out.println(intArr4[3]);

//        String[] strArr3 = new String[3];
//        System.out.println(strArr3[0]);
//        System.out.println(strArr3[0].length());

//        Book[] books3 = new Book[3];
//        System.out.println(books3[0].getTitle());




        int[] intArr4 = new int[5];
        String[] strArr3 = new String[3];
        Book[] books4 = new Book[3];
        intArr4[3] = 100;
        strArr3[2] = "디미고";
        books4[1] = new Book("미생", "윤태호", 123);

    }

    private static void printArray(Book[] books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private static void printArray(String[] strArr) {
        for (String value : strArr) {
            System.out.print(value + " | ");
        }
        System.out.println();
    }

    private static void printArray(double[] doubleArr) {
        for (double value : doubleArr) {
            System.out.print(value + " | ");
        }
        System.out.println();
    }

    private static void printArray(int[] intArr) {
        for (int value : intArr) {
            System.out.print(value + " | ");
        }
        System.out.println();
    }
}








