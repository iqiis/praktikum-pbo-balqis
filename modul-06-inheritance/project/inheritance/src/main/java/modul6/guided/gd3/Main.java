package modul6.guided.gd3;

public class Main {
    public static void main(String[] args) {
        Lagu d, e;
        d = new Lagu();
        e = new Lagu();

        d.IsiParam("Mouth of Flame");
        e.IsiParam("Starry Eyes", "The Weekend");

        d.tampilkan();
        e.tampilkan();
    }
}
