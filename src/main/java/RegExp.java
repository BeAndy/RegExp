import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.List;

/**
 * Created by Andrew on 10/8/2016.
 */


public class RegExp {
    public static String calculateFirst(String test) {
        String pattern = "[*][^*].+[*]";
        String text = test;
        String NewString;
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        int start = 0;
        if (m.matches()) {
            NewString = text.substring(start, m.start()) + "<em>" + text.substring(m.start() + 1, m.end() - 1) + "</em>";
        } else
            NewString = test;
        return NewString;
    }

    public static String calculateSecond(String test) {
        String pattern = "([10]?[0-9]:[0-5][0-9])|([2][0-3]:[0-5][0-9])";
        String text = test;
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        return !m.matches() ? "false" : "true";

    }

    public static String calculateThird(String test) {
        String pattern = "(\\{[0-9 A-F a-f]{8}(-[0-9 A-F a-f]{4}){3}-[0-9 A-F a-f]{12}\\})|" +
                "([0-9 A-F a-f]{8}(-[0-9 A-F a-f]{4}){3}-[0-9 A-F a-f]{12})";
        String text = test;
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        return !m.matches() ? "false" : "true";
    }

    public static String calculateFourth(String test) {
        String pattern = "((((1?[0-9]?[0-9]\\.?)|(2[0-5][0-5])\\.?))|([0-7]{3}[0-7]\\.?)|([0-9A-Fa-f]x[0-9A-Fa-f]{2}\\.?)){3}" +
                "(((1?[0-9]?[0-9])|(2[0-5][0-5]))|([0-7]{3}[0-7])|([0-9A-Fa-f]x[0-9A-Fa-f]{2}))";
        String text = test;
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        return !m.matches() ? "false" : "true";

    }


    public static String calculateFifth(String test) {
        String pattern = "(((http|https)://)?(w{3}\\.)?)?([^-][a-z\\-]+[a-z]+\\.)+[a-z]{2,5}" +
                "(:\\d{4}|((/\\S+))+\\.[a-z]{2,5}((\\?((\\w+=\\S+&)+)?(\\w+=\\S+))|#\\S+)?)?";
        String text = test;
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        return !m.matches() ? "false" : "true";
    }

    public static String calculateSixth(String test) {
        String pattern = "(((([0-2][0-9])|(30))/((0[13-9])|(1[0-2]))|([0-2][0-8]/02])|(31/((0?[13578])|(1[02]))))/[1-9]\\d{3})|" +
                "(29/02/[1-9]\\d{2}[02468])";
        String text = test;
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        return !m.matches() ? "false" : "true";

    }

    public static String calculateSeventh(String test) {
        String pattern = "^#[0-9 a-f A-F]{6}$";
        String text = test;
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        return !m.matches() ? "false" : "true";
    }

    public static String calculateEighth(String test) {
        String pattern = "((\\w+-\\w+)|([\\w']+[@#$%^&*(){};./\\]]?)|(\".+\")|(\\w+--)|(--\\w+)|([\\w']+\\w+-[\\w']+\\w+))";
        String text = test;
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(test);
        List<String> list = new ArrayList<String>();
        while (m.find()) {
            String temp = deleteSymbols(text.substring(m.start(), m.end()));
            list.add(temp);
        }
        String result = new String();
        for (String currentElement : list) {
            result += currentElement + ",";
        }
        result = result.substring(0, result.length() - 1) + ".";
        return result;
    }

    private static String deleteSymbols(String s) {
        String tempString = "";
        boolean doubleWord = false;
        int times = 0;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == '\"') {
                doubleWord = true;
                times++;
                if (times == 2) {
                    doubleWord = false;
                    times = 0;
                }
                continue;
            }
            if (doubleWord) {
                tempString += a;
            }
            if ((a == '-') && (s.charAt(i + 1) == '-')) {
                i++;
                continue;
            }
            if ((a == '\'' || (a == '-') || Character.isLetterOrDigit(a)) && (!doubleWord)) {
                tempString += a;
            }
        }
        return tempString;
    }

    public static String calculateNinth(String test) {
        String pattern = "[_|^\\[\\]a-z]{2,}![a-z]+@[a-z]+(\\.[a-z]+)?" +
                "\\s+PRIVMSG\\s+" +
                "#[a-z]+\\s+" +
                ":.+";
        String text = test;
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        return !m.matches() ? "false" : "true";

    }

}
