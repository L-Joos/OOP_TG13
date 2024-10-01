package b1_Lists;

import java.util.ArrayList;

public class ArrayLists {
    
    public static void main(String[] args) {
         ArrayList<Double> kommaZahlen = new  ArrayList<> ();

         kommaZahlen.add(1.3);
         kommaZahlen.add(2.1);
         kommaZahlen.add(1.8);

         System.out.println("~Total Array:");

         System.out.println(kommaZahlen);

         System.out.println("~Removed Value:");

         kommaZahlen.remove(Double.valueOf(2.1));

         System.out.println(kommaZahlen);

         System.out.println("~Removed Index:");

         kommaZahlen.remove(0);

         System.out.println(kommaZahlen);


        
    }
}
