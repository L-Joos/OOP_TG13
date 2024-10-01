package b1_Lists;

public class Array
{
    
    public static void main(String[] args)
    {
        double Messwerte[] = new double[3];
        Messwerte[0] = 1.3;
        Messwerte[1] = 2.1;
        Messwerte[2] = 1.3;        

        for(double mw : Messwerte)
        {    
                System.out.println(mw+" ist im Array");
        }
    }
}