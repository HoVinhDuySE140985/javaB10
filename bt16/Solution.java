package javab10.bt16;

import java.util.Scanner;

public class Solution {
    public static int calcSum(int a, int b){
        int res = 0;
        if(a==b){
            res = (a+b)*3;
        }else{
            res = a+b;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        System.out.println(calcSum(a, b));
    }
}
