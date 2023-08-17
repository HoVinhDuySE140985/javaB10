package javab10.bt27;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        StringBuilder builder = new StringBuilder(input);
        String tmp = builder.reverse().toString();
        if(tmp.startsWith("Java")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
        
}
