package modul5.guided.agregasi;

public class Jurusan {
    private String KodeJurusan, NamaJurusan;
    private Mahasiswa[] daftarMahasiswa = new Mahasiswa[32];
    private int jumlahMahasiswa = 0;

    public Jurusan(String kode, String nama) {
        this.KodeJurusan = kode;
        this.NamaJurusan = nama;
    }

    public void AddMahasiswa(Mahasiswa m) {
        this.daftarMahasiswa[jumlahMahasiswa] = m;
        jumlahMahasiswa++;
    }

    public void DisplayMahasiswa() {
        System.out.println("Kode Jurusan : " + this.KodeJurusan);
        System.out.println("Nama Jurusan : " + this.NamaJurusan);
        System.out.println("Daftar Mahasiswa :");

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println(i + 1 + ". " + daftarMahasiswa[i].GetNIM() + " " + daftarMahasiswa[i].GetNama());
        }
    }
    //getter
    public String GetKodeJurusan() {
        return KodeJurusan;
    }

    public String GetNamaJurusan() {
        return NamaJurusan;
    }
    //setter
    public void SetKodeJurusan(String kode) {
        this.KodeJurusan = kode;
    }

    public void SetNamaJurusan(String nama) {
        this.NamaJurusan = nama;
    }
}