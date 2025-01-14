package Enums;

public class SeasonClass {

     enum Season{
          SPRING("no intense hottness"), 
          SUMMER(" intense hottness"),
           AUTUMN("moderate rainfall"),
            WINTER("intense cold & rain");
            
            String desc;
      
      
           private Season( String description){
            this.desc= description;
           }
      
           private String getDescription(){
              return this.desc;
           }
     }


     public static void main(String[] a){

     for(Season ses: Season.values()){
          
          System.out.println("name of season : " + ses.name() + " and there is " + ses.getDescription());
     }
     }
     
}
