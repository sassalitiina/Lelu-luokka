public class Vieteriauto extends Lelu{

    private int nopeus;

    public Vieteriauto (String nimi, int paino, int nopeus) {
        super(nimi, paino);
        this.nopeus = nopeus;
    }

    public int kiihdyta(){
        nopeus += 1;
        return nopeus;
    }
    @Override
    public void tulostaTiedot(){
        super.tulostaTiedot();
        System.out.println("Nopeus: " + nopeus);
    }
}
