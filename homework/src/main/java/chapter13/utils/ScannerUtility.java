package chapter13.utils;

import java.util.Scanner;

/**
 * @author 田赛
 * @version 1.0
 */
public class ScannerUtility {
    private static Scanner scanner = new Scanner(System.in);

    private static String readKeyBoard(int limit, boolean blankReturn) {
        //获取输入的字符串
        String line = "";

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();

            if (line.length() == 0) {
                if (blankReturn) return line;
                else continue;
            }

            //如果用户输入的内容大于了 limit，就提示重写输入
            //如果用户如的内容 >0 <= limit ,我就接受
            if (line.length() < 1 || line.length() > limit) {
                System.out.println("输入长度（不能大于" + limit + "）错误，请重新输入：");
                continue;
            }
            break;
        }

        return line;
    }
}
