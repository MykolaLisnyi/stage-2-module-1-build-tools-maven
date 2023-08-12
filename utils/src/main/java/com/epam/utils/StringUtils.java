package com.epam.utils;

import static org.apache.commons.lang3.StringUtils.isNumeric;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return isNumeric(str) && str.replace("0", "").length() > 0;
    }
}