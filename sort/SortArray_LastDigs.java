package sort;
import java.util.*;

public class SortArray_LastDigs {
    

    public static void main(String []a){

        int[] arraYfNumbers= {52,80,77,43,15};
        int num=32;
        int sumOfDigs=0;
        
        Arrays.sort(arraYfNumbers);
        System.out.println(Arrays.toString(arraYfNumbers));
        
        while(num>0){
            int remainder= num%10;
            sumOfDigs += remainder;
            num= num/10;
           }

           System.out.println("the sum od digd id "+ sumOfDigs);

               
    }
}
