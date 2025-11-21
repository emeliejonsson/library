import static org.junit.jupiter.api.Assertions.*;

import models.Book;
import models.BookCatalog;
import org.junit.jupiter.api.Test;

class BookTest {
    private Book book1;
    private Book book2;

	//G
	@Test
	public void test2EqualBooks() {
    book1 = new Book(123, "Lord of the Rings", "JRR Tolkien", "123-123", "Fantasy", 500);
    book2 = new Book(123, "Lord of the Rings", "JRR Tolkien", "123-123", "Fantasy", 500);
    assertEquals(book1, book2);

    }

	//G
	@Test
	public void test2NonEqualBooks() {
        book1 = new Book(123, "Fellowship of the Ring", "JRR Tolkien", "123-123", "Fantasy", 500);
        book2 = new Book(456, "The Two Towers", "JRR Tolkien", "456-456", "Fantasy", 500);
        assertNotEquals(book1, book2);

    }

}
