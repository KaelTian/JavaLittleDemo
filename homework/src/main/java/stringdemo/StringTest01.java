package stringdemo;

/**
 * @author 田赛
 * @version 1.0
 */
public class StringTest01 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());
        System.out.println(sb);
        try {
            StringBuffer sb1 = new StringBuffer(sb);
            System.out.println(sb1);
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
    }
}
