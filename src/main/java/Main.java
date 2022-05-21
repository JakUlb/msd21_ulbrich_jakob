import at.fhj.msd.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double number1 = 10;
        double number2 = 0;


        calc.add(number1,number2);
        calc.minus(number1,number2);
        logger.info("info logger");
        calc.divide(number1,number2);
        logger.error("error logger");
        calc.multiply(number1,number2);
        calc.faculty(5);
    }
}
