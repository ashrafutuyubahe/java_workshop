import java.util.*;



public class customComparator   implements Comparator<Student> {
    
    

    @Override
    public int compare(Student st1, Student std2) {
      
      if(st1.getAge()>std2.getAge()){
        return 1;
      }

    return -1;
    }


    
}
