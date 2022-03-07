package sk.tobas;

public class ScientificBook extends Book{

    private final String scientificArea;

    public ScientificBook(String bookName, String bookAuthor, int pageNumbers, String scientificArea) {
        super(bookName, bookAuthor, pageNumbers);
        this.scientificArea = scientificArea;
    }
}
