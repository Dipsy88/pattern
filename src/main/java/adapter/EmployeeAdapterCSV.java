package adapter;

public class EmployeeAdapterCSV implements Employee {

    private EmployeeCSV instance;

    public EmployeeAdapterCSV(EmployeeCSV instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getId() + "";
    }

    @Override
    public String getFirstName() {
        return instance.getFirstName();
    }

    @Override
    public String getLastName() {
        return instance.getLastName();
    }

    @Override
    public String getEmail() {
        return instance.getLastName();
    }

    public String toString(){
        return "ID: " + instance.getId() + ", First Name: " + instance.getFirstName()
                + ", Last Name: " + instance.getLastName() + ", Email: " + instance.getEmailAddress();
    }
}
