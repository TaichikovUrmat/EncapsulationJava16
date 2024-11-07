import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         Book book = new Book(1L,"Manas",500, LocalDate.of(1998,8,24),"Kanchoro");
//
        Library library = new Library();
        // add book
        library.addBook(book);
        library.addBook(new Book(2L,"Alipe",10000, LocalDate.of(1996,8,24),"Arabaev I"));
        // TODO  get All
//        library.getAllBooks();
        library.getByBookId(2L);
        // TODO  update
//        library.updateBookId(1L,new Book(1L,"Syngan kylych",560, LocalDate.of(2016,8,24),"Kasymaly J"));
//        System.out.println("-------------------------------");
//        library.getAllBooks();
        // TODO  delete book id
//        library.deleteBookId(1L);
//        library.deleteBookId(2L);
//        library.getAllBooks();


    }
}