/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BALQIS
 */
public class RekapNilai {
    public static void main(String[] args) {
        final double KKM = 75.0;

        String[] namaMahasiswa = {"Andi", "Budi", "Citra"};

        double[][] nilaiModul = {
            {80.0, 85.0}, 
            {70.0, 65.0}, 
            {90.0, 90.0}  
        };

        System.out.println("REKAP NILAI PRAKTIKUM");
        System.out.println("KKM: " + KKM);
        System.out.println();

        for (int i = 0; i < namaMahasiswa.length; i++) {
            double nilai1 = nilaiModul[i][0];
            double nilai2 = nilaiModul[i][1];

            double rataRata = (nilai1 + nilai2) / 2.0;

            String status;
            if (rataRata >= KKM) {
                status = "LULUS";
            } else {
                status = "REMEDIAL";
            }

            System.out.println("Mahasiswa " + (i + 1) + ": " + namaMahasiswa[i]);
            System.out.println("Nilai Modul 1: " + nilai1);
            System.out.println("Nilai Modul 2: " + nilai2);
            System.out.println("Rata-rata: " + rataRata);
            System.out.println("Status: " + status);
            System.out.println();
        }
    }
}