public class Nukke extends Lelu{

    private String hiustenVari;

    public Nukke (String nimi, int paino, String hiustenVari){
        super(nimi,paino);
        this.hiustenVari = hiustenVari;
    }

    public void puhu(){
        System.out.println("Hei! Olen " + nimi + ".");
    }
    @Override
    public void tulostaTiedot(){
        super.tulostaTiedot();
        System.out.println("Hiusten väri: " + hiustenVari);
    }
}
