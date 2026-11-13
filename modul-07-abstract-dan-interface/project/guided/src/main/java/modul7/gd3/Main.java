package modul7.gd3;

public class Main {
    public static void main(String[] args) {
        Payable.logTransaction("Sistem pembayaran diinisiasi.");
        
        Payable[] items = new Payable[2];
        items[0] = new Invoice("Susu", 1, 25000);
        items[1] = new SalariedEmployee("Balqis", 10000000);
        
        for (Payable item : items) {
            item.printReceipt();
        
        }
        
        Payable.logTransaction("Transaksi selesai diproses.");
    }
}
