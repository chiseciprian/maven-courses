package ro.itschool.mvnbase.curs18;

import org.junit.jupiter.api.BeforeEach;

class Palindrom1IndexTest extends Palindrom2IndexTest {
    @Override
    @BeforeEach
    void setup() {
        palindrom = new Palindrom1Index();
    }
}