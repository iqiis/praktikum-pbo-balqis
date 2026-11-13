package modul7;

public class Main {
    public static void main(String[] args) {
        ItemTransaksi.catatLogKasir("Membuka transaksi baru untuk Pelanggan #042.");

        TiketReguler tiket1 = new TiketReguler("Interstellar", 40000, 2, 3);
        TiketVIP tiket2 = new TiketVIP("Dune: Part Two", 60000, 2, 25000);
        PaketSnack snack1 = new PaketSnack("Combo Popcorn Caramel + 2 Soda", 1, 55000);

        ItemTransaksi[] keranjang = { tiket1, tiket2, snack1 };

        System.out.println("=== DAFTAR TRANSAKSI BIOSKOP ===");
        double totalTransaksi = 0;
        for (ItemTransaksi item : keranjang) {
            item.cetakRincianItem();
            totalTransaksi += item.getNominalBayar();
        }
        System.out.println("TOTAL TRANSAKSI : Rp" + totalTransaksi);
        ItemTransaksi.catatLogKasir("Transaksi #042 selesai diproses.");
    }
}