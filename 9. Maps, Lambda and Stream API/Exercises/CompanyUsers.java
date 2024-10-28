package MapsLambdaAndStreamAPI.Exercises;

import java.util.*;

public class CompanyUsers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> companyEmployees = new LinkedHashMap<String, List<String>>();

        String input = scanner.nextLine();
        while(!input.equals("End"))
        {
            String[] companyInfo = input.split(" -> ");
            String company = companyInfo[0];
            String employeeId = companyInfo[1];
            companyEmployees.putIfAbsent(company,new ArrayList<>());

            if(!companyEmployees.get(company).contains(employeeId))
            {
                companyEmployees.get(company).add(employeeId);
            }
            input = scanner.nextLine();
        }

        /*for (Map.Entry<String, List<String>> entry : companyEmployees.entrySet())
        {
            System.out.println(entry.getKey());
            for (String employeeId : entry.getValue())
            {
                System.out.println("-- " + employeeId);
            }
        }*/

        /*companyEmployees.entrySet().stream()
                .forEach(company -> {
                    System.out.println(company.getKey());
                    company.getValue().forEach(employee -> System.out.println("-- " + employee));
                });*/

        companyEmployees.forEach((key, value) ->
        {
            System.out.println(key);
            value.forEach(employee -> System.out.println("-- " + employee));
        });
    }
}
