package javab10.bt8;

import java.util.Random;
import java.util.Scanner;


public class solution {
    public static String matchNumber(int number){
        Random random = new Random();
        int value = random.nextInt(10)+1;
        System.out.println(value);
        if(number == value){
            return "lam tot lam";
        }
        return "Khong khop";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        System.out.println(matchNumber(number));
    }
}

