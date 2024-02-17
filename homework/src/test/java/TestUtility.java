import houserent.utils.Utility;
import org.junit.Test;

public class TestUtility {
    @Test
    public void testUtility() throws Exception {
        //输入一个字符串,长度最大为3
        String s = Utility.readString(3);
        System.out.println("s=" + s);
    }

    public static void main(String[] args) {
//        //输入一个字符串,长度最大为3
//        String s = Utility.readString(3);
//        System.out.println("s=" + s);

        //输入字符串,最大长度是10,如果直接回车,就给一个默认值
        String testS = Utility.readString(10, "田赛");
        System.out.println("testS=" + testS);
    }
}
