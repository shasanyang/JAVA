package kms;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) { // score[i]?
        String[] course = {"java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int[] score = {95, 88, 76, 62, 55};

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("과목 이름>> ");
            String name = scanner.nextLine();

            if (name.equals("그만")) {
                break;
            }

            boolean found = false;
            for (int i = 0; i < course.length; i++) {
                if (course[i].equals(name)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println(name + "의 점수는 " + String.format("%d", score[i]) + "입니다.");
            } else {
                System.out.println("없는 과목입니다.");
            }
        }
    }

}