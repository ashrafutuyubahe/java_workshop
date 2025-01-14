package sort;
import java.util.*;


public class comparator implements Comparator<Teacher>{

    @Override  
    public int compare(Teacher t1,Teacher t2){
        // if(t1.teacherName.equals(t2.teacherName)){
        //     return 1;
        // } else{
        //     return -1;
        // }

        return t1.teacherName.compareTo(t2.teacherName);

    }
}
