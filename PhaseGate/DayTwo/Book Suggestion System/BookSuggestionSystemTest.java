import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BookSuggestionSystemTest{

    static BookSuggestionSystem suggest = new BookSuggestionSystem(); 

    

    @Test
    public void testThatSuggestionBookIsAccurate(){
    
        String actual = suggest.suggestBook();
        
        String expexted = "Enjoy your reading";
        
        assertEquals(actual,expexted );
    }
    
        

    @Test
    public void testThatGetRandomNumberGetsTheNumberOfBookAtRandom(){
       BookSuggestionSystem.books.add("The Hobbit");
       BookSuggestionSystem.books.add("Animal Farm");
       BookSuggestionSystem.books.add("Things Fall Apart");
    
        String actual = suggest.getRandomBook();
        
        assertTrue(suggest.books.contains(actual));
    }
    
     @Test
     public void testThatGetRandomPageGetsTheNumberOfPageAtRandom(){
        for(int count = 1; count < 101; count++){
            int actual = suggest.getRandomPage();
            assertTrue(actual >= 1 && actual <=100);
            
        }
 
        
      
    }


}
