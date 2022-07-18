package theSimplestClassesAndObjects.task9;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<Book> books;

    public Books() {
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBooks(Book book) {
        books.add(book);
    }

    public List<Book> findBooks(Criteria criteria, String searchString) {
        List<Book> searchResult = new ArrayList<>();
        for (Book book : books) {
            if (criteria.isMatch(searchString, book)) {
                searchResult.add(book);
            }
        }
        return searchResult;
    }

    @Override
    public String toString() {
        return "Books " + books;
    }
}
