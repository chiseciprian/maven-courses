package ro.itschool.mvnbase.curs18;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Description;

import static org.junit.jupiter.api.Assertions.*;

class Palindrom2IndexTest {
    protected Palindrom palindrom;

    @BeforeEach
    void setup() {
        palindrom = new Palindrom2Index();
    }

    @Test
    @DisplayName("mama is not palindrom")
    public void test1() {
        assertFalse(palindrom.check("mama"));
    }

    @Test
    @Description("ana=ana")
    public void test2() {
        assertTrue(palindrom.check("ana"));
    }

    @Test
    @Description("a is palindrome")
    public void test3() {
        assertTrue(palindrom.check("a"));
    }

    @Test
    @Description(" '' is palindrom ")
    public void test4() {
        assertTrue(palindrom.check(""));
    }

    @Test
    @Description("null is not palindrom")
    public void test5() {
        assertFalse(palindrom.check(null));
    }

}