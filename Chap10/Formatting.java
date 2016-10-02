import java.text.*; // NumberFormat class is in here
import java.util.*; // Locale class here

public class Formatting {
    public static void main(String[] args) {
        /* Currency */
        double b = 53.47698;
        // default format
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String money = formatter.format(b);
        System.out.println("Default currency: " + money);

        Locale cn = Locale.CHINA; // static final variable
        NumberFormat cnFormatter = NumberFormat.getCurrencyInstance(cn);
        String cnMoney = cnFormatter.format(b);
        System.out.println("Chinese currency: " + cnMoney);

        /* Number */
        int intNum = 538927393;
        NumberFormat intFormatter = NumberFormat.getNumberInstance();
        String intNumber = intFormatter.format(intNum); // add commas
        System.out.println("Formatting integer: " + intNumber);

        double doubleNum = 5679082.3456767676;
        // Format for three decimal places
        NumberFormat doubleFormatter = new DecimalFormat("0.###");
        String doubleNumber = doubleFormatter.format(doubleNum);
        System.out.println("Formatting doubles: " + doubleNumber);

        /* Date */
        Date date = new Date(); // current date
        DateFormat dateFormatter = DateFormat.getDateInstance();
        String dateUS = dateFormatter.format(date);
        System.out.println("Formatting U.S. dates: " + dateUS);

        Locale uk = Locale.UK;
        DateFormat UKDateFormatter = DateFormat.getDateInstance(
            DateFormat.DEFAULT, uk);
        String dateUK = UKDateFormatter.format(date);
        System.out.println("Formatting U.K. dates: " + dateUK);

    }
}
