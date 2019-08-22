package memento.everyday;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class MementoEverydayDemo {

    public static void serialize(Employee emp) {

        try {
            FileOutputStream fileOut = new FileOutputStream("employee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();
        } catch (IOException i){
            i.printStackTrace();
        }
    }

    public static Employee deserialize() {

        Employee emp = null;

        try {
            FileInputStream fileIn = new FileInputStream("employee.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            emp = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (ClassNotFoundException | IOException e){
            e.printStackTrace();
        }
    return emp;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Bryan Hansen");
        emp.setAddress("111 A Street");
        emp.setPhone("888-555-1212");

        serialize(emp);

        Employee newEmp = deserialize();

        System.out.println(newEmp.getName());
    }
}
