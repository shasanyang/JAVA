package kms;

import java.util.Scanner;

public class average { // 이해 못함
    public static void main(String[] args) {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("값 : ");
        int[] numbers = new int[in.nextInt()];
        for (int a = 0; a < args.length; a++) {
            int i = Integer.parseInt(args[i]);
            sum += i;
        }
    }
}
