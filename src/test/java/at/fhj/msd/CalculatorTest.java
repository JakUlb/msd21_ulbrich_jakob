package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calc = new Calculator();

    @BeforeEach
    public void setup(){
        Calculator calc = new Calculator();
    }

    @Test
    public void testAddPos(){
        int value1=1;
        int value2=419;
        Assertions.assertEquals(420,calc.add(value1,value2));
    }

    @Test
    public void testAddNeg(){
        int value1=-3;
        int value2=17;
        Assertions.assertEquals(14,calc.add(value1,value2));
    }

    @Test
    public void testMinusPos(){
        int value1=10;
        int value2=9;
        Assertions.assertEquals(1,calc.minus(value1,value2));
    }

    @Test
    public void testMinusNeg(){
        int value1=-3;
        int value2=-17;
        Assertions.assertEquals(14,calc.minus(value1,value2));
    }

    @Test
    public void testDivide(){
        int value1=10;
        int value2=5;
        Assertions.assertEquals(2,calc.divide(value1,value2));
    }

    @Test
    public void testDivideZero(){
        int value1=10;
        int value2=0;
        Double value= 1.0/0;
        Assertions.assertEquals(value,calc.divide(value1,value2));
    }

    @Test
    public void testMultiplyPos(){
        int value1=10;
        int value2=30;
        Assertions.assertEquals(300,calc.multiply(value1,value2));
    }

    @Test
    public void testMultiplyNeg(){
        int value1=10;
        int value2=-30;
        Assertions.assertEquals(-300,calc.multiply(value1,value2));
    }

    @Test
    public void testFacultyPos(){
        int value1=5;
        Assertions.assertEquals(120,calc.faculty(value1));
    }

    @Test
    public void testFacultyNeg(){
        int value1=-5;
        Assertions.assertEquals(0,calc.faculty(value1));
    }

    @Test
    public void testFacultyZero(){
        int value1=0;
        Assertions.assertEquals(1,calc.faculty(value1));
    }





}
