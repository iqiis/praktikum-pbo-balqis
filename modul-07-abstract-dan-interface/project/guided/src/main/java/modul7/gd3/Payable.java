package modul7.gd3;

public interface Payable {
    double getPaymentAmount();

    default void printReceipt() {
        System.out.println("Struk Resi - Total: Rp" + getPaymentAmount());
    }

    static void logTransaction(String message) {
        System.out.println("[AUDIT LOG]" + message);
    }
}
