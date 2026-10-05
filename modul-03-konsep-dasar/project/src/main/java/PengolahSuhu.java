public class PengolahSuhu {
    // Instance field (milik masing-masing object)
    private double[] suhuHarian;

    // Class field (milik class, dipakai bersama dan tidak bisa diubah)
    public static final double NILAI_KOSONG = -1.0;

    // Constructor dengan nama parameter sama dengan field
    public PengolahSuhu(double[] suhuHarian) {
        this.suhuHarian = suhuHarian;
    }

    // Method 1 Menampilkan seluruh data
    public void tampilkanData() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                System.out.println("Hari " + (i + 1) + " : (kosong)");
            } else {
                System.out.printf("Hari %d : %.1f°C\n", (i + 1), suhuHarian[i]);
            }
        }
    }

    // Method 2 Mencari index hari yang kosong
    public int cariIndexKosong() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                return i; // Kembalikan index jika ditemukan
            }
        }
        return -1; // Kembalikan -1 jika tidak ada data kosong
    }

    // Method 3 Mengisi data kosong dengan rata-rata tetangganya
    public void isiDataKosong() {
        int index = cariIndexKosong();
        if (index != -1 && index > 0 && index < suhuHarian.length - 1) {
            // Rumus imputasi: rata-rata suhu H-1 dan H+1
            suhuHarian[index] = (suhuHarian[index - 1] + suhuHarian[index + 1]) / 2.0;
        }
    }

    // Method 4 Menghitung rata-rata seluruh suhu
    public double hitungRataRata() {
        double total = 0;
        for (double suhu : suhuHarian) {
            total += suhu;
        }
        return total / suhuHarian.length;
    }
}