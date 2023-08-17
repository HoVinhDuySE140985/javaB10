package javab10.bt15;

import java.util.Scanner;

public class Solution {
    public static float calcNumber(int number){
        float res = 0;
        if(number > 13){
            res = Math.abs(number-13)*2;
        }else{
            res = number-13;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        scanner.close();
        System.out.println(calcNumber(number));
    }
}
