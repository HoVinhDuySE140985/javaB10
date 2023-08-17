package javab10.bt7;

import java.time.LocalDate;

public class solution {
    public static boolean checkDateOfYear(int date, int month){
        for(int i = 2014;i<=2050;i++){
            if(!LocalDate.of(i, month, date).getDayOfWeek().toString().equals("SUNDAY")){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkDateOfYear(1, 1));
    }
}
