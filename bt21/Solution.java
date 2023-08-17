package javab10.bt21;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();
        if(s.startsWith("Py")){
            System.out.println(s+1); 
        }else{
            String ss = "Py"+s;
            System.out.println(ss);
        }
    }
}
