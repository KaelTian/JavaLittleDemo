package stringdemo;

import java.util.Scanner;

/**
 * @author 田赛
 * @version 1.0
 */
public class StringBufferTest01 {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        builder.append("11111");
        builder.append("22222");
        Scanner scanner = new Scanner(System.in);
//        System.out.println("输入商品名:");
//        String name = scanner.next();
        System.out.println("输入价格:");
        String priceStr = scanner.next();
        System.out.println("输出价格: " + getPrice(priceStr));
    }

    static String getPrice(String priceStr) {
        if (priceStr.isEmpty()) return "0.00";
        int decimalPointIndex = priceStr.lastIndexOf('.');
        if (decimalPointIndex > 0) {
            String integerValue = priceStr.substring(0, decimalPointIndex);
            String decimalPointStr = priceStr.substring(decimalPointIndex + 1, priceStr.length());
            if (!isNumeric(integerValue) || !isNumeric(decimalPointStr))
                return getInvalidPriceStr();
            return getIntegerValue(integerValue) + "." + (isZeroStr(decimalPointStr) ? "0" : decimalPointStr);
        } else if (decimalPointIndex == 0) {
            return getInvalidPriceStr();
        } else {
            if (!isNumeric(priceStr)) {
                return getInvalidPriceStr();
            }
            return getIntegerValue(priceStr);
        }
    }

    static boolean isNumeric(String s) {
        if (s != null && !"".equals(s.trim()))
            return s.matches("^[0-9]*$");
        else
            return false;
    }

    static String getInvalidPriceStr() {
        return "请输入合理的数字价格!";
    }

    static boolean isZeroStr(String s) {
        if (s.isEmpty()) return true;
        for (char c : s.toCharArray()) {
            if (c != '0') return false;
        }
        return true;
    }

    static String getIntegerValue(String valueStr) {
        if (isZeroStr(valueStr)) return "0";
        StringBuffer reverseStrBuffer = (new StringBuffer(valueStr)).reverse();
        StringBuffer priceStrBuffer = new StringBuffer();
        for (int i = 1; i < reverseStrBuffer.length() + 1; i++) {
            priceStrBuffer.append(reverseStrBuffer.charAt(i - 1));
            if (i % 3 == 0) priceStrBuffer.append(',');
        }
        String strValue = priceStrBuffer.reverse().toString();
        if (strValue.startsWith(",")) {
            strValue = strValue.substring(1);
        }
        return strValue;
    }
}
