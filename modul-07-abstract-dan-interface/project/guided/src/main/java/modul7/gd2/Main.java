package modul7.gd2;

public class Main {
    public static void main(String[] args) {
        Payable[] items = new Payable[2];
        items[0] = new Invoice("Watch", 1, 300000);
        items[1] = new Invoice("Bracelet", 2, 100000);

        // Dynamic dispatch
        for (Payable item : items) {
            System.out.println("jumlah yang perlu dibayar: Rp " + item.getPaymentAmount());
        }
    }

}