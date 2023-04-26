import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeTest {


    @Test
    public void whenPalindrome_thenReturnTrue() {
        Palindrome p = new Palindrome();
        assertTrue(p.isPalindrome("tattarrattat"));
    }

    @Test
    public void whenPalindrome_thenReturnTrue2() {
        Palindrome p = new Palindrome();
        assertTrue(p.isPalindrome("redivider"));
    }

    
    @Test
    public void whenNotPalindrome_thenReturnFalse(){
    	Palindrome p = new Palindrome();
    	assertFalse(p.isPalindrome("sesquipedelian"));
    }
    
    @Test
    public void whenNearPalindrom_thenReturnFalse(){
    	Palindrome p = new Palindrome();
    	assertFalse(p.isPalindrome("bevel"));
    }
}
