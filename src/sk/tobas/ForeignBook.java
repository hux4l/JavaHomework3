package sk.tobas;

public class ForeignBook extends Book {

    private String bookLanguage = "English";

    public ForeignBook(String bookName, String bookAuthor, int pageNumbers) {
        super(bookName, bookAuthor, pageNumbers);
    }

    public ForeignBook(String bookName, String bookAuthor, int pageNumbers, String bookLanguage) {
        super(bookName, bookAuthor, pageNumbers);
        this.bookLanguage = bookLanguage;
    }
}
