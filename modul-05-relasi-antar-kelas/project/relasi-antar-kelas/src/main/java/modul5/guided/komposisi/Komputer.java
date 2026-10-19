package modul5.guided.komposisi;

public class Komputer {
    private CPU cpu;
    private Monitor monitor;
    private Mouse mouse;

    // Komposisi: Objek bagian dibuat di dalam konstruktor kelas Komputer
    public Komputer(String merkCpu, int speedCpu, String merkMonitor, String merkMouse, String typeMouse) {
        this.cpu = new CPU(merkCpu, speedCpu);
        this.monitor = new Monitor(merkMonitor);
        this.mouse = new Mouse(merkMouse, typeMouse);
    }

    public void DisplaySpec() {
        cpu.DisplaySpecCPU();
        monitor.DisplaySpecMonitor();
        mouse.DisplaySpecMouse();
    }

    public static void main(String[] args) {
        Komputer myPC = new Komputer("Intel i7", 3, "LG", "Logitech", "Wireless");
        myPC.DisplaySpec();
    }
}