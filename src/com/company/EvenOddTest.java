package com.company;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenOddTest {

    @Test
    void EO() {
        EvenOdd x1= new EvenOdd();
        assertEquals("Even",x1.EO(10));
    }
    @Test
    void EO1() {
        EvenOdd x1= new EvenOdd();
        assertEquals("Even",x1.EO(20));
    }
    @Test
    void EO3() {
        EvenOdd x1= new EvenOdd();
        assertEquals("Odd",x1.EO(5));
    }
    @Test
    void EO4() {
        EvenOdd x1= new EvenOdd();
        assertEquals("Odd",x1.EO(7));
    }
}