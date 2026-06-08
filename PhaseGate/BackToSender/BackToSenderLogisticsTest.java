import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BackToSenderLogisticsTest{


    @Test
    public void testThatGetRiderWagesPerDayFirstStageIsLessThanFifty(){
    int firstStageRate = 25;
    int actual = BackToSenderLogistics.getRiderWagesPerDayFirstStage(firstStageRate);
    int expected = 9000;
    assertEquals(expected,actual );
    }
    
    @Test
    public void testThatGetRiderWagesPerDaySecondStageIsAccurate(){
    int secondStageRate = 55;
    int actual = BackToSenderLogistics.getRiderWagesPerDaySecondStage(secondStageRate);
    int expected = 16000;
    assertEquals(expected, actual);
    }
    
    @Test
    public void testThatgetRiderWagesPerDayThirdStageIsAccurate(){
    int thirdStageRate = 69;
    int actual = BackToSenderLogistics.getRiderWagesPerDayThirdStage(thirdStageRate);
    int expected = 22250;
    assertEquals (expected,actual );
    }
    
    @Test
    public void testThatGetRiderWagesPerDayFourthStageIsAccurate(){
    int fourthStageRate = 80;
    int actual = BackToSenderLogistics.getRiderWagesPerDayFourthStage(fourthStageRate);
    int expected = 45000;
    assertEquals(expected,actual );
    }


}

