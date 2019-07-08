package org.dimigo.basic;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // 1. for문
        // 구구단 출력하기

        for (int i = 2; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%d * %d = %d\t", i, j, i * j);
            }
            System.out.println();
        }

        // 2. for-each

        // for
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // for-each
        for (int value : arr) {
            System.out.println(value);
        }

        // 고등학교 수학 교육과정 출력
        String[] math = {"고등학교 수학", "수학1", "수학2", "확률과 통계", "미적분"};

        // for-each 문으로 출력
        for (String subject : math) {
            System.out.println(subject);
        }

        // 3. while, do~while
        // 메뉴 처리
        Scanner scanner = new Scanner(System.in);
        int menu;

        do {
            System.out.println("<< 아이돌 선택 >>");
            System.out.println("1. BTS");
            System.out.println("2. 레드벨벳");
            System.out.println("3. 여자친구");
            System.out.println("9. 종료");
            System.out.print("메뉴 입력 => ");

            menu = scanner.nextInt();

            switch(menu){
                case 1:
                    System.out.println("BTS를 선택하셨네요.");
                    break;
                case 2:
                    System.out.println("레드벨벳을 선택하셨네요.");
                    break;
                case 3:
                    System.out.println("여자친구를 선택하셨네요.");
                    break;
                case 9:
                    System.out.println("Bye");
                    scanner.close();
                    break;
                default:
                    System.out.println("없는 메뉴네요");
            }
        } while (menu != 9);


    }
}