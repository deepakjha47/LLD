package solidPrinciple.openClosed.goodCode;

public class InvoiceFile implements InvoiceDao
{
    public void saveData(){
        System.out.println("saved in file");
    }
}
