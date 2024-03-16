package ObjectsAndClasses.MoreExercises.CompanyRoadster;

import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < N; i++)
        {
            String input = scanner.nextLine();

            List<String> employeeInfo = Arrays.stream(input.split(" ")).collect(Collectors.toList());

            String name = employeeInfo.get(0);
            double salary = Double.parseDouble(employeeInfo.get(1));
            String position = employeeInfo.get(2);
            String department = employeeInfo.get(3);

            Employee employee = new Employee(name,salary,position,department);

            if(employeeInfo.size() == 5)
            {
                if(input.contains("@"))
                {
                    employee.setEmail(employeeInfo.get(4));
                }
                else
                {
                    employee.setAge(Integer.parseInt(employeeInfo.get(4)));
                }
            }
            else if(employeeInfo.size() == 6)
            {
                employee.setEmail(employeeInfo.get(4));
                employee.setAge(Integer.parseInt(employeeInfo.get(5)));
            }

            employeeList.add(employee);
        }

        String department = "";
        double highestAverageSalary = 0;
        double sum = 0;
        double count = 0;
        for(Employee employee1 : employeeList)
        {
            for(Employee employee2 : employeeList)
            {
                if(employee1.getDepartment().equals(employee2.getDepartment()))
                {
                    sum += employee2.getSalary();
                    count++;
                }
            }
            if(sum / count > highestAverageSalary)
            {
                highestAverageSalary = sum / count;
                department = employee1.getDepartment();
            }
        }

        System.out.printf("Highest Average Salary: %s%n",department);

        employeeList.sort(Comparator.comparing(Employee::getSalary).reversed());

        for(Employee employee : employeeList)
        {
            if(employee.getDepartment().equals(department))
            {
                System.out.println(employee);
            }
        }
    }
}
