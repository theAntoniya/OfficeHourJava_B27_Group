package day_11_09_21_2022.databases;

import day_11_09_21_2022.objects.Employee;
import day_11_09_21_2022.services.DatabaseService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OracleDatabes implements DatabaseService {

    List<Employee> oracleDatabase = new ArrayList<>();


    @Override
    public void addEmployee(Employee employee) {
        oracleDatabase.add(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        oracleDatabase.removeIf(emp -> emp.getEmplyeeId() == id);
    }

    @Override
    public Employee getEmployee(Long id) {
        for (Employee employee : oracleDatabase) {
            if (employee.getEmplyeeId()==id)
                return employee;
        }
        System.out.println("in database there is no this record");
        return null;
    }

    @Override
    public List<Employee> getEmployees() {
    return oracleDatabase;
    }

    @Override
    public List<String> getAllEmployeesNames() {
        List<String> names = new ArrayList<>();
        for(Employee eachEmployee : oracleDatabase){
            names.add(eachEmployee.getName());
        }
        return names;
    }

    @Override
    public List<String> getUniqueEmployeeNames() {
        // I need to get all employee names from the database
        //I can use ready methods which is getAllEmployeesNames()
        //I need to put inside the set in order to  get the unique ones
        // I need to convert my set of names to list of names
        Set<String> uniqueNames=new HashSet<>(getAllEmployeesNames());
       return new ArrayList<>(uniqueNames);

        /*

        Aaron,Adam,Adam,Friyat,Alec
        Aaron,Adam,Friyat,Alec
         */

//break till 04:18 PM


    }
}
