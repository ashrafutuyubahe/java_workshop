package Regular_Expression;

import java.util.*;
import java.util.regex.Pattern;

public class CheckRegularEx {

    
    public static void main(String[] a) {
       
   System.out.println(Pattern.matches("[amn]", "abcd"));
   System.out.println(Pattern.matches("[amn]", "a"));
   System.out.println(Pattern.matches("[amn]", "ammmmna"));
   System.out.println(Pattern.matches(".ca", "rca"));
   

     
     
      


    }
}
