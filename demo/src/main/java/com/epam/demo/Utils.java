package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

import static com.epam.utils.StringUtils.isPositiveNumber;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        if (args == null || args.isEmpty()) {
            return false;
        }

        return args.stream().allMatch(StringUtils::isPositiveNumber);
    }
}