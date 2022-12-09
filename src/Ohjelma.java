public class Ohjelma {
    public static void main(String[] args) {
        Lelu lelu1 = new Lelu("nalle", 200);
        lelu1.tulostaTiedot();

        Vieteriauto auto1 = new Vieteriauto("Auto1", 200, 50);
        auto1.tulostaTiedot();

        Nukke nukke1 = new Nukke("Barbie", 100, "vaalea");
        nukke1.tulostaTiedot();
        nukke1.puhu();

    }
}
