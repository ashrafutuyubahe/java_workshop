package sort;

import java.util.*;

public class Teacher  implements Comparable<Teacher> {

    private int teachId;
   String teacherName;

   public Teacher(String teacherName,int teachId){
    this.teachId= teachId;
    this.teacherName= teacherName;
   }

   
   @Override
   public String toString() {
       
       return "teacherId"+ teachId + ", teacher name "+ teacherName;
   }
  

 
   @Override
   public int compareTo(Teacher other) {
      if(this.teachId>other.teachId){
        return 1;
      }

      return -1;
   

   }



  

}
