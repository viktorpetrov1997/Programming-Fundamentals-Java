package ObjectsAndClasses.Exercises;

import java.util.Scanner;

public class Articles
{
    private String title;
    private String content;
    private String author;
    public Articles(String title, String content, String author)
    {
        this.title = title;
        this.content = content;
        this.author = author;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setContent(String content)
    {
        this.content = content;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public String getTitle()
    {
        return title;
    }
    public String getContent()
    {
        return content;
    }
    public String getAuthor()
    {
        return author;
    }

    @Override
    public String toString()
    {
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String[] articleParts = scanner.nextLine().split(", ");

        String title = articleParts[0];
        String content = articleParts[1];
        String author = articleParts[2];

        Articles article = new Articles(title,content,author);

        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < n; i++)
        {
            String[] commandArray = scanner.nextLine().split(": ");
            String command = commandArray[0];
            String newValue = commandArray[1];
            if(command.equals("Edit"))
            {
                article.setContent(newValue);
            }
            else if(command.equals("ChangeAuthor"))
            {
                article.setAuthor(newValue);
            }
            else if(command.equals("Rename"))
            {
                article.setTitle(newValue);
            }
        }
        System.out.println(article);
    }
}
