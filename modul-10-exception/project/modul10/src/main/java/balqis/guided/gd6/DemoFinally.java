package balqis.guided.gd6;

public class DemoFinally {
    public static void main(String[] args) {
        int x = 3;
        int[] arr = { 10, 11, 12 };
        
        try {
            System.out.println(arr[x]);
            System.out.println("tidak ada eksepsi");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ada eksepsi");
        } finally {
            System.out.println("Program selesai");
        }
    }
}
