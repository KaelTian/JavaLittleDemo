package demo;

public class Main01 {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (String arg : args) {
                System.out.println("current arg is:" + arg);
            }
        }
        System.out.println("Code is ended");
    }
}
