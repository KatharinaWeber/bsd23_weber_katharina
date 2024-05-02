package at.campus02.bsd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calc;
    @BeforeEach
    void setup(){
        calc = new Calculator();
    }

    @Test
    void testAdd1(){
        assertEquals(8, calc.add(5,3));
    }
    @Test
    void testAdd2(){
        assertEquals(-5, calc.add(-2,-3));
    }
    @Test
    void testAdd3(){
        assertEquals(1, calc.add(-2,3));
    }

    @Test
    void testMinus1(){
        assertEquals(2, calc.minus(5,3));
    }
    @Test
    void testMinus2(){
        assertEquals(1, calc.minus(-2,-3));
    }
    @Test
    void testMinus3(){
        assertEquals(-1, calc.minus(2,3));
    }

    @Test
    void testMultiply1(){
        assertEquals(15, calc.multiply(5,3));
    }
    @Test
    void testMultiply2(){
        assertEquals(6, calc.multiply(-2,-3));
    }
    @Test
    void testMultiply3(){
        assertEquals(-6, calc.multiply(-2,3));
    }

    @Test
    void testDivide1(){
        assertEquals(1.66666666, calc.divide(5,3), 0.00001);
    }
    @Test
    void testDivide2(){
        assertEquals(3, calc.divide(-15,-5));
    }
    @Test
    void testDivide3(){
        assertEquals(-4, calc.divide(16,-4));
    }

    @Test
    void testFactorial1(){
        assertEquals(0, calc.factorial(-5));
    }
    @Test
    void testFactorial2(){
        assertEquals(1, calc.factorial(1));
    }
    @Test
    void testFactorial3(){
        assertEquals(120, calc.factorial(5));
    }

}
