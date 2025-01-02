package oops;

public class Company {

    public static void main(String[] args)
    {
        Employee emp = new Employee();
        emp.setEmpAdd("India");
        emp.setEmpName("Khyathi");
        emp.setEmpId(1);
        emp.setSalary(120000);

        System.out.println("Name "+ emp.getEmpName());
        System.out.println("Id "+emp.getEmpId());
        System.out.println("Address "+ emp.getEmpAdd() );
        System.out.println("Salary " + emp.getSalary());

        Employee emp1 = new Employee();
        emp1.setEmpAdd("India");
        emp1.setEmpName("Sanika");
        emp1.setEmpId(2);
        emp1.setSalary(140000);

        System.out.println("Name "+ emp1.getEmpName());
        System.out.println("Id "+emp1.getEmpId());
        System.out.println("Address "+ emp1.getEmpAdd() );
        System.out.println("Salary " + emp1.getSalary());
        Employee emp2 = new Employee("Khy","IN",3,45);
        System.out.println("Name "+ emp2.getEmpName());
        System.out.println("Id "+emp2.getEmpId());
        System.out.println("Address "+ emp2.getEmpAdd() );
        System.out.println("Salary " + emp2.getSalary());

        System.out.println(emp2);
    }
}
