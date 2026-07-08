package builtindemo;


import java.sql.Connection;
import java.lang.Object;
import java.sql.SQLException;


class Employee implements Cloneable  {

    Connection con;
    private int id;
    private String name;

    Employee(){

    }

    Employee(int empid,String name){

        this.id = empid;
        this.name = name;
        //approch to create DB connection
    }

    // getters, setters, etc.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int hashCode(){

        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return id == employee.id && name.equalsIgnoreCase(employee.name) ;
    }


}

public class BuilItClassesDemo  extends Object
{


    @Override
    public int hashCode(){

        return (int)(Math.random()*10000);
    }


    public static void main(String[] args) {

        BuilItClassesDemo obj = new BuilItClassesDemo();
        Class c=  obj.getClass();
        System.out.println(c);



        System.out.println(obj.hashCode());

        Employee employee1 = new Employee();
        employee1.setId(122);
        employee1.setName("Mounika");

        Employee employee2 = new Employee(123,"Usha");

        Employee employee3 = employee1.clone();


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        boolean isSame = (employee1.equals(employee3));

        System.out.println(isSame);
    }

}
