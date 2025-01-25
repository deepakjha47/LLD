package designPattern.proxyPattern;

public class EmployeeDaoImpl implements EmployeeDao{


    @Override
    public void create(String client, Employee obj) throws Exception {
        System.out.println("Created object");
    }
}
