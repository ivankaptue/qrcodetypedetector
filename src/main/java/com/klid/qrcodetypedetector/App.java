package com.klid.qrcodetypedetector;

public class App {
    private static void separator() {
        System.out.println("\n");
    }

    public static void main(String[] args) {
        System.out.println("QRCodeTypeDetector");
        QRCodeTypeDetector.detect("WIFI:T:WPA;S:mynetwork;P:mypass;;");
        QRCodeTypeDetector.detect("WIFI:S:\"foo\\;bar\\\\baz\\\";;");

        separator();

        QRCodeTypeDetector.detect("http://residence-siso.com/");
        QRCodeTypeDetector.detect("https://google.com/m");
        QRCodeTypeDetector.detect("https://www.toltec-consulting.com/index.php/fr/");
        QRCodeTypeDetector.detect("www.toltec-consulting.com/index.php/fr/");

        separator();

        QRCodeTypeDetector.detect("someone@yoursite.com");
        QRCodeTypeDetector.detect("mailto:someone@yoursite.com");
        QRCodeTypeDetector.detect("mailto:someone@yoursite.com?subject=Mail%20from%20Our%20Site");
        QRCodeTypeDetector.detect("mailto:someone@yoursite.com?cc=someoneelse@theirsite.com,another@thatsite.com,me@mysite.com&bcc=lastperson@theirsite.com&subject=Big%20News");
        QRCodeTypeDetector.detect("mailto:someone@yoursite.com?cc=someoneelse@theirsite.com,another@thatsite.com,me@mysite.com&bcc=lastperson@theirsite.com&subject=Big%20News&body=Body%20goes%20here.");

        separator();

        QRCodeTypeDetector.detect("tel:+12125551212");
        QRCodeTypeDetector.detect("tel:+1-212-555-1212");

        separator();

        QRCodeTypeDetector.detect("sms:+18005551212");
        QRCodeTypeDetector.detect("sms:+18005551212:This%20is%20my%20text%20message.");

        separator();

        QRCodeTypeDetector.detect("geo:40.71872,-73.98905,100");
    }
}
