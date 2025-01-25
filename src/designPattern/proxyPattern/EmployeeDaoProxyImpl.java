package designPattern.proxyPattern;

public class EmployeeDaoProxyImpl implements EmployeeDao{
    EmployeeDaoImpl employeeDaoImpl;
    EmployeeDaoProxyImpl(){
        employeeDaoImpl = new EmployeeDaoImpl();
    }
    @Override
    public void create(String client, Employee obj) throws Exception {
        if(client == "ADMIN") {
            employeeDaoImpl.create(client, obj);
            return;
        }
        throw new Exception("Access Denied");
    }
}
