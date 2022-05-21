package at.fhj.msd;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static Logger logger = LogManager.getLogger();

    public Calculator(){

    }

    public double add(double number1,double number2){
        logger.debug("parameters used in add method value1: "+number1+" value2: "+number2);
        return number1+number2;
    }

    public double minus(double number1,double number2){
        logger.debug("parameters used in minus method value1: "+number1+" value2: "+number2);
        return number1-number2;
    }

    public double divide(double number1,double number2) throws ArithmeticException{
        if(number2==0){
            logger.error("invalid parameters used, division by zero not allowed");
            throw new ArithmeticException();
        }
        logger.debug("parameters used in divide method value1: "+number1+" value2: "+number2);
        return number1/number2;
    }

    public double multiply(double number1,double number2){
        logger.debug("parameters used in multiply method value1: "+number1+" value2: "+number2);
        return number1*number2;
    }

    public int faculty(int number){
        int sum=1;
       if(number<0){
           return 0;
       }
       for(int i=number;i>0;i--){
           sum*=i;
       }
        logger.debug("parameter used in faculty method: "+number);
       return sum;
    }
}
