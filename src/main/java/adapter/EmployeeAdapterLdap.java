package adapter;

public class EmployeeAdapterLdap implements Employee {

    private EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurName();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    public String toString(){
        return "ID: " + instance.getCn() + ", First Name: " + instance.getGivenName()
                + ", Last Name: " + instance.getSurName() + ", Email: " + instance.getMail();
    }
}
