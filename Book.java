public class Book
{
    int BookId;
    String Title;
    String Author;
    double Price;
    static int count = 0;

    Book(int id, String title, String author, double price)
    {
        BookId = id;
        Title = title;
        Author = author;
        Price = price;
        count++;
    }

    void display()
    {
        System.out.println("Book ID: " + BookId);
        System.out.println("Title: " + Title);
        System.out.println("Author: " + Author);
        System.out.println("Price: " + Price);
    }

    void search(int id)
    {
        if(BookId == id)
            display();
        else
            System.out.println("Book ID not found");
    }

    void search(String title)
    {
        if(Title.equalsIgnoreCase(title))
            display();
        else
            System.out.println("Book Title not found");
    }

    Book costlier(Book b)
    {
        if(Price > b.Price)
            return this;
        else
            return b;
    }

    static void totalBooks()
    {
        System.out.println("Total books created: " + count);
    }

    public static void main(String[] args)
    {
        Book b1 = new Book(101,"Java","James",500);
        Book b2 = new Book(102,"Python","Guido",700);
        Book b3 = new Book(103,"C","Dennis",400);

        System.out.println("Book 1 Details:");
        b1.display();

        System.out.println("\nSearch by Book ID:");
        b1.search(101);

        System.out.println("\nSearch by Title:");
        b2.search("Python");

        System.out.println("\nCostlier Book:");
        Book b = b1.costlier(b2);
        b.display();

        System.out.println();
        Book.totalBooks();
    }
}