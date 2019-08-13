package com.klid.qrcodetypedetector;

import com.klid.qrcodetypedetector.utils.EmailValidator;
import org.jetbrains.annotations.NotNull;

/**
 * @author ivan.kaptue
 */
public class QRCodeTypeDetector {

    public static void detect(@NotNull String value) {
        String lowerCase = value.toLowerCase();
        if (lowerCase.toLowerCase().startsWith("wifi:")) {
            System.out.println("WIFI");
        } else if (lowerCase.startsWith("https://") ||
            lowerCase.startsWith("http://") ||
            lowerCase.startsWith("www.")
        ) {
            System.out.println("URL");
        } else if (EmailValidator.validate(lowerCase) ||
            lowerCase.startsWith("mailto:")) {
            System.out.println("EMAIL");
        } else if (lowerCase.startsWith("tel:")) {
            System.out.println("TEL");
        } else if (lowerCase.startsWith("sms:") || lowerCase.startsWith("smsto:")) {
            System.out.println("SMS");
        } else if (lowerCase.startsWith("geo:")) {
            System.out.println("GEO");
        }
    }

}
