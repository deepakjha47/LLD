package designPattern.solidPrinciple.singleResponsibility.goodCode;

public class Main {
    public static void main(String[] args) {
        Marker marker = new Marker(10, 10);
        CalculateInvoice calculateInvoice = new CalculateInvoice();
        calculateInvoice.calculateTotal(marker);
    }
}
