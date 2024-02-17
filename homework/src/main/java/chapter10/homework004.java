package chapter10;

import javafx.scene.control.Cell;

/**
 * @author 田赛
 * @version 1.0
 */
public class homework004 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork();
    }
}

interface CalculatorService {
    void Calculate();
}

class Cellphone {
    private Calculator calculator = new Calculator();

    public void testWork() {
        calculator.Calculate();
    }

    class Calculator implements CalculatorService {

        @Override
        public void Calculate() {
            System.out.println("我是科学计数法计算器我在计算");
        }
    }
}
