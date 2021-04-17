package utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.logging.Logger;

/**
 * @author nguyenlm Contains helper functions
 */
public class Utils {

    public static final String DECIMAL_FORMAT_NUMBER = "%02x";
    public static final int HEXA_LENGTH_VALUE = 0xff;

    public static DateFormat DATE_FORMATTER = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private static Logger LOGGER = getLogger(Utils.class.getName());

    static {
        System.setProperty("java.util.logging.SimpleFormatter.format", "[%4$-4s] [%1$tF %1$tT] [%2$-7s] %5$s %n");
    }

    //data coupling
    public static Logger getLogger(String className) {
        return Logger.getLogger(className);
    }

    public static int PHONE_NUMBER_LENGTH = 10;
    public static int SIZE_OF_HOME_ITEM = 3;
}