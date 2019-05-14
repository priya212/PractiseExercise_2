package program_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfTest {
PowerOf obj=new PowerOf();
    @Test
public void testPower(){

    int result=obj.TestPowerOf(16);
    assertEquals(1,result);

    int result1=obj.TestPowerOf(20);
    assertEquals(0,result1);
}
}