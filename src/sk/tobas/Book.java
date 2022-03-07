package sk.tobas;

public class Book {

    private final String bookName;
    private final String bookAuthor;
    private final int pageNumbers;

    public Book(String bookName, String bookAuthor, int pageNumbers) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.pageNumbers = pageNumbers;
    }

    @Override
    public String toString() {
        return "Book name : " + this.bookName;
    }
}
