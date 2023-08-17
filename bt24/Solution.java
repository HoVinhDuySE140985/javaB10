package javab10.bt24;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String s = "hello";
        Scanner scanner = new Scanner(System.in);
        String newString = scanner.nextLine();
        scanner.close();
        Character tmp = s.charAt(0);
        System.out.println(tmp+newString+tmp);
    }
}
