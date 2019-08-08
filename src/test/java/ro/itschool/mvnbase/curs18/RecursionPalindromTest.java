package ro.itschool.mvnbase.curs18;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class RecursionPalindromTest extends Palindrom2IndexTest {
    @Override
    @BeforeEach
    void setup() {
        palindrom = new RecursionPalindrom();
    }
}