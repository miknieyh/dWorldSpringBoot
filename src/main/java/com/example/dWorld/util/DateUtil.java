package com.example.dWorld.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static String date2String(Date date, String format) {
        return new SimpleDateFormat(format).format(date);
    }

    public static String date2yyyyMMddHHmmss(Date date) {
        return date2String(date, "yyyy-MM-dd HH:mm:ss");
    }

    public static String date2yyyyMMdd(Date date) {
        return date2String(date, "yyyy-MM-dd");
    }

    public static Date String2Date(String str, String format) throws ParseException {
        return new SimpleDateFormat(format).parse(str);
    }

    public static Date yyyyMMddHHmmss2Date(String str) throws ParseException {
        return String2Date(str, "yyyy-MM-dd HH:mm:ss");
    }

}
