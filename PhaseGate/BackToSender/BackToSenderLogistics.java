import java.util.Scanner;
public class BackToSenderLogistics{

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("            Back To Sender Logistics Services.");
    
    System.out.println("""
    
        Collection Rate     Amount Per Percel   Base Pay
        Less than 50%                   160       5,000
        50-59%                          200       5,000
        60-69%                          250       5,000
        >= 70%                          500       5,000
       
    """);
    
    System.out.println("Enter your collection rate");
    int userInput = input.nextInt();
    
     if(userInput < 0 || userInput > 100){
        System.out.println("invalid input. Collecetion rate must be between  0 and 100");
    }  
    else if(userInput < 50){
        System.out.println("Your daily wage is:  " + getRiderWagesPerDayFirstStage(userInput));
    }
    else if(userInput <= 59){
        System.out.println("Your daily wage is: " + getRiderWagesPerDaySecondStage(userInput));
        
    }
    else if(userInput <= 69){
        System.out.println("Your daily wage is: " + getRiderWagesPerDayThirdStage(userInput));
        
    }
    else if(userInput >= 70){
        System.out.println("Your daily wage is: " + getRiderWagesPerDayFourthStage(userInput));
            }
   
      
      
    }
    
   public static int  getRiderWagesPerDayFirstStage(int firstStageRate){
   
    int riderWages = 0;
    
    if(firstStageRate < 50){
        riderWages = firstStageRate * 160 + 5000;
        
         }
    return riderWages;
   
   }
   
   public static int getRiderWagesPerDaySecondStage(int secondStageRate){
   
     int riderWagesSecondStage = 0;
   
    if(secondStageRate <= 59){
        riderWagesSecondStage = secondStageRate * 200 + 5000;
    
         }
         return riderWagesSecondStage;
   
   }
   
   public static int getRiderWagesPerDayThirdStage(int thirdStageRate){
    
    int riderWagesThirdStage = 0;
    
    if(thirdStageRate <= 69){
        riderWagesThirdStage = thirdStageRate * 250 + 5000;
          
         }
         return riderWagesThirdStage;
   }
   
   public static int getRiderWagesPerDayFourthStage(int fourthStageRate){
    
    int riderWagesFourthStage = 0;
    
    if(fourthStageRate >= 70 ){
        riderWagesFourthStage = fourthStageRate * 500 + 5000;
        
         }
         return riderWagesFourthStage;
   }


}
