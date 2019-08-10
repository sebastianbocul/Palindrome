package mini.palindrome;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeTest {

    private Palindrome palindrome;
    @Before
    public void testSetup() throws Exception{
        palindrome = new Palindrome();
    }


    @Test
    public void isPalindrome1() throws Exception{
        String word = "ala";
        boolean result = palindrome.IfPalindrome(word);
        assertEquals(true,result);
    }

    @Test
    public void isPalindrome2() throws Exception{
        String word = "maooam";
        boolean result = palindrome.IfPalindrome(word);
        assertEquals(true,result);
    }



    @Test
    public void isPalindrome3() throws Exception{
        String word = "madmam";
        boolean result = palindrome.IfPalindrome(word);
        assertEquals(false,result);
    }

    @Test
    public void isPalindrome4() throws Exception{
        String word = "a";
        boolean result = palindrome.IfPalindrome(word);
        assertEquals(true,result);
    }

    @Test
    public void isPalindrome5() throws Exception{
        String word = "aa";
        boolean result = palindrome.IfPalindrome(word);
        assertEquals(true,result);


    }

    @Test
    public void isPalindrome6() throws Exception{
        String word = "";
        boolean result = palindrome.IfPalindrome(word);
        assertEquals(false,result);
    }


}
