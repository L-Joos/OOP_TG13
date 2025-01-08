package b6_Algorythms;

import java.rmi.server.ObjID;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class K_Nearest_Neighbor {
    
    public static int k = 5;
    public static ArrayList<Obj> Daten = new ArrayList<>();
    

    public static void main(String[] args) {
        
        //Trainingsdaten    
        Data_init();
        Obj oTD = new Obj(5, 7);
        
        NearestNeighbor(oTD);
        }

        public static void NearestNeighbor(Obj oTD)
        {
            for (int i = 0; i < Daten.size(); i++) {

                Map<Double,Obj> distances = new TreeMap<>();

                distances.put(distance(Daten.get(i),oTD),Daten.get(i));

                System.out.println(distances.keySet());
            }
        }
        
        public static double distance(Obj o, Obj oTD)
        {
            return (oTD.x-o.x)*(oTD.x-o.x)+(oTD.y-o.y)*(oTD.y-o.y);
        }
        
        public static void Data_init()
        {
        Obj o0 = new Obj(10, 10, 1);
        Obj o1 = new Obj(10, 8, 1);
        Obj o2 = new Obj(8, 8, 1);
        Obj o3 = new Obj(10, 5, 1);
        Obj o4 = new Obj(5, 4, 1);
        Obj o5 = new Obj(4, 5, 0);
        Obj o6 = new Obj(0, 5, 0);
        Obj o7 = new Obj(3, 3, 0);
        Obj o8 = new Obj(0, 3, 0);
        Obj o9 = new Obj(0, 0, 0);

        
        Daten.add(o0);
        Daten.add(o1);
        Daten.add(o2);
        Daten.add(o3);
        Daten.add(o4);
        Daten.add(o5);
        Daten.add(o6);
        Daten.add(o7);
        Daten.add(o8);
        Daten.add(o9);
    }
}
