package javab10.bt22;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer  pos = scanner.nextInt();
        scanner.close();
        String s = "helloBro";
        String[] arr = s.split("");
        String ss = "" ;
        for(int i=0;i<arr.length;i++){
            if(i!=pos){
                ss += arr[i];
            }
        }
        System.out.println(ss);
    }
}
