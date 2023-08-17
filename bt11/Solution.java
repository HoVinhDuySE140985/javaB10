package javab10.bt11;

import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float C = scanner.nextFloat();
        float F = scanner.nextFloat();
        scanner.close();
        Float c = (F-32)/9*5;
        System.out.println(c);
        Float f = (C/5*9)+32;
        System.out.println(f);

    }
    
}
