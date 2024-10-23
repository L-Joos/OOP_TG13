import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps1 {
    
    public static void main(String[] args) {
        
        Schueler s1 = new Schueler("Joos", "Lukas");
        Schueler s2 = new Schueler("Schacher" , "Dustin");
        Schueler s3 = new Schueler("Kiss","Teofil Lazlo");

        Parkplatz p1 = new Parkplatz("A0c", "Behinderten parkplatz");
        Parkplatz p2 = new Parkplatz("A1a", null);
        Parkplatz p3 = new Parkplatz("B0a","Familien parkplatz");

    Map<Schueler, Parkplatz> Zuweisung = new HashMap<Schueler, Parkplatz>();
    Zuweisung.put(s1,p1);
    Zuweisung.put(s1,p2);
    Zuweisung.put(s2,p3);

    System.out.println("\n----- Parkplatz eines Schuelers ---------");
    try {
        Parkplatz pl1 = Zuweisung.get(s1);
        System.out.println("Der Schüler "+s1.getName()+" hat den Parkplatz "+pl1.getparkplatzNummer());
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println("Der Schüler "+s1.getName()+" hat keinen zugewiesenen Parkplatz");
    }
    try {
        Parkplatz pl2 = Zuweisung.get(s2);
        System.out.println("Der Schüler "+s2.getName()+" hat den Parkplatz "+pl2.getparkplatzNummer());
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println("Der Schüler "+s2.getName()+" hat keinen zugewiesenen Parkplatz");
    }
    try {
        Parkplatz pl3 = Zuweisung.get(s3);
        System.out.println("Der Schüler "+s3.getName()+" hat den Parkplatz "+pl3.getparkplatzNummer());
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println("Der Schüler "+s3.getName()+" hat keinen zugewiesenen Parkplatz");
    }
    }
}
