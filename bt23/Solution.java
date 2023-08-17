package javab10.bt23;

public class Solution {
    public static void main(String[] args) {
        String string = "heloWord";
        String res = string.replace(string.charAt(0), string.charAt(string.length()-1));
        String fRes = res.replace(res.charAt(res.length()-1), string.charAt(0));
        System.out.println(fRes);
    }
}
