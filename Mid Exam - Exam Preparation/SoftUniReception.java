package MidExam;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int firstEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int secondEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int thirdEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        int studentsPerHour = firstEmployeeEfficiency + secondEmployeeEfficiency + thirdEmployeeEfficiency;

        int timeNeeded = 0;
        int studentsAnswered = 0;

        while(studentsAnswered < numberOfStudents)
        {
            timeNeeded++;
            if(timeNeeded % 4 != 0)
            {
                studentsAnswered += studentsPerHour;
            }
        }

        System.out.printf("Time needed: %dh.", timeNeeded);
    }
}
