package solidPrinciple.openClosed.goodCode;

public class InvoiceDb implements InvoiceDao{
    public void saveData(){
        System.out.println("file saved to DB");
    }
}
