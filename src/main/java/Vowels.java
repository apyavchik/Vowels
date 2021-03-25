import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vowels {
    /*
    Return the number (count) of vowels in the given string.
    We will consider a, e, i, o, u as vowels for this Kata (but not y).
    The input string will only consist of lower case letters and/or spaces.
    */

    public static int getCount(String str) {
        int vowelsCount = 0;
        Pattern p = Pattern.compile("[aAeEiIoOuU]+");

        for (int i = 0; i < str.length(); i++) {
            Matcher matcher = p.matcher(String.valueOf(str.charAt(i)));
            while (matcher.find()) {
                vowelsCount++;
            }
        }

        return vowelsCount;
    }

}