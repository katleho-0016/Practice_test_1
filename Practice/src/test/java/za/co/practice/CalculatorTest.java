package za.co.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        int answer = calc.add(1, 2);
        assertEquals(answer, 3);

    }

    void testSubtration(){
        Calculator calc = new Calculator();
        assertEquals(calc.sub(2,1),1);
        assertEquals(calc.sub(2,7),-5);
    }

    void testMultiplication(){
        Calculator calc = new Calculator();
        assertEquals(calc.multiply(2,5),10);

    }

    void testDivision(){
        Calculator calc = new Calculator();
        assertEquals(calc.divide(6,3),2);
    }


}