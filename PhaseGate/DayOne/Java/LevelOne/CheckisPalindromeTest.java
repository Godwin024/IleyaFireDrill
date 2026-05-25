import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CheckisPalindromeTest{

    @Test
    public void testThatCheckisPalindromeArrayExist(){
    
        int [] arrays = {45,45};
        
        assertTrue(CheckisPalindrome.isPalindrome(arrays));
    
        
    }
    
    
    @Test
    public void testThatCheckisPalindromeArrayIsPalindromic(){
    
        int [] arrays = {45, 0, 8, 0,45};
        
        assertTrue(CheckisPalindrome.isPalindrome(arrays));
   
        
    }


}

