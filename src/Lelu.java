class Lelu {
    private String nimi;
    private int paino;

    public  Lelu(){
        nimi = "";
        paino = 0;
    }

    public Lelu(String nimi, int paino) {
        this.nimi = nimi;
        this.paino = paino;
    }

    public void tulostaTiedot(){
        System.out.println("Lelun tiedot:");
        System.out.println("Nimi: " + nimi);
        System.out.println("Paino: " + paino);
    }
}
