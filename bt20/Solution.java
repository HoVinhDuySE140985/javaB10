package javab10.bt20;

public class Solution {
    public static boolean checkNumber(int a, int b){
        if(a>0 && b<0 || a<0 && b > 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int a = -5;
        int b = -6;
        System.out.println(checkNumber(a, b));
    }
}
