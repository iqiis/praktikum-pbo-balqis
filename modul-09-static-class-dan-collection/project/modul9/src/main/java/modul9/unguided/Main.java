package modul9.unguided;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<ModelExperiment> listModel = new ArrayList<>();

        listModel.add(new ModelExperiment("Logistic Regression", 0.82, 12));
        listModel.add(new ModelExperiment("Random Forest", 0.91, 45));
        listModel.add(new ModelExperiment("SVM", 0.87, 60));
        listModel.add(new ModelExperiment("KNN", 0.79, 5));
        listModel.add(new ModelExperiment("Decision Tree", 0.84, 8));

        // Jumlah eksperimen menggunakan static method
        System.out.println("Jumlah eksperimen: " + ModelExperiment.getJumlahEksperimen());

        // Mengurutkan berdasarkan akurasi tertinggi (Comparable)
        Collections.sort(listModel);
        System.out.println("\nSorted by akurasi");
        listModel.forEach(System.out::println);

        // Mengurutkan berdasarkan waktu training tercepat (Comparator)
        Collections.sort(listModel, new TrainingTimeComparator());
        System.out.println("\nSorted by waktu training");
        listModel.forEach(System.out::println);

        // Filtering model dengan akurasi minimal 0.85 menggunakan lambda
        System.out.println("\nModel dengan akurasi minimal 0.85");
        List<ModelExperiment> highAccuracyModels = listModel.stream()
                .filter(m -> m.getAkurasi() >= 0.85)
                .collect(Collectors.toList());
        highAccuracyModels.forEach(System.out::println);

        // Mencari model bernama "KNN" menggunakan lambda
        System.out.println("\nPencarian model KNN");
        ModelExperiment knnModel = listModel.stream()
                .filter(m -> m.getNamaModel().equals("KNN"))
                .findFirst()
                .orElse(null);
        System.out.println(knnModel);
    }
}