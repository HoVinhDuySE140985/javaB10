package javab10.bt30;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String check = "Script";

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] arr = input.split(" ");
        String res = "";
        for(int i=0;i<arr.length;i++){
           if(i==4 && arr[i].equalsIgnoreCase(check)){
                res += "";
           }else{
            res += arr[i] + " ";
           }
        }
        System.out.println(res);
    }
}
