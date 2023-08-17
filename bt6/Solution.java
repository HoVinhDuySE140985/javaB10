package javab10.bt6;

import java.time.LocalDate;

public class Solution {
    public static Boolean checkYaer(int year){

        return LocalDate.of(year,12,31).getDayOfYear() > 365?true: false;
    }
    public static void main(String[] args) {
        int year = 2004;
        System.out.println(checkYaer(year));
    }
}
