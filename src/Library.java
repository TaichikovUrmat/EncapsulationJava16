public class Library {
    private Long id;
    private String name;
    private Book[] books = new Book[100];
    private int bookCount;

    public Library() {
    }

    public Library(Long id, String name, Book[] books, int bookCount) {
        this.id = id;
        this.name = name;
        this.books = books;
        this.bookCount = bookCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }


    // TODO  add method
    public void addBook(Book book) {

        this.books[bookCount++] = book;
    }

    // TODO  get all books method
    public void getAllBooks() {
        for (int i = 0; i < bookCount; i++) {
            System.out.printf("""
                    id : %s
                    bookName: %s
                    price: %s
                    publisherYear: %s
                    authorName: %s
                    """, books[i].getId(), books[i].getBookName(), books[i].getPrice(), books[i].getPublisherYear(), books[i].getAuthorName());
        }
    }

    // TODO get by id Book
    public void getByBookId(Long bookId) {

        boolean islaik = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getId().equals(bookId)) {
                islaik = true;
                System.out.printf("""
                        id : %s
                        bookName: %s
                        price: %s
                        publisherYear: %s
                        authorName: %s
                        """, books[i].getId(), books[i].getBookName(), books[i].getPrice(), books[i].getPublisherYear(), books[i].getAuthorName());

            }
        }
        if (!islaik){
            System.out.println("Book with id " + bookId + " not found.");
        }
    }

    // TODO update  book

    public void updateBookId(Long bookId, Book newBook) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getId().equals(bookId)) {
                books[i] = newBook;
                break;
            }
        }
    }

    // TODO delete book id
    public void deleteBookId(Long bookId) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getId().equals(bookId)) {
                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];  // 100+1
                }
                bookCount--; // -1 : 100
            }
            System.out.println("delete ! ");
            break;
        }
    }


}
