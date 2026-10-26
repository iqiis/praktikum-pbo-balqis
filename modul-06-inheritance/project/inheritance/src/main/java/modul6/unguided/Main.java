package modul6.unguided;

public class Main {
    public static void main(String[] args) {
        ModelUmum[] daftarModel = new ModelUmum[3];
        daftarModel[0] = new ModelRegresi("Regresi Linier", 500, 4);
        daftarModel[1] = new ModelKlasifikasi("Decision Tree", 800, 3);
        daftarModel[2] = new ModelDeepLearning("Neural Network", 1000, 5, 3);

        int totalBiaya = 0;

        for (ModelUmum model : daftarModel) {
            model.tampilkanInformasi();
            int biaya = model.hitungBiaya();
            System.out.println("Biaya komputasi: " + biaya);
            System.out.println("---");
            totalBiaya += biaya;
        }

        System.out.println("Total biaya: " + totalBiaya);

        System.out.println("Biaya 10 epoch (Neural Network): " + daftarModel[2].hitungBiaya(10));

        ModelRegresi modelRegresi = (ModelRegresi) daftarModel[0];
        System.out.println("Biaya 10 epoch (Regresi Linier): " + modelRegresi.hitungBiaya(10));
        System.out.println("Biaya 10 epoch batch 50 (Regresi Linier): " + modelRegresi.hitungBiaya(10, 50));
    }
}