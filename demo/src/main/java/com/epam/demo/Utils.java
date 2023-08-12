package com.epam.demo;

import java.util.List;

import static com.epam.utils.StringUtils.isPositiveNumber;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        if (args == null || args.isEmpty()) {
            return false;
        }

        for (String number : args) {
            if (!isPositiveNumber(number)) {
                return false;
            }
        }

        return true;
    }
}