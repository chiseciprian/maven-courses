package ro.itschool.mvnbase.curs17.recursivitate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RevertStringTest {
    @Test
    @DisplayName("ABC=CBA")
    void test(){
        RevertString revertString=new RevertString();
        assertEquals(revertString.revertString("ABC"),"CBA");
    }

    @Test
    @DisplayName("ABC=CBA")
    void testTwo(){
        RevertString revertString=new RevertString();
        assertEquals(revertString.reverStringTwo("ABC"),"CBA");
    }

}