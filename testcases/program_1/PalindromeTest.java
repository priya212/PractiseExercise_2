package program_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome obj=new Palindrome();
@Test
    public void palindromTest(){
        String result=obj.TestPalindrome("12321");
        assertEquals(" is a palindrome",result);

        String result1=obj.TestPalindrome("12343");
        assertEquals(" is a not palindrome",result1);

        String result2=obj.TestPalindrome("nayan");
        assertEquals(" is a palindrome",result2);

        String result3=obj.TestPalindrome("pune");
        assertEquals(" is a not palindrome",result3);
    }

}