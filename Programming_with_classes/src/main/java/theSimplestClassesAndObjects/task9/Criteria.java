package theSimplestClassesAndObjects.task9;

public interface Criteria {
    boolean isMatch(String searchString, Book book);

    static Criteria byAuthor() {
        return (searchString, book) -> book.getAuthor().equals(searchString);
    }

    static Criteria byPublishingHouse() {
        return (searchString, book) -> book.getPublishingHouse().equals(searchString);
    }

    static Criteria byYearAfterPublication() {
        return (searchString, book) -> {
            int yearAfterPublication = Integer.parseInt(searchString);
            return book.getYearOfPublishing() > yearAfterPublication;
        };
    }
}
