package Enums;

public class CompareEnums {

    enum ValuesToCompare {
        VALUE1,
        VALUE2,
        VALUE3,
        VALUE4
    }

    enum color {
        RED,
        GREEN,
        BLUE
    }

    enum TrafficLight{
        RED("Stop"), 
        GREEN("GO"),
         YELLOW("Get Ready");
         String Meaning;

         private TrafficLight(String meaning){
            this.Meaning=meaning;
         }

         private  String getAction(){
            return   this.Meaning;
         }
    }

    public static void main(String[] a) {
        ValuesToCompare val1 = ValuesToCompare.VALUE1;
        ValuesToCompare val2 = ValuesToCompare.VALUE2;
        ValuesToCompare val3 = ValuesToCompare.VALUE3;
        ValuesToCompare val4 = ValuesToCompare.VALUE4;

        if (val1.compareTo(val4) < 0) {
            System.out.println("the " + val1.name() + " comes before " + val4 + " at ordinal of " + val1.ordinal());
        }

        System.out.println("  my favourite colors are ");

        for (color anycolor : color.values()) {
            System.out.println(anycolor.name());
        }

        System.out.println("get traffic infos");

        for ( TrafficLight light : TrafficLight.values()) {
            System.out.println(light.name() + " mean " + light.getAction());
        }

        

    }
}
