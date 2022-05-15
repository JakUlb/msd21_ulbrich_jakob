import at.fhj.msd.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double number1 = 10;
        double number2 = 0;

        calc.add(number1,number2);
        calc.minus(number1,number2);
        calc.divide(number1,number2);
        calc.multiply(number1,number2);
    }
}
