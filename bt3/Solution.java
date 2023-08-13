import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution{
    public static void main(String[] args) {
        // String pattern = "dd-MM-yyyy";
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        String today = dateFormat.format(new Date());
        System.out.println(today);
        
    }
}