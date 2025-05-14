package za.co.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void square() {
        /*
        Write tests for this
         */
    }

    @Test
    void triangle() {
        Shape s = new Shape();
        s.Triangle(5);
        assertEquals(s,
    """
            *
            * *
            * * *
            * * * *
            * * * * *
            """);
    }

    @Test
    void rectangle() {
    /*
    Write test for this
     */
    }
}