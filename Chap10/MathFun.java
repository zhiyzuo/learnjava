import java.util.*;
import java.text.*;

class MathFun {
    static char nullChar;

    public static void main (String[] args) {
        int start =1234567;
        Integer iWrap = new Integer(start);
        System.out.println("Integer (iWrap) = " + iWrap);

        String iBinary = Integer.toBinaryString(start);
        System.out.println("binary = ");
        System.out.println(" " + iBinary);

        Locale loc = Locale.UK;
        NumberFormat f = NumberFormat.getCurrencyInstance(loc);
        f.setMaximumFractionDigits(0);
        String ukMoney = f.format(iWrap.intValue());
        System.out.println("UK money = " + ukMoney);

        String generic = ukMoney.substring(1, 10);
        System.out.println("generic = " + generic);

        String finish = generic.replace(',', nullChar);
        System.out.println("finish = " + finish);
    }
}

