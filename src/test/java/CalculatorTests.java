import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTests {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(5, 5);
    }

    @Test
    public void canAdd(){

        assertEquals(10, calculator.add() );
    }

    @Test
    public void canSubtract(){

        assertEquals(0, calculator.subtract() );
    }

    @Test
    public void canMultiply(){

        assertEquals(25, calculator.multiply() );
    }

    @Test
    public void canDivide(){

        assertEquals(1, calculator.divide() );
    }
}
