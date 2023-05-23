
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        //Write a regular expression to match a valid email address.

        String emailString = "john.doe@example.com";
        String emailRegex = "^[\\w.%+-]+@[\\w.-]+\\.[A-Za-z]{2,}$";
        boolean emailValid = Pattern.matches(emailRegex, emailString);
        System.out.println("Is the email address valid? " + emailValid);

        //Write a regular expression to match a valid phone number in the format (123)456-7890.

        String phoneString = "(123)456-7890";
        Pattern phoneRegex = Pattern.compile("\\(\\d{3}\\)\\d{3}-?\\d{4}");
        boolean phoneValid = Pattern.matches(String.valueOf(phoneRegex), phoneString);
        System.out.println("Is the phone number valid? " + phoneValid);

        //Write a regular expression to match a valid date in the format MM/DD/YYYY.

        String[] dates = {
                "1/01/2023",
                "01/1/2023",
                "01/01/232",
                "01/01/20023",
                "01/01/2023",
        };

        String strPattern = "^\\d{2}/\\d{2}/\\d{4}$";
        for (String strDate : dates) {
            System.out.println(strDate + " => " + strDate.matches(strPattern));
        }

        //Write a regular expression to match a valid URL.

        String[] urls = {
                "httppps://www.stiegler.org3",
                "htts://ww.stiegler.org3",
                "https://www.stiegler.org"
        };
        String urlPattern = "\\b(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";;
        for(String strUrl : urls) {
            System.out.println(strUrl + " => " + strUrl.matches(urlPattern));
        }

        //Write a regular expression to match a valid credit card number (16 digits, may be separated by dashes or spaces).

        String[] credits = {
                "401288888888198881",
                "4012 8888 8888 1881",
                "4012-8888-8888-1881",
                "4111111111111111"

        };
        String creditPattern = "\\b(?:\\d[ -]*?){13,16}\\b";
        for(String strCredit : credits) {
            System.out.println(strCredit + " => " + strCredit.matches(creditPattern));
        }
        //Write a regular expression to match a valid US zip code (5 digits, may have a dash followed by 4 more digits).

        String[] zips = {
                "28215",
                "2822315",
                "28215-001",
                "28215-0001",};

        String zipRegex = "^\\d{5}(-\\d{4})?$";
        for (String strZip : zips) {
            System.out.println(strZip + " => " + strZip.matches(zipRegex));
        }

        //Write a regular expression to match a valid Java identifier (a sequence of letters, digits, underscores, and dollar signs, not starting with a digit).
        String javaString = "$geeks123";
        String javaRegex = "^([a-zA-Z_$][a-zA-Z\\d_$]*)$";
        boolean javaValid = Pattern.matches(javaRegex, javaString);
        System.out.println("Is the Java Identifier code valid? " + javaValid);

        //Write a regular expression to match a valid hexadecimal color code (starts with a # followed by 6 hexadecimal digits).
        String hexaString = "#5e3205";
        String hexaRegex = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";
        boolean hexaValid = Pattern.matches(hexaRegex, hexaString);
        System.out.println("Is the hexadecimal color code valid? " + hexaValid);

        //Write a regular expression to match a valid time in the 24-hour format (HH:MM).
        String timeString = "12:00";
        String timeRegex = "([01]?[0-9]|2[0-3]):[0-5][0-9]";
        boolean timeValid = Pattern.matches(timeRegex,timeString);
        System.out.println("Is the 24-hour format valid? " + timeValid);
    }
}