package Livros;

import java.awt.print.Book;
import java.time.LocalDate;
import java.util.Date;

public class BookType
{
    public String title;
    public String author;
    public LocalDate yearOfPublication;
    public boolean IsAvailability;

    public BookType(String title, String author, LocalDate date, boolean vailability)
    {
        this.title = title;
        this.author = author;
        this.yearOfPublication = date;
        this.IsAvailability = vailability;
    }
}
