package ro.itschool.mvnbase.curs17.recursivitate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    @DisplayName("number=6")
    void test() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(fibonacci.fibonacci(20), 6765);
    }

    @Test
    @DisplayName("number=0")
    void testWithZero() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(fibonacci.fibonacci(0), 0);
    }

    @Test
    @DisplayName("number=1")
    void testWithOne() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(fibonacci.fibonacci(1), 1);
    }

}