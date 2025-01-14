package Enums;

import java.util.EnumSet;

public class EnumArray {

    enum Days{
         MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY

    }
    

  public static void main(String [] a){

    EnumSet<Days> weekDays=  EnumSet.of(Days.FRIDAY,Days.MONDAY,Days.THURSDAY,Days.TUESDAY,Days.WEDNESDAY);

    System.out.println(weekDays);


  }

}
