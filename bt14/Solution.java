package javab10.bt14;
public class Solution {
    public static void main(String[] args) {
        String s = "Main.java";
        String[] words = s.split("\\.");
        System.out.println(words[words.length-1]);
    }
}