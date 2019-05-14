package program_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    EvenNumTest e=new EvenNumTest();
    @Test
    public void EvenTest()
    {
        boolean result=e.isEven(20);
        assertEquals(true,result);

        boolean result1=e.isEven(25);
        assertEquals(false,result1);


        boolean result2=e.isEven(-25);
        assertEquals(false,result2);

    }

}