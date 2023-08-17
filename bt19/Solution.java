package javab10.bt19;

public class Solution {
    public static boolean checkNumberInRange(int a){
        if(a > 20 && a<100 || a>20 && a<400){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int number = 500;
        System.out.println(checkNumberInRange(number));
    }
}
