public class BookHandler implements IBookHandler {

    private final Book book;

    public BookHandler(Book book) {
        this.book = book;
    }

    @Override
    public void turnToNextPage() {
        this.book.turnToNextPage();
    }

}
