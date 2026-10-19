package modul5.unguided;

public class Pesanan {
    private int nomorMeja;
    private ItemPesanan[] daftarItem; 
    private int jumlahItem;

    public Pesanan(int nomorMeja, int kapasitas) {
        this.nomorMeja = nomorMeja;
        this.daftarItem = new ItemPesanan[kapasitas];
        this.jumlahItem = 0;
    }

    public void tambahItem(ItemPesanan item) {
        if (this.jumlahItem < this.daftarItem.length) {
            this.daftarItem[this.jumlahItem] = item;
            this.jumlahItem++;
        } else {
            System.out.println("Kapasitas pesanan sudah penuh!");
        }
    }

    public void tampilkanPesanan() {
        System.out.println("DAFTAR PESANAN CAFE");
        System.out.println("Nomor Meja: " + this.nomorMeja);
        for (int i = 0; i < this.jumlahItem; i++) {
            ItemPesanan item = this.daftarItem[i];
            double totalPerItem = item.getRincian().getHargaTotal();
            double hargaDasar = item.getRincian().getHargaDasar();
            double pajak = item.getRincian().getPajak();

            System.out.println((i + 1) + ". " + item.getNamaItem() + " Rp " + totalPerItem
                    + " (Harga: " + hargaDasar + ", Pajak: " + pajak + ")");
        }
    }

    public int getNomorMeja() {
        return this.nomorMeja;
    }

    public ItemPesanan[] getDaftarItem() {
        return this.daftarItem;
    }

    public int getJumlahItem() {
        return this.jumlahItem;
    }
}