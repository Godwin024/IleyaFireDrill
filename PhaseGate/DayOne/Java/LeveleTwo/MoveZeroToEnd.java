import java.util.Arrays;
public class MoveZeroToEnd{

    public static void main(String[] args){
    
        int [] arrays = {5, 0, 3, 0, 2, 0};
        
        int[] result = getZeromovedToEnd(arrays);

        System.out.println(Arrays.toString(result));
    
        
    
    }
    public static int [] getZeromovedToEnd(int []  arrays){
    
        int [] result = new int [arrays.length];
        int temp = 0;
        
        for(int element : arrays){
            if(element != 0){
                result[temp] = element;
                temp++;
            }
        }
        return result;
        
            
        }

}
