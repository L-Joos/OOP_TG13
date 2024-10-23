public class Parkplatz {
    
    String parkplatzNummer;
    String Hinweis;

    public Parkplatz(String parkplatzNummer, String Hinweis)
    {
        this.parkplatzNummer = parkplatzNummer;
        this.Hinweis = Hinweis;
    }

    public String getparkplatzNummer()
    {
        return parkplatzNummer;
    }

    public void setparkplatzNummer(String parkplatzNummer)
    {
        this.parkplatzNummer = parkplatzNummer;
    }

    public String getHinweis()
    {
        return Hinweis;
    }

    public void setHinweis(String Hinweis)
    {
        this.Hinweis = Hinweis;
    }

    @Override
    public String toString() {
        return "Parkplatz [parkplatzNummer=" + parkplatzNummer + ", Hinweis=" + Hinweis + "]";
    }
}
