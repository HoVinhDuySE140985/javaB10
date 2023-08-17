package javab10.bt18;

public class Solution {
    public static boolean checkNumber(int a, int b){
        if(a == 50 || b == 50 || a+b==50){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int a = 25;
        int b = 50;
        System.out.println(checkNumber(a,b));
    }
}
