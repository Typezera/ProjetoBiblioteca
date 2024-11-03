package Principal;

import Emprestimo.Loan;
import Livros.BookType;
import Usuario.User;

import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        User person = new User("Teste", 1);
        BookType book = new BookType("Dom Casmurro", "Autor 1", LocalDate.of(1899,9,20)
                , true);

        User person2 = new User("Matheus", 2);
        BookType second_book = new BookType("New Book", "Autor 2", LocalDate.of(2000,10,
                15), true);

        BookType third_book = new BookType("New Book", "Autor 3", LocalDate.of(2010,10,
                05), true);
        BookType more_book = new BookType("New Book", "Autor 3", LocalDate.of(2010,10,
                05), true);

        Loan loan = new Loan(person, book);
        Loan loan_s = new Loan(person, second_book);
        Loan loan_3 = new Loan(person, third_book);
        Loan more_loan = new Loan(person, more_book);

        loan.lendBook();
        loan_s.lendBook();
        loan_3.lendBook();
        more_loan.lendBook();
    }
}
