package solidPrinciple.openClosed.goodCode;

public class Main {
    public static void main(String[] args) {
        InvoiceDao invoiceDao = new InvoiceDb();

        invoiceDao.saveData();
    }
}
