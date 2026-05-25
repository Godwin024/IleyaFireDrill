public class CheckisPalindrome{

    public static void main(String[] args){
    
    int [] arrays = {45, 0, 8, 0,45};
    
    System.out.println(isPalindrome(arrays));
    
    
    
    
    }
    public static boolean isPalindrome(int [] arrays){
    
        int firstNumber = 0;
        int lastNumber = arrays.length -1;
        
        while(firstNumber < lastNumber){
            if(arrays[firstNumber] != arrays[lastNumber])
                return false;
                
                firstNumber++;
                lastNumber--;
        }
        return true;
    
    
    }

}
