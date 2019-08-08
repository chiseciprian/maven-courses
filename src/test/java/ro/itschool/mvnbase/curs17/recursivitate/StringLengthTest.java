package ro.itschool.mvnbase.curs17.recursivitate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringLengthTest {
    @Test
    @DisplayName("ABC result is 3")
    void test(){
        StringLength  stringLenght=new StringLength();
        assertEquals(stringLenght.stringLenght("ABC"),3);
    }

}