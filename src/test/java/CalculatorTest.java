import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(3, 2, 6, 2);
    }

    @Test
    public void canAdd(){
        assertEquals(5, calculator.add());
    }

    @Test
    public void canSubtract(){
        assertEquals(1, calculator.subtract());
    }

    @Test
    public void canMultiply(){
        assertEquals(6, calculator.multiply());
    }

    @Test
    public void canDivide(){
        assertEquals(3, calculator.divide(), 0.0);
    }
}
