import java.math.BigDecimal;
import java.math.*;
import java.sql.SQLOutput;


public class Main {
    public static void main(String[] args) {

        BigDecimal bd = new BigDecimal("4.2545");

        //Task One output
        System.out.println("Task one:  "+roundToNearestHundredth(bd));

        //Task Two output
        System.out.println("Task two:  "+ReverseSignRound(bd));
    }
    //Task one
    public static double roundToNearestHundredth (BigDecimal bd) {
        double bdValue = bd.doubleValue();
        double y = Math.round(bdValue * 100.0) / 100.0;
        return y;
    }
    //Task Two
    public static BigDecimal ReverseSignRound (BigDecimal bd){
        MathContext mc = new MathContext(2);
        return bd.negate(mc);
    }
}