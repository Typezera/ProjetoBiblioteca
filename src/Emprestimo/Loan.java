package Emprestimo;

import Livros.BookType;
import Usuario.User;
import java.time.LocalDate;

public class Loan
{
    private User user;
    private BookType book;
    private LocalDate loanDate;
    private LocalDate returnDate;

    public Loan(User user, BookType book)
    {
        this.user = user;
        this.book = book;
        this.loanDate = LocalDate.now();
    }

    //emprestimo de livro
    public void lendBook()
    {
        if(book.IsAvailability && user.borrowedBooks.size() < 3)
        {
            user.borrowedBooks.add(book);
            book.IsAvailability = false; //indisponivel
            System.out.println("Successfully, borrowed book!");

        }
        else{
            System.out.println("Unable to borrow the book, invalid!");
        }

    }

    public void returnBook()
    {
        user.borrowedBooks.remove(book);
        book.IsAvailability = true;
        this.returnDate = LocalDate.now();
        System.out.println("Book returned successfully");
    }
}
