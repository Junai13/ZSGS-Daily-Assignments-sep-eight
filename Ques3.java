package array;

import java.util.Scanner;
public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        if (str.length() % 2 == 0) {
            System.out.println("0");
        } else
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < str.length(); j++) {
                    if (i == j || i + j == str.length() - 1) {
                        System.out.print(str.charAt(j));
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
    }
}
