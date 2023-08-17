package javab10.bt25;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        scanner.close();
        if(number%3==0){
            System.out.println(number+"Là Boi so cua 3");
        }
        if(number%7==0){
            System.out.println(number+"Là Boi so cua 7");
        }

    }
}
