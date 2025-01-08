package b6_Algorythms;

public class Obj {
    int x;
    int y;
    int type;


    public Obj(int x, int y)
    {
        //Unzugewiesene Daten
        this.x = x;
        this.y = y;
    }

    public Obj(int x, int y, int type)
    {
        //Trainingsdaten erstellen
        this.x = x;
        this.y = y;
        this.type = type;
    }
}
