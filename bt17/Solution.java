package javab10.bt17;

public class Solution {
    public static int calcAbsValue(int number){
        if(number > 19){
            return (number-19)*3;
        }
        return Math.abs((number-19));
    }
    public static void main(String[] args) {
        int number = 21;
        System.out.println(calcAbsValue(number));
    }
}
