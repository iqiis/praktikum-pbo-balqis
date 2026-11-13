package modul9.unguided;

public class ModelExperiment implements Comparable<ModelExperiment> {
    private String namaModel;
    private double akurasi;
    private int waktuTraining;
    private static int jumlahEksperimen = 0;

    public ModelExperiment(String namaModel, double akurasi, int waktuTraining) {
        this.namaModel = namaModel;
        this.akurasi = akurasi;
        this.waktuTraining = waktuTraining;
        jumlahEksperimen++;
    }

    public String getNamaModel() {
        return namaModel;
    }

    public double getAkurasi() {
        return akurasi;
    }

    public int getWaktuTraining() {
        return waktuTraining;
    }

    public static int getJumlahEksperimen() {
        return jumlahEksperimen;
    }

    @Override
    public String toString() {
        return "Model=" + namaModel + ", akurasi=" + akurasi + ", waktu=" + waktuTraining + " detik";
    }

    @Override
    public int compareTo(ModelExperiment other) {
        return Double.compare(other.akurasi, this.akurasi);
    }
}