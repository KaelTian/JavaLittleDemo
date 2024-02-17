package exceptiondemo;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author 田赛
 * @version 1.0
 */
public class Exception01 {
    public static void main(String[] args) {
        {
            try {
                //空指针异常
                String name = null;
                System.out.println(name.length());
            } catch (NullPointerException ex) {
                System.out.println(ex.getMessage());
            }
        }
        {
            try {
                //数字运算异常
                String name = "田卡";
                int num = Integer.parseInt(name);
                System.out.println(num);
            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
            }
        }
        {
            try {
                FileInputStream fis;
                fis = new FileInputStream("d:\\aa.jpg");
                int len;
                while ((len = fis.read()) != -1) {
                    System.out.println(len);
                }
                fis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
