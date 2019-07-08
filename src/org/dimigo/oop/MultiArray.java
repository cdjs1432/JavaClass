package org.dimigo.oop;

public class MultiArray {
    public static void main(String[] args) {
        // 이차원 배열
        int[][] intArr = new int[2][3];
        printArray(intArr);

        intArr[0][1] = 100;
        intArr[1][2] = 90;
        printArray(intArr);

        // String 타입 이차원 배열
        String[][] strArr = new String[2][];
        strArr[0] = new String[3];
        strArr[1] = new String[2];
        strArr[0][0] = "C";
        strArr[0][1] = "C#";
        strArr[0][2] = "JAVA";
        strArr[1][0] = "C++";
        strArr[1][1] = "python";
        printArray(strArr);

        String[][] strArr2 = {
                {"C", "C#", "JAVA"},
                {"C++", "Python"}
        };

        String[][] strArr3 = new String[][] {
                {"C", "C#", "JAVA"},
                {"C++", "Python"}
        };

        String[][] strArr4 = {
                new String[] {"C", "C#", "JAVA"},
                new String[] {"C++", "Python"}
        };

        printArray(strArr2);
    }

    private static void printArray(String[][] strArr) {
        for (String[] str : strArr){
            for (String strings : str){
                System.out.print(strings + " | ");
            }
            System.out.println();
        }
    }

    private static void printArray(int[][] intArr) {
//        for (int i = 0; i < intArr.length; i++) {
//            for (int j = 0; j < intArr[i].length; j++) {
//                System.out.print(intArr[i][j] + " | ");
//            }
//            System.out.println();
//        }

        for (int[] arr : intArr){
            for (int values : arr){
                System.out.print(values + " | ");
            }
            System.out.println();
        }
    }
}
