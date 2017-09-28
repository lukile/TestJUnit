package math;

import static org.junit.Assert.*;
import org.junit.Test;



public class CalculatorTest {
    Calculator op = new Calculator();

    @Test
    public void should_add_two_numbers(){
        Long a = 5L;
        Long  b = 4L;

        Long res = op.add(a, b);

        assertEquals(9L, res.longValue());
    }

    @Test
    public void should_substract_two_numbers(){
        Long a = 9L;
        Long b = 3L;

        Long res = op.substract(a, b);

        assertEquals(6L, res.longValue());
    }

    @Test
    public void should_divide_two_numbers(){
        Long a = 4L;
        Long b = 2L;

        Long res = op.divide(a, b);

        assertEquals(2L, res.longValue());
    }

    @Test
    public void should_multiply_two_numbers(){
        Long a = 3L;
        Long b = 5L;

        Long res = op.multiplicate(a, b);

        assertEquals(15L, res.longValue());
    }

    @Test(expected = ArithmeticException.class)
    public void should_throw_exception_when_division_by_zero(){
        Long a = 5L;
        Long b = 0L;

        op.divide(a, b);
    }

    @Test
    public void testReadSymbol() throws Exception{
        assertEquals((Character) '+', op.readSymbol());
    }

}
