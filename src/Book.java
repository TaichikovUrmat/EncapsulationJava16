import java.time.LocalDate;

public class Book {
    private Long id;
    private String bookName;
    private int price;
    private LocalDate publisherYear;
    private String authorName;

//    public Book(){}

    public Book(Long id, String bookName, int price, LocalDate publisherYear, String authorName){
        this.id = id;
        this.bookName = bookName;
        this.price= price;
        this.publisherYear = publisherYear;
        this.authorName = authorName;
    }

    public Long getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getPublisherYear() {
        return publisherYear;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPublisherYear(LocalDate publisherYear) {
        this.publisherYear = publisherYear;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void getInfo(){
        System.out.printf("""
                    private Long id : %s
                    private String bookName: %s
                    private int price: %s
                    private LocalDate publisherYear: %s
                    private String authorName: %s
                """,id,bookName,price,publisherYear,authorName);
    }




}
