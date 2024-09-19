package ru.video_02.level_01.lesson_10;

import java.math.BigDecimal;

public class DoubleAccuracyIssues {
    public static void main(String[] args) {

        var a = 2;
        var b = 1.1;
        var c = a - b;
        System.out.println(c);  // в данном примере результат будет равен 0.8999999999999999 математическая неточность

        // для более точной математических расчетов (особенно вычесления денег или расчетов на сайте)
        // применяются BigDecimal

        BigDecimal x = new BigDecimal("2");
        BigDecimal y = new BigDecimal("1.1");
        BigDecimal z = x.subtract(y);
        System.out.println(z);
    }
}
