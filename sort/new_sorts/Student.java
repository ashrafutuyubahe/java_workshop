import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

   

    @Override
    public String toString() {
        return "student{ } " + " name= " + name + " age= " + age;

    }
    
    @Override
    public int compareTo(Student otherStudent) {
        if(this.age> otherStudent.age){
            return 1;
        }
        
        return -1;
    }
    
        public static void main(String[] args) {

            List<Integer> nums= new ArrayList<>();
            nums.add(12);
            nums.add(3);
            nums.add(34);


        List<Student> students= new ArrayList<>();

        students.add(new Student(40,"john"));
        students.add(new Student(31,"kali"));
        students.add(new Student(49,"mike"));
        students.add(new Student(12,"derick"));
        System.out.println("before sorting...: ");

        for(Student st:students){
            System.out.println(st);
           }

            
       
        for(int num:nums){
         System.out.println(num);
        }

        Collections.sort(students);
        Collections.sort(nums);
        
        
        System.out.println("after sorting:  ");
        for(Student st:students){
         System.out.println(st);
        }

         
        
        for(int num:nums){
            System.out.println(num);
           }



    
        }
}
