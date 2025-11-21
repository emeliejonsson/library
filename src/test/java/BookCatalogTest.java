import static org.junit.jupiter.api.Assertions.*;

import models.Book;
import models.BookCatalog;
import models.BookNotFoundException;
import org.junit.jupiter.api.Test;

public class BookCatalogTest {

    private BookCatalog bc;
    private Book book1;

    public BookCatalogTest() {
        bc = new BookCatalog();
        book1 = new Book(1, "Learning Java", "", "", "", 0);
        bc.addBook(book1);
    }

    //G
    @Test
    public void testAddABook() {
    bc.addBook(book1);
    assertEquals(book1, bc.getBookArray()[0], "Book should be at index 0");
    }

    //G
    @Test
    public void testFindBook() throws BookNotFoundException {
    bc.addBook(book1);
    Book foundBook = bc.findBook("Learning Java");
    assertEquals(book1, foundBook);
    }

    //G
    @Test
    public void testFindBookIgnoringCase() throws BookNotFoundException {
    bc.addBook(book1);
    Book foundBook = bc.findBook("LEARNING JAVA");
    assertEquals(book1, foundBook);
    }

    //G
    @Test
    public void testFindBookWithExtraSpaces() {
    bc.addBook(book1);
    
    }

    //VG
    // This test should throw BookNotFoundException in order to pass.
    @Test
    public void testFindBookThatDoesntExist() throws BookNotFoundException {

    }

}
