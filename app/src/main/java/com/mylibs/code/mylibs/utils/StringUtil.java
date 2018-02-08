package com.mylibs.code.mylibs.utils;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by shichengxinag on 2018/2/7.
 */

public class StringUtil {
    /**
     * str 不为null 或 “”
     *
     * @param str
     * @return
     */
    public static boolean isNotNull(String str) {
        return str != null && !str.equals("");
    }

    /**
     * 时间戳转日期
     *
     * @param time
     * @param format
     * @return
     */
    public static String converDate(String time, String format) {
        DateFormat date = new SimpleDateFormat(format);
        date.setTimeZone(java.util.TimeZone.getTimeZone("GMT:8"));
        return date.format(new Date(time));

    }

    /**
     * 金额 转 标准格式 #,###.00
     *
     * @param money
     * @return
     */
    public static String convertMoney(BigDecimal money) {
        if (money == null)
            return "0";
        DecimalFormat format = new DecimalFormat("#,###.00");
        return format.format(money);
    }
}
