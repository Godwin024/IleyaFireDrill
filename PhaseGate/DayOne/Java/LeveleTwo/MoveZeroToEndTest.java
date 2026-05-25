import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoveZeroToEndTest{

    @Test
    public void testThatZeroMovedToEndArray(){
    
        int [] arrays = {5, 0, 3, 0, 2, 0};
        int [] expected = {5, 3, 2, 0, 0, 0};
        
        int [] actual = MoveZeroToEnd.getZeromovedToEnd(arrays);
        assertArrayEquals(expected, actual);
    }


}
