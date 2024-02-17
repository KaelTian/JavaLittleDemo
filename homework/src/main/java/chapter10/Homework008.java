package chapter10;

/**
 * @author 田赛
 * @version 1.0
 */
public class Homework008 {
    public static void main(String[] args) {
        for (Color color : Color.values()) {
            color.show();
        }
    }
}

enum Color implements ShowService {
    RED("255", "0", "0"),
    BLUE("0", "0", "255"),
    BLACK("0", "0", "0"),
    YELLOW("255", "255", "0"),
    GREEN("0", "255", "0");

    private final String redValue;
    private final String greenValue;
    private final String blueValue;

    private Color(String redValue, String greenValue, String blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("(" + redValue + "," + greenValue + "," + blueValue + ")");
    }
}

interface ShowService {
    void show();
}
