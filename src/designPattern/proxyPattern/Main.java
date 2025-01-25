package designPattern.proxyPattern;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            EmployeeDao employeeDao = new EmployeeDaoProxyImpl();
            employeeDao.create("USER", new Employee());
        }
        catch (Exception e){
            System.out.println("Sorry you dont hhave permission");
        }



    }
}
