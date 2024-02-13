package TextProcessing.Exercises;

import java.util.Scanner;

public class ExtractFile
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String[] filePath = scanner.nextLine().split("\\\\");

        String fullFileName  = filePath[filePath.length - 1];

        String[] fileAndExtension = fullFileName.split("\\.");

        String fileName = fileAndExtension[0];
        String extension = fileAndExtension[1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extension);
    }
}
