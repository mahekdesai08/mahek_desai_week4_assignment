package Xenosis_Internship.Assignment4.Q2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class employeeInfo {
    public static void main(String[] args) {
        Map<Integer,employee> employee = new HashMap<>();
        employee.put(101,new employee(101 ,"Mahek Desai","backend developer",50000));
        employee.put(102,new employee(102,"abc","python developer",40000));
        employee.put(103,new employee(103,"xyz","frontend developer",35000));
        employee.put(104,new employee(104,"pqr","java developer",60000));

        //System.out.println("Enter employee id to get details of employee");
        Scanner sc= new Scanner(System.in);
        System.out.println("How many employee details you want to get ?? ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            int id = sc.nextInt();
            employee employee1 = employee.get(id);
            if (employee1 != null) {
                System.out.println("Employee Id : "+employee1.getEmpId());
                System.out.println("Employee Name : "+employee1.getEmpName());
                System.out.println("Employee Position : "+employee1.getPosition());
                System.out.println("Employee Salary : "+employee1.getSalary());
                System.out.println("==========================================");
            } else {
                System.out.println("Employee is not found , try again!!");
            }
        }
        System.out.println("Enter id which you want to remove ");
        int id=sc.nextInt();
        employee.remove(id);
        System.out.println("employee removed successfully");
        System.out.println("After removed employee list is : "+employee);
    }
}
