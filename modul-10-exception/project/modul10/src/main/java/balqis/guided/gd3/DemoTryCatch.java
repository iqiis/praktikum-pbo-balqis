package balqis.guided.gd3;

public class DemoTryCatch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[1];

            System.out.println(arr[1]);
            System.out.println("Baris tidak akan pernah dieksekusi");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi eksepsi karena indeks tidak valid");
        }
        System.out.println("Program selesai");
    }
}