package javab10.bt26;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String string = "Hellol";
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        String tmp = string.substring(string.length()-3, string.length());
        System.out.println(tmp+s+tmp);
    }
}
