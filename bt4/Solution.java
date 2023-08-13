package javab10.bt4;

public class Solution {
    public static double calcAcreage(int a, int b, int c){
        if(a + b > c || a + c > b || b + c > a){
            int p = (a+b+c)/2;
            double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            return s;
        }
        return 0;
    }
    public static void main(String[] args) {
        int a = 5; 
        int b = 6; 
        int c = 7;
        System.out.println(calcAcreage(a,b,c));
    }
}
