package sk.tobas;

import java.time.LocalDate;

public class Borrowing {

    private final Book book;
    private final Subscriber subscriber;
    private final LocalDate date;
    private LocalDate returnDate;

    public Borrowing(Book book, Subscriber subscriber, LocalDate date) {
        this.book = book;
        this.subscriber = subscriber;
        this.date = date;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}
