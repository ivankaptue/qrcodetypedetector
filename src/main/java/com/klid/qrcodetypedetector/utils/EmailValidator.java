package com.klid.qrcodetypedetector.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ivan.kaptue
 */
public class EmailValidator {
    private static final String EMAIL_PATTERN = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";

    public static boolean validate(final String email) {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email.trim().toLowerCase());
        return matcher.matches();
    }
}
