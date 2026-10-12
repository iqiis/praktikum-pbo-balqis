package modul4.guided.guided2.main;

import modul4.guided.guided2.hargatoken.hargaToken;
import modul4.guided.guided2.hargapulsa.hargaPulsa;

public class Main {
    public static void main(String[] args) {
        hargaToken objectToken = new hargaToken();
        objectToken.info();

        hargaPulsa objectPulsa = new hargaPulsa();
        objectPulsa.info();
    }
}