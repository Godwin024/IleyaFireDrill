import java.util.Arrays;

public class ReplaceNonPerfectSqur{

    public static void main(String[] args){
    
        int [] arrays = {4,7,9,10,49,6};
        
        int[] result = getReplacedNonSquare(arrays);
   
        System.out.println(Arrays.toString(result));
        
      
    }
    
    public static int[] getReplacedNonSquare(int [] arrays){
    
        int [] result = new int [arrays.length];
    
        for(int count = 0; count < arrays.length; count++){
            int squRoot = (int) Math.sqrt(arrays[count]);
            
            if(squRoot *  squRoot == arrays[count]){
                 result[count] = arrays[count];
            }else {
                result[count] = -1;
            }           
            
        }
        return result;
    }

}
