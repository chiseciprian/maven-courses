package ro.itschool.mvnbase.curs5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTDDTest {

    @Test
    @DisplayName("WHEN adding two zero THEN zero is returned")
    void addingZeroReturnsZero(){
        //SETUP
        CalculatorTDD calculator=new CalculatorTDD();

        //RUN
        int result = calculator.add(0,0);

        //ASSERT
        assertTrue(result==0);

    }

    @Test
    @DisplayName("WHEN adding two positive numbers THEN their sum is returned")
    void addingTwoPositiveReturnsSum(){
        //SETUP
        CalculatorTDD calculator=new CalculatorTDD();

        //RUN
        int result = calculator.add(4, 5);

        //ASSERT
        assertEquals(9,result);

    }

    @Test
    @DisplayName("WHEN multimple with zero THEN zero is returned")
    void multipleTwoPositiveReturnsPro(){
        //SETUP
        CalculatorTDD calculator = new CalculatorTDD();

        //RUN
        int result = calculator.multiple(2,0);

        //ASSERT
        assertEquals(0,result);
    }

    @Test
    @DisplayName("When divided with one THEN number wich is divided is returned")
    void dividedTwoNumberWithOne(){
        //SETUP
        CalculatorTDD calculator= new CalculatorTDD();

        //RUN
        int result= calculator.divide(4,1);

        //ASSERT
        assertEquals(4,result);
    }

    @Test
    @DisplayName("WHEN dividing 0 is divided THEN return zero")
    void divisionByZero(){
        //SETUP
        CalculatorTDD calculator = new CalculatorTDD();

        //RUN
        int result= calculator.divide(5,0);

        //ASSERT
        assertEquals(0,result);
    }
}