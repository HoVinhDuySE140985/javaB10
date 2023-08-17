package javab10.bt9;

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        LocalDate currDate = LocalDate.now();
        System.out.println(LocalDate.of(currDate.getYear(), 12, 25).getDayOfYear() - currDate.getDayOfYear());
    }
}
