import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class stream  {
 
   public static void main (String[] args) throws IOException{
    FileOutputStream targetFIle=null;
     FileInputStream sourceFile=null;


    try{
      targetFIle = new FileOutputStream("/home/ashrafu/Projects/jav_CLass_demos/target.txt");
      sourceFile= new FileInputStream("/home/ashrafu/Projects/jav_CLass_demos/source.txt");
       int content;
      while((content=sourceFile.read())!=-1){
      System.out.println(content);
        targetFIle.write((byte)content);
      }
    } finally{

        targetFIle.close();
        sourceFile.close();


    }
   }
}
