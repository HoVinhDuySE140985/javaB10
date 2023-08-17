package javab10.bt29;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number1 = scanner.nextInt();
        Integer number2 = scanner.nextInt();
        Integer number3 = scanner.nextInt();

        scanner.close();
        if((number1>=50 && number1<=99) || (number2>=50 && number2<=99) || (number3>=50 && number3<=99)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
