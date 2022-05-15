package at.fhj.msd;

public class Calculator {

    public Calculator(){

    }

    public double add(double number1,double number2){
        return number1+number2;
    }

    public double minus(double number1,double number2){
        return number1-number2;
    }

    public double divide(double number1,double number2){
        return number1/number2;
    }

    public double multiply(double number1,double number2){
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
       return sum;
    }
}
