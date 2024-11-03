package Usuario;

import Livros.BookType;
import java.util.ArrayList;
import java.util.List;

public class User
{
    public String name;
    public int userId;
    public List<BookType> borrowedBooks;

    public User(String name, int userId)
    {
        this.name = name;
        this.userId = userId;
        this.borrowedBooks = new ArrayList<>();
    }
}
