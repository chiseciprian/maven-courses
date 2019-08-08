package ro.itschool.mvnbase.curs17.recursivitate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowTest {
    @Test
    @DisplayName("2^3=8")
    void test() {
        Pow pow = new Pow();
        assertEquals(pow.pow(2, 3), 8);
    }

    @Test
    @DisplayName("When pow with 0 RETURN 1")
    void testWithZero() {
        Pow pow = new Pow();
        assertEquals(pow.pow(2, 0), 1);
    }

    @Test
    @DisplayName("WHEN pow with 1 RETURN number")
    void testWithOne() {
        Pow pow = new Pow();
        assertEquals(pow.pow(2, 1), 2);
    }




}