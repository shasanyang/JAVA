package kms;

import java.util.Scanner;

public class add {
    public static void main(String[] args) { // 이해 불가
        int sum = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < args.length; i++) {
            try {
                int n = Integer.parseInt(args[i]);
                sum += n;
            } catch (NumberFormatException e) {
                continue;
            }
        }
        System.out.println(sum);
    }
}
