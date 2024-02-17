package chapter13;

/**
 * @author 田赛
 * @version 1.0
 */
public class Homework01 {

    public static void main(String[] args) {
        String str1 = "abcdefg";
        String replacedStr1 = reverse(str1, 2, 6);
        String replacedStr2 = reverse(str1, 1, 7);
        String replacedStr3 = reverse(str1, 3, 4);
        String replacedStr4 = reverse(str1, 3, 3);
        String replacedStr5 = reverse(str1, 0, 3);
        String replacedStr6 = reverse(str1, 1, 8);
    }

    public static String reverse(String str, int start, int end) {
        if (str == null || str.isEmpty()) return "";
        int maxLength = str.length();
        int leftIndex = (start < end ? start : end) - 1;
        int rightIndex = (start < end ? end : start) - 1;
        if (leftIndex < 0 || rightIndex > maxLength - 1) return "替换的区间不合理,请重新设置!";
        StringBuffer sb = new StringBuffer();
        if (leftIndex > 0) {
            sb.append(str.substring(0, leftIndex));
        }
        sb.append(new StringBuffer(str.substring(leftIndex, rightIndex + 1)).reverse());
        if (rightIndex + 1 < maxLength) {
            sb.append(str.substring(rightIndex + 1, maxLength));
        }
        return sb.toString();
    }
}
