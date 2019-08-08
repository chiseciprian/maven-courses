package ro.itschool.mvnbase.curs17.recursivitate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumNTest {
    @Test
    @DisplayName("Sum of first 3 number")
    void test(){
        SumN sumN=new SumN();
        assertEquals(sumN.sum(3),6);
    }

    @Test
    @DisplayName("When sum 0 return 0")
    void testWithZero(){
        SumN sumN=new SumN();
        assertEquals(sumN.sum(0),0);
    }
}